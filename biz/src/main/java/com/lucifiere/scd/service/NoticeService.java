package com.lucifiere.scd.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notice")
public class NoticeService {

    @GetMapping("/getNotice")
    public String getPrintTestInfo() {
        return "there is notice content";
    }

}
