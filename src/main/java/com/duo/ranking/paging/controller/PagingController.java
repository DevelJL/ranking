package com.duo.ranking.paging.controller;

import java.util.List;

import com.duo.ranking.common.Pagination;
import com.duo.ranking.paging.domain.PagingVO;
import com.duo.ranking.paging.service.PagingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagingController {

    @Autowired
    private PagingService serv;

    @RequestMapping("/paging")
    public String paging(Model model, @RequestParam(required = false, defaultValue = "0") int currentPage) {
        Pagination page = new Pagination();
        page.setCurrentPage(1);
        if(currentPage != 0){
            page.setCurrentPage(currentPage);
        }
        page.setTotalRecord(serv.totlaPaging());

        System.out.println(page.getFirstPage());
        System.out.println(page.getLastPage());

        List<PagingVO> list = serv.pagingGo(page);
        model.addAttribute("page", page);
        model.addAttribute("list", list);
        return "paging";
    }
}