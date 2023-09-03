package eduard.zaripov.simpleonegetservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/get-hello")
    public String getHello() {
        return "Hello!";
    }
}
