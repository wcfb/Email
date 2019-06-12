package wcfb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wcfb on 2019/6/8
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        String res = "hello";
        System.out.println(res);
        return res;
    }
}
