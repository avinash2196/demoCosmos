package com.cosmos.demo.service;

import com.cosmos.demo.repo.DemoRepo;
import com.cosmos.demo.dto.DemoTest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    private final DemoRepo demoRepo;
    public Mono<List<DemoTest>> findAll(){
        DemoTest demo=DemoTest.builder().categories("test2").name("test2").build();
    //  demoRepo.save(demo).block();
        System.out.println();
        return demoRepo.findAll().collectList();


    }
    public Mono<Long> countByName(){
        return demoRepo.countByName("test2");
    }

    @Override
    public Mono<Long> countByNameAndCategory() {
        return demoRepo.countByNameAndCategoriesIn("test2",Arrays.asList("test2"));

    }
}
