package com.cosmos.demo.repo;

import com.azure.spring.data.cosmos.repository.Query;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cosmos.demo.dto.DemoTest;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface DemoRepo extends ReactiveCosmosRepository<DemoTest,String> {


    Mono<Long> countByName(String name);
   // @Query("select count(c) from c where name=@name and c.category in ('@categoryList')")
    Mono<Long> countByNameAndCategoriesIn(String name, List<String> categoryList);
}
