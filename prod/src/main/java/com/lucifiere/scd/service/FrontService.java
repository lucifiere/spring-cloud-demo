package com.lucifiere.scd.service;

import com.lucifiere.scd.sal.PrintSal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontService {

    @Autowired
    private PrintSal printSal;

    @RequestMapping("printNotice")
    public String printNotice() {
        return printSal.getNotice();
    }

}
