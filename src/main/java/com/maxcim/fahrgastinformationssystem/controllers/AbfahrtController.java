package com.maxcim.fahrgastinformationssystem.controllers;

import com.maxcim.fahrgastinformationssystem.model.Abfahrt;
import com.maxcim.fahrgastinformationssystem.services.AbfahrtService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/abfahrten")
@Controller
public class AbfahrtController {
    private final AbfahrtService abfahrtService;

    public AbfahrtController(AbfahrtService abfahrtService) {
        this.abfahrtService = abfahrtService;
    }

    @RequestMapping({"","/"})
    public String showList(Model model) {
        model.addAttribute("abfahrten",abfahrtService.findAll());
        return "abfahrt/list";
    }

    @RequestMapping({"{id}","/{id}"})
    public String showDetailView(@PathVariable Long id, Model model) {
        model.addAttribute("id",id);
        return "abfahrt/detail";
    }

    @RequestMapping("/{id}/delete")
    public String deleteElement(@PathVariable Long id, Model model) {
        Abfahrt object = abfahrtService.findById(id);
        abfahrtService.delete(object);
        return "index";
    }


}
