package org.khmeracademy.epseeker.controllers.rest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.khmeracademy.epseeker.entities.Image;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;



@RestController
public class RestUploadController {

	@RequestMapping(value="/rest/uploadphoto", method=RequestMethod.POST)
	public Image uploadSingleFile(@RequestParam MultipartFile file){

		Image image = new Image();
		System.out.println("FILE=" + file.getOriginalFilename());
		
		String filename = "";
		Map<String, Object> map = new HashMap<String, Object>();
		if (!file.isEmpty()) {
			
			String originalSavePath = "/opt/images/";
			String thumbnailSavePath = "/opt/images/thumbnails/";
			try {
				filename = file.getOriginalFilename();
				
				byte[] bytes = file.getBytes();
				
				// UNIQUE UNIVERSAL ID
				UUID uuid = UUID.randomUUID();
				
				String randomUUIDFileName = uuid.toString();
				
				String extension = filename.substring(filename.lastIndexOf(".") + 1);
				
				System.out.println(originalSavePath);
				
				File originalPath = new File(originalSavePath);
				
				if (!originalPath.exists()) {
					System.out.println("NOT EXISTS");
					originalPath.mkdirs();
				}
				
				File thumbnailPath = new File(thumbnailSavePath);
				
				if (!thumbnailPath.exists()) {
					System.out.println("NOT EXISTS");
					thumbnailPath.mkdirs();
				}
				
				filename = randomUUIDFileName + "." + extension;
				
				
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File( System.getProperty("user.dir")+originalSavePath + filename)));
				stream.write(bytes);
				stream.close();
				try {
//					BufferedImage watermarkImage = ImageIO.read(new File("543a6de1-728e-4fe2-afa5-657084ff0001.jpg"));
					//TODO: USING THUMBNAILS TO RESIZE THE IMAGE
					Thumbnails.of( System.getProperty("user.dir")+originalSavePath + filename)
						.forceSize(300, 300)
						.toFiles(thumbnailPath, Rename.NO_CHANGE);
				} catch (Exception ex) {
					
					stream = new BufferedOutputStream(new FileOutputStream(new File(thumbnailSavePath +  filename)));
					stream.write(bytes);
					stream.close();
				}
				System.out.println("Present Project Directory : "+  System.getProperty("user.dir")+originalSavePath + filename);
				image.setOriginalImage("http://localhost:3333" + originalSavePath + filename);
				image.setThumbnailImage("http://localhost:3333" + thumbnailSavePath + filename);
				System.out.println("You successfully uploaded " + originalSavePath + filename + "!");
				return image;
			} catch (Exception e) {
				System.out.println("You failed to upload " + filename + " => " + e.getMessage());
				map.put("IMAGE_URL", originalSavePath + File.separator + filename);
				return image;
			}
		} else {
			System.out.println("You failed to upload " + filename + " because the file was empty.");
			return image;
		}
		
	}
	
//	@RequestMapping(value="/rest/uploadtest", method=RequestMethod.POST)
//	public String updateTest(@RequestParam("file") CommonsMultipartFile file){
//		return file.getOriginalFilename();
//	}
}
