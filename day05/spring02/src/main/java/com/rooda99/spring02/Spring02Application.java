package com.rooda99.spring02;

import java.io.FileOutputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		// 파일쓰기
		FileOutputStream output = new FileOutputStream("C:\\temp\\test.txt");
		// ...
		output.close();
		System.out.println("파일 생성 완료!");
	}

}
