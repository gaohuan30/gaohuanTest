package com.gaohuan;

import com.gaohuan.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaohuan on 2017/7/20.
 */
@RestController
public class HelloController {

    @Autowired
    private Girl girl;

    @RequestMapping(value = "hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String Hello(){
        return girl.toString();
    }
}
