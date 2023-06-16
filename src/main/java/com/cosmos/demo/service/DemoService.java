package com.cosmos.demo.service;

import com.cosmos.demo.dto.DemoTest;
import reactor.core.publisher.Mono;

import java.util.List;


public interface DemoService {


   Mono<List<DemoTest>> findAll();
   public Mono<Long> countByName();

   Mono<Long> countByNameAndCategory();
}
