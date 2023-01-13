package com.maxcim.fahrgastinformationssystem.controllers;

import com.maxcim.fahrgastinformationssystem.services.AbfahrtService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AbfahrtController {
    private final AbfahrtService abfahrtService;

    public AbfahrtController(AbfahrtService abfahrtService) {
        this.abfahrtService = abfahrtService;
    }

    @RequestMapping({"abfahrten.html","/abfahrten.html"})
    public String showList(Model model) {
        model.addAttribute("abfahrten",abfahrtService.findAll());
        return "abfahrt/list";
    }

}
