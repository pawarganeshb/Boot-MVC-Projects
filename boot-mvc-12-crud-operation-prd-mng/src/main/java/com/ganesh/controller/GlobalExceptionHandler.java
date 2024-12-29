package com.ganesh.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ganesh.exceptions.CustomException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public String handleCustomException(CustomException ex, Model model) {
        model.addAttribute("error", ex.getMessage());
        return "error";  // Return error.jsp
    }
}
