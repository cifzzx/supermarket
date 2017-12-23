package com.zly.supermarket.web;

import com.alibaba.fastjson.JSON;
import com.zly.supermarket.data.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name){

        UserInfo userInfo = new UserInfo();
        userInfo.setCode(1);
        userInfo.setMsg("请求成功");

        UserInfo.Data data = new UserInfo.Data();
        data.setName(name);
        data.setAge(24);

        userInfo.setInfo(data);

        String json = JSON.toJSONString(userInfo);

        return json;
    }

}
