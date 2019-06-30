package ru.learning.keycloak.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class MyWebSocketController {

    @MessageMapping("/customer")
//    @PreAuthorize("hasRole('user1')")
    public String index(){
        return "hello";
    }
}
