package com.imooc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * FileName: HelloController
 * Author:   刘帅
 * Date:     2019-5-30 13:50
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;
    @GetMapping("/say")
    public String say(@RequestParam("id")Integer id){
        /*return "说明："+limitConfig.getDescription();*/
        return "id:"+id;
    }
}
