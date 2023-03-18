package com.xworkz.nailpolish.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class ImageController {

	public ImageController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@PostMapping("/upload")
	public String onUpload(@RequestParam("file") MultipartFile multipartFile, Model model) {
		
		if(multipartFile.isEmpty()) {
			System.out.println("file is not there, select the file");
			model.addAttribute("errormessage","Please select the file");
			return "UploadImage";
		}
		
		try {
		
		System.out.println("MultipartFile" + multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println(multipartFile.getSize());
		System.out.println(multipartFile.getBytes());
		
		model.addAttribute("successmessage","File is successfully uploaded '"+multipartFile.getOriginalFilename());
		
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("D:\\sana\\" + multipartFile.getOriginalFilename());
			Files.write(path, bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "UploadImage";
		
}

      @GetMapping("/download")//https://localhost:8082/sahanaXworkz/download
         public void onDownload(HttpServletResponse response,@RequestParam String fileName) throws IOException {
        response.setContentType("image/jpeg");
       File file = new File("D:\\sana\\" + fileName);
      
       //file into bytes--->response
       InputStream in = new BufferedInputStream(new FileInputStream(file));
       ServletOutputStream out = response.getOutputStream();
       IOUtils.copy(in, out);
       response.flushBuffer();
        
      }
      
}
