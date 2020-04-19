package com.lucifiere.scd.sal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("notice-service")
@RequestMapping("notice")
public interface NoticeSal {

    @GetMapping("getNotice")
    String getNotice();

}
