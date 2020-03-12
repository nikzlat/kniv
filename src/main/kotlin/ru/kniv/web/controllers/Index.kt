package ru.kniv.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.view.RedirectView

@RestController
class Index {

    @GetMapping("/")
    fun index(): RedirectView {
        return RedirectView("index.html");
    }
}