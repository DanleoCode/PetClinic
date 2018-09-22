package com.lipik.petclinik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    @RequestMapping({"","/index","/index.html"})
    public String lostOwners(){
        return "owners/index";
    }
}
