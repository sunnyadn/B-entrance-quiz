package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//TODO GTB-综合: * 整体来说很好。某些细节上的问题见具体comments。
//TODO GTB-完成度: * 整体完成度不错，维度 group 里没有 name，有点遗憾
//TODO GTB-工程实践: * 建议开始使用 lombok
//TODO GTB-测试: * 没有测试。
//TODO GTB-知识点: * 整体没有太问题。

@SpringBootApplication
public class GtbEntranceQuizApplication {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:1234");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}
