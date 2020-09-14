package com.duo.ranking.uni.controller;

import java.util.List;

import com.duo.ranking.uni.domain.UniVO;
import com.duo.ranking.uni.service.UniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UniController {

    @Autowired
    private UniService uniServ;

    @RequestMapping("/uni")
    public String uni(Model model){
        List<UniVO> list = uniServ.selectUni();
        model.addAttribute("list", list);
        return "uni";
    }
}