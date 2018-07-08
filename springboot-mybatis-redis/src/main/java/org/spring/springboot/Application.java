package org.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring Boot 应用启动类
@SpringBootApplication                          // Spring Boot 应用的标识
@MapperScan("org.spring.springboot.dao")        // mapper 接口类扫描包配置，必须添加该配置，否则Spring Boot应用找不到对应的Mapper接口
public class Application {

    public static void main(String[] args) {
        // 程序启动入口，启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);
    }

}
