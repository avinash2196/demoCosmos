package com.cosmos.demo.dto;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Container(containerName="demo-container")
public class DemoTest {

    @Id
    @GeneratedValue
    private String id;

    private String name;
    private String categories;

}
