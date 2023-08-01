package com.heitor.java.samples.abstractsample;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnProperty(name = "feature.enabled", havingValue = "true", matchIfMissing = false)
    public SampleAbstract sampleExecutor() {
        System.out.println("Creating SampleExecutor bean...");
        return new SampleAbstract();
    }
}
