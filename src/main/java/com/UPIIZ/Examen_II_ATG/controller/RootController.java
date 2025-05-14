package com.UPIIZ.Examen_II_ATG.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String redirigir() {
        return "redirect:/prestamos";
    }
}
