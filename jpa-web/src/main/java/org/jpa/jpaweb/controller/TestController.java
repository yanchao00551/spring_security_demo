package org.jpa.jpaweb.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "hello spring security";
    }

    @GetMapping("index")
    public Object index(Authentication authentication) {
        // return SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }

    @GetMapping("index2")
    @PreAuthorize("hasAuthority('sys:user:info')")
    public String index(){
        return "index2";
    }

}
