package io.flaterlab.comments.controllers;

import io.flaterlab.comments.models.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public Api index(){
        return new Api("1.0");
    }



}
