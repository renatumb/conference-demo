package com.pluralsight.conferencedemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

public class versionController {

    @RequestMapping("/")
    public Date date() {
        return new Date();
    }
}
