package com.springboot.study.controller;

import com.springboot.study.service.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @Author wp
 * @date 2018/10/29 15:44
 */
@RestController
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("/hello")
    public String index() {
        return null;
    }

    @RequestMapping("/redis")
    public String redis() {
        redisUtil.set("key1", "value1");
        return "123";
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session, String userId) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        logger.info("uid = {}", uid.toString());
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
