package ru.satizhanov.myspringapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeconController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
