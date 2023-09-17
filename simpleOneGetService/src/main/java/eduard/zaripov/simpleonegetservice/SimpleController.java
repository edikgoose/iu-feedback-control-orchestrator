package eduard.zaripov.simpleonegetservice;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    private final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @GetMapping("/get-hello")
    public String getHello(HttpServletRequest request) {
        logger.info("GET for hello from: {}", request.getRemoteAddr());
        return "Hello!";
    }
}
