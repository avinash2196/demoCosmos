package com.cosmos.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class CosmosProperties {
    @Value("${azure.cosmosdb.uri}")
    public String uri;
    @Value("${azure.cosmosdb.key}")
    public String key;
    @Value("${azure.cosmosdb.database}")
    public String database;

}
