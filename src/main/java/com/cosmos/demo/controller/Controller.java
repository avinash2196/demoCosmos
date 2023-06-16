package com.cosmos.demo.controller;

import com.cosmos.demo.dto.DemoTest;
import com.cosmos.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class Controller {

    private final DemoService demoService;

    @GetMapping("test")
    public Mono<List<DemoTest>> findAll(){
    return demoService.findAll();
    }
    @GetMapping("count")
    public Mono<Long> countByName(){
        return demoService.countByName();
    }
    @GetMapping("count1")
    Mono<Long> countByNameAndCategory(){
        return demoService.countByNameAndCategory();
    }


}
