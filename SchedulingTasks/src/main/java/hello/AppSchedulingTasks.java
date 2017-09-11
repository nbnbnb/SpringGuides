package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableScheduling
public class AppSchedulingTasks {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppSchedulingTasks.class);
    }

    @PostConstruct
    void init() {
        // 在 SchedulingTasks 目录下运行 mvn:srping-boot:run
        // 当修改类文件时，会自动编译加载
        System.out.println("-----hello world------" + LocalDateTime.now());
    }
}