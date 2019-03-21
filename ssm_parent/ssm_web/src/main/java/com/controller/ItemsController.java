package com.controller;

import com.domain.Items;
import com.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService service;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items items = service.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
