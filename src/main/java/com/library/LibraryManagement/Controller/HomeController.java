package com.library.LibraryManagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@GetMapping("/home")
    public String hello()
{
    return "Hi!!This is Home .";
}
}
