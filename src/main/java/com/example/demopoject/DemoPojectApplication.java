package com.example.demopoject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication(scanBasePackages = {"com.example.demopoject.demo"}, exclude= DataSourceAutoConfiguration.class)
@MapperScan("com.example.demopoject")
public class DemoPojectApplication extends SpringBootServletInitializer {

	/**
	 * 外部容器加载springboot项目配置，继承SpringBootServletInitializer
	 * http://www.baowenwei.com/post/spring/ji-ci-springboot-bu-shu-dao-resinrong-qi
	 *
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoPojectApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoPojectApplication.class, args);
	}

}
