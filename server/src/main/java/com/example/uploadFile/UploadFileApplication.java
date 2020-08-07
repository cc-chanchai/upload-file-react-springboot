package com.example.uploadFile;

import com.example.uploadFile.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class UploadFileApplication implements CommandLineRunner {

	@Resource
	FilesStorageService filesStorageService;

	public static void main(String[] args) {
		SpringApplication.run(UploadFileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		filesStorageService.deleteAll();
		filesStorageService.init();
	}
}
