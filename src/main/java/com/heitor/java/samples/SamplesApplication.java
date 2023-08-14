package com.heitor.java.samples;

import com.heitor.java.samples.abstractsample.SampleExecutorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SamplesApplication.class, args);

		try {
			SampleExecutorHandler sampleExecutorHandler = context.getBean(SampleExecutorHandler.class);
			sampleExecutorHandler.executeSampleExecutor();
		} catch (Exception e){
			System.out.println(e);
		}



	}
}

