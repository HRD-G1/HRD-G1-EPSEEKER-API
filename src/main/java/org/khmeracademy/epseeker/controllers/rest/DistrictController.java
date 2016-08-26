package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.District;
import org.khmeracademy.epseeker.services.DistrictService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
public class DistrictController {

	@Autowired
	DistrictService districtService;

	@RequestMapping(value = "/rest/district", method = RequestMethod.GET)
	@ApiImplicitParams({ @ApiImplicitParam(name = "page", paramType = "query", defaultValue = "1"),
			@ApiImplicitParam(name = "limit", paramType = "query", defaultValue = "1") })
	Map<String, Object> findAll(Pagination pagination) {
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("PAGINATION", pagination);
		map.put("DATA", districtService.findAl(pagination));
		return map;
	}

	@RequestMapping(value = "/rest/district/{provinceID}", method = RequestMethod.GET)
	Map<String, Object> findAllByProvinceID(@PathVariable("provinceID") int provinceID) {
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", districtService.findAllByProvinceID(provinceID));
		return map;
	}

	@RequestMapping(value = "/rest/district", method = RequestMethod.POST)
	Map<String, Object> save(@RequestBody District district) {

		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", districtService.save(district));
		return map;
	}

	@RequestMapping(value = "/rest/district", method = RequestMethod.PUT)
	Map<String, Object> update(@RequestBody District district) {
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", districtService.update(district));
		return map;
	}

	@RequestMapping(value = "/rest/district/{districtID}", method = RequestMethod.DELETE)
	Map<String, Object> delete(@PathVariable("districtID") int districtID) {
		Map<String, Object> map = new HashMap<>();
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", districtService.delete(districtID));
		return map;
	}
}
