package com.heitor.java.samples.abstractsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@ConditionalOnProperty(name = "feature.enabled", havingValue = "true", matchIfMissing = false)
public class SampleExecutorHandler {

    private final Optional<SampleAbstract> sampleExecutor;

    @Autowired
    public SampleExecutorHandler(Optional<SampleAbstract> sampleExecutor) {
        this.sampleExecutor = sampleExecutor;
    }

    public void executeSampleExecutor() {
        sampleExecutor.ifPresentOrElse(SampleAbstract::execute, () -> {
            // Handle the case when SampleExecutor is not available (feature.enabled=false)
            System.out.println("SampleExecutor is not available.");
        });
    }
}
