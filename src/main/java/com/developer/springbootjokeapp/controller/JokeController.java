package com.developer.springbootjokeapp.controller;

import com.developer.springbootjokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService service;

    public JokeController(@Autowired JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", service.getJoke());
        return "chuckNorris";
    }

}
