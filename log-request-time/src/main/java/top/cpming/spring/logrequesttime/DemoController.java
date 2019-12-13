package top.cpming.spring.logrequesttime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        logger.info("test");
        return "test";
    }
}
