package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

import static com.example.demo.utils.GlobalAttributes.REDIRECT_MESSAGE;

@Controller
public class RedirectsController {

    @GetMapping(value = "/redirect")
    public String redirectExample() {
        return "redirect:/";
    }

    @GetMapping(value = "/redirectWithAttrs")
    public String redirectAttrs(RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute(REDIRECT_MESSAGE, "redirectMessage");
        return "redirect:/";
    }

    @PostMapping(value = "/redirectWithFlashAttrs")
    public String redirectFlash(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute(REDIRECT_MESSAGE, "We have been redirected here with flash attributes!");
        return "redirect:/";
    }

    @GetMapping(value = "/sessionAttr")
    public String sessionAttr(HttpSession session) {
        session.setAttribute(REDIRECT_MESSAGE, "This is a session message");
        return "redirect:/";
    }

    @GetMapping(value = "/clearSessionAttr")
    public String sessionAttrClear(HttpSession session) {
        session.removeAttribute(REDIRECT_MESSAGE);
        return "redirect:/";
    }
}
