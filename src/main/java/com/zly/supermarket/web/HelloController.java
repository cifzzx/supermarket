package com.zly.supermarket.web;

import com.alibaba.fastjson.JSON;
import com.zly.supermarket.data.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        UserInfo userInfo = new UserInfo();
        userInfo.setCode(1);
        userInfo.setMsg("请求成功");

        UserInfo.Data data = new UserInfo.Data();
        data.setName("李江明");
        data.setAge(24);

        userInfo.setInfo(data);

        String json = JSON.toJSONString(userInfo);

        return json;
    }

}
