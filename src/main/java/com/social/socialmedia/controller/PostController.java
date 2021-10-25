package com.social.socialmedia.controller;

import com.social.socialmedia.business.abstracts.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String getAll(Model model){
        model.addAttribute("listPost", postService.getAll());
        return "index.html";
    }
}
