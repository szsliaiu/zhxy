package com.htre.zhxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching //开启缓存支持
public class ZhxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhxyApplication.class, args);
	}

}
