package com.pjsdev.springairag.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "pjsdev.aiapp")
public class VectorStoreProperties {

    private String vectorStorePath;
}
