package com.mber.controller;

import com.mber.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final PostService service;

    @GetMapping("/")
    public String onHome() {
        return "home";
    }

    @GetMapping("/posts")
    public String onPostAll(Model model) {
        model.addAttribute("posts", service.getAll());
        return "post_all";
    }

    @GetMapping("/post/add")
    public String onPostAdd() {
        return "post_add";
    }

    @GetMapping("/My_world")
    public String world() {
        return "My_world";
    }
}


