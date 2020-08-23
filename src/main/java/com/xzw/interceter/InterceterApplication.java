package com.xzw.interceter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = "com.xzw.interceter",exclude = DataSourceAutoConfiguration.class)
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@MapperScan("com.xzw.interceter.mapper")
public class InterceterApplication {
    public static void main(String[] args) {
        SpringApplication.run(InterceterApplication.class, args);
    }

}
