package com.duo.ranking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RankingController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}