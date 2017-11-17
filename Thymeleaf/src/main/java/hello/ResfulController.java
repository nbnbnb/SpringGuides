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
        String a = "aaa";
        String b = "bbb";

        String c = String.valueOf((a.length() / 2 + b.length()));

        return "Hello World! gggg" + c + LocalDateTime.now();
    }
}
