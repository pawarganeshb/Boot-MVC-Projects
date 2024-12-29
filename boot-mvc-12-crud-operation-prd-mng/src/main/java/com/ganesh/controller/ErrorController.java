package com.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model) {
        model.addAttribute("error", "An unexpected error occurred!");
        return "error";  // This should map to /WEB-INF/views/error.jsp
    }
}
