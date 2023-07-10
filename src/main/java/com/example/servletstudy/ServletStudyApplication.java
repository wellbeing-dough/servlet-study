package com.example.servletstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan	//스프링이 자동으로 현재 패키지를 포함해서 하위 패키지를 뒤져서 서블릿들을 찾는다 그리고 자동으로 서블릿에 등록해서 실행할 수 있게
@SpringBootApplication
public class ServletStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletStudyApplication.class, args);
	}

}
