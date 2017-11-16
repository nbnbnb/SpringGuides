package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppThymeleaf extends SpringBootServletInitializer {

    /*
    Spring Boot 的启动器
     */
    public static void main(String[] args) {
        SpringApplication.run(AppThymeleaf.class, args);
    }


    /*
    寄宿在 Tomcat 等容器中的启动器
    重写的 SpringBootServletInitializer 方法
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(AppThymeleaf.class);
    }
}
