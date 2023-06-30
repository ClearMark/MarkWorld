package com.markWorld.controller;

import com.markWorld.controller.entity.ResultResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mark")
public class MarkController {
    @PostMapping()
    public ResultResponse mark() {


        return ResultResponse.ok();
    }
}
