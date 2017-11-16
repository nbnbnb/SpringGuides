package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by ZhangJin on 2017/11/16.
 */
@RestController
public class ResfulController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! gggg" + LocalDateTime.now();
    }
}
