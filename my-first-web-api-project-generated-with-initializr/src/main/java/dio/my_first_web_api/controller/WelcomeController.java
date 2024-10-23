package dio.my_first_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to my Spring application 123";
    }
}
