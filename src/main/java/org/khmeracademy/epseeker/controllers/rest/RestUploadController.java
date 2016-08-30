package org.khmeracademy.epseeker.controllers.rest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	@RequestMapping(value = "/rest/uploadphoto", method = RequestMethod.POST)
	public Image uploadSinglePhoto(@RequestParam("files") MultipartFile file) {

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
						new FileOutputStream(new File(originalSavePath + filename)));
				stream.write(bytes);
				stream.close();
				try {
					// BufferedImage watermarkImage = ImageIO.read(new
					// File("543a6de1-728e-4fe2-afa5-657084ff0001.jpg"));
					// TODO: USING THUMBNAILS TO RESIZE THE IMAGE
					Thumbnails.of(originalSavePath + filename).forceSize(300, 300).toFiles(thumbnailPath,
							Rename.NO_CHANGE);
				} catch (Exception ex) {

					stream = new BufferedOutputStream(new FileOutputStream(new File(thumbnailSavePath + filename)));
					stream.write(bytes);
					stream.close();
				}
				System.out.println("Present Project Directory : " + originalSavePath + filename);
				image.setOriginalImage("http://localhost:3333/resources/" + filename);
				image.setThumbnailImage("http://localhost:3333/resources/thumbnails/" + filename);
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

	@RequestMapping(value = "/rest/uploadfile", method = RequestMethod.POST)
	public Map<String, Object> uploadMultipleFiles(@RequestParam("files") List<MultipartFile> files) {
		System.out.println("Called");
		System.out.println(files.size());
		Map<String, Object> fileURL = new HashMap<>();
		for (int i = 0; i < files.size(); i++) {
			// Image image = new Image();
			System.out.println("FILE=" + files.get(i).getOriginalFilename());

			String filename = "";

			if (!files.get(i).isEmpty()) {

				String originalSavePath = "/opt/files/";
				try {
					filename = files.get(i).getOriginalFilename();
					System.out.println(filename);

					byte[] bytes = files.get(i).getBytes();

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

					filename = randomUUIDFileName + "." + extension;

					BufferedOutputStream stream = new BufferedOutputStream(
							new FileOutputStream(new File(originalSavePath + filename)));
					stream.write(bytes);
					stream.close();

					System.out.println("Present Project Directory : " + originalSavePath + filename);
					// image.setOriginalImage("http://localhost:3333/files/" +
					// filename);
					fileURL.put("FILE_PATH" + (i + 1), "/files/" + filename);
					System.out.println("You successfully uploaded " + originalSavePath + filename + "!");
				} catch (Exception e) {
					System.out.println("You failed to upload " + filename + " => " + e.getMessage());
					fileURL.put("FILE_PATH", "FILE_URL" + originalSavePath + File.separator + filename);
				}
			} else {
				System.out.println("You failed to upload " + filename + " because the file was empty.");

			}
		}
		return fileURL;

	}

	public static void main(String args[]) {
		File file = new File("/opt/files/e4c5b0d0-b66b-48a2-b63f-bc2dff5517e9.pdf");
		file.delete();

	}

}
