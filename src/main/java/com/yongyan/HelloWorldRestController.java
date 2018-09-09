package com.yongyan;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yongyan on 09/08/2018
 */

@RestController
public class HelloWorldRestController {


    @RequestMapping("/")
    public String welcome() {
        return "Hi, this is your first spring application here";
    }

    @RequestMapping(value = "/msg/{key}", method = RequestMethod.GET)
    public Message showMessage(@PathVariable String key) {
        Message msg = new Message(key, "you are so awesome");
        return msg;
    }
}
