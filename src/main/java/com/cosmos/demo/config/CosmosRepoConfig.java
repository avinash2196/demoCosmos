package com.cosmos.demo.config;

import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.GatewayConnectionConfig;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import com.azure.spring.data.cosmos.repository.config.EnableReactiveCosmosRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableReactiveCosmosRepositories(basePackages = "com.cosmos.demo")
@RequiredArgsConstructor
public class CosmosRepoConfig extends AbstractCosmosConfiguration {
    private final CosmosProperties cosmosProperties;

    @Bean
    public CosmosConfig cosmosConfig(){
        return CosmosConfig.builder().build();
        }

        @Bean
    public CosmosClientBuilder cosmosClientBuilder(){
        return new CosmosClientBuilder().endpoint(cosmosProperties.getUri())
                .key(cosmosProperties.getKey());
            }

    @Override
    protected String getDatabaseName() {
        return cosmosProperties.getDatabase();
    }


}
