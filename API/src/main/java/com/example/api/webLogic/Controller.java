package com.example.api.webLogic;

import javax.servlet.annotation.HttpMethodConstraint;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(name = "/Controller", value = "/Controller")
public class Controller {

    @HttpMethodConstraint(value = "get")
    @CrossOrigin

    @RequestMapping(name = "/listOfNames", value = "/listOfNames", method = RequestMethod.GET, produces = "application/json")
    public ListChars listChars(@RequestParam(value = "name", required = false,
            defaultValue = "Rick") String name) {
        return new ListChars(name);
    }

    @HttpMethodConstraint(value = "get")
    @CrossOrigin

    @RequestMapping("/selectRandom")
    public RandChar randChar() {
        return new RandChar();
    }
}
