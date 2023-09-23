package eduard.zaripov.simpleonegetservice;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SimpleController {
    private final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    private int counter = 1;

    @GetMapping("/get-hello")
    public ResponseEntity<String> getHello(HttpServletRequest request) {
        counter++;
        if (counter % 17 == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        logger.info("GET for hello from: {}", request.getRemoteAddr());
        return ResponseEntity.of(Optional.of("Hello!"));
    }
}
