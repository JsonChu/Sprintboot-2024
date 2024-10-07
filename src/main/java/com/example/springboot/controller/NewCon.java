package com.example.springboot.controller;

import com.example.springboot.bean.New;
import com.example.springboot.service.impl.OldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cmsxyz@163.com
 * @date 2024-10-08 0:20
 * @usage
 */
@RestController
public class NewCon {
    @Autowired
    private OldServiceImpl oldService;
    @PostMapping("/copy")
    public String copyData( ){
        oldService.copyData();
        return "yes";
    }
}
