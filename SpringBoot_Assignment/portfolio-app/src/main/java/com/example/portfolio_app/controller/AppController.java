package com.example.portfolio_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String showHomePage() {
        return "home"; // maps to /WEB-INF/home.jsp or /templates/home.html (depending on view tech)
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // maps to about.html or about.jsp
    }

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact";
    }

    @GetMapping("/education")
    public String showEducationPage() {
        return "education";
    }

    @GetMapping("/skills")
    public String showSkillsPage() {
        return "skills";
    }

    @GetMapping("/test")
    public String testPage() {
        return "test";
    }
}
