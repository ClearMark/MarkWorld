package com.markWorld.controller;

import com.markWorld.PutchMapping;
import com.markWorld.dto.MarkDTO;
import com.markWorld.entity.ResultResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mark")
public class MarkController {
    @PostMapping()
    public ResultResponse mark(@RequestBody MarkDTO markDTO) {
        System.out.println("标记成功");
        return ResultResponse.ok();
    }
    @PutMapping()
    public ResultResponse unMark() {
        System.out.println("取消标记成功");
        return ResultResponse.ok();
    }
    @DeleteMapping()
    public ResultResponse deleteMark() {
        System.out.println("删除标记成功");
        return ResultResponse.ok();
    }
    @GetMapping()
    public ResultResponse getMark() {
        System.out.println("获取标记成功");
        return ResultResponse.ok();
    }
    @PutchMapping()
    public ResultResponse test() {
        System.out.println("putch成功");
        return ResultResponse.ok();
    }
}
