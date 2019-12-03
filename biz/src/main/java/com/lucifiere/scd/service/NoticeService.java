package com.lucifiere.scd.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeService {

    @RequestMapping("/getNotice")
    public String getPrintTestInfo() {
        return "there is notice content";
    }

}
