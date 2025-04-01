package com.spring02.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner; //콘솔 입력받을 클래스 선언

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Scanner scan = new Scanner(System.in);

		System.out.print(">>아이디 입력 :");
		String userid = scan.next();
		System.out.print(">>비밀번호 입력 :");
		String passwd = scan.next();


		System.out.println("입력 아이디 -->" + userid);
		System.out.println("입력 비밀번호 -->" + passwd);


		//if 문 연습
		if (userid.equals("rooda99") && passwd.equals("lee")){
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인실패! 아이디 또는 비밀번호 오류");
		}

		//switch문 연습
		switch (passwd) {
			case "lee" :
				System.out.println("패스워드 변경요망");
				break;
			case "le" :
				System.out.println("패스워드 오류");
			case "l" :
				System.out.println("패스워드 오류2");
				break;
			default:
				System.out.println("전체오류");
				break;

		}

		//3항연산 연습
		String result = (passwd.equals("lee")) ? "메인화면진입" : "로그인화면으로";
		System.out.println("다음화면 >>" + result);
	}

}
