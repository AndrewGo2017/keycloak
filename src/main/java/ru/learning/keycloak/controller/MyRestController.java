package ru.learning.keycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest")
public class MyRestController {

    @GetMapping
//    @PreAuthorize("hasRole('user')")
    public String index(Principal principal){
        return "hello";
    }
}
