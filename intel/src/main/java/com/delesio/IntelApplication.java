package com.delesio;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.delesio.service.IntelService;

@SpringBootApplication
//@EnableBatchProcessing
public class IntelApplication {

//	@Autowired
//	private JobBuilderFactory jobs;
//
//	@Autowired
//	private StepBuilderFactory steps;

	@Autowired
	private IntelService service;
	
//	@Bean
//	protected Tasklet tasklet() {
//
//		return new Tasklet() {
//			@Override
//			public RepeatStatus execute(StepContribution contribution,
//					ChunkContext context) {
//				
//				service.loadCodeNames();
//				service.loadProcessBrands();
//				service.loadProcessors();
//				service.loadProductFaimly();
//				service.loadProductSeries();
//				
//				return RepeatStatus.FINISHED;
//			}
//		};
//
//	}
//
//	@Bean
//	public Job job() throws Exception {
//		return this.jobs.get("job").start(step1()).build();
//	}
//
//	@Bean
//	protected Step step1() throws Exception {
//		return this.steps.get("step1").tasklet(tasklet()).build();
//	}
	
	public static void main(String[] args) {
//		SpringApplication.run(IntelApplication.class, args);
		
		ConfigurableApplicationContext ctx = SpringApplication.run(IntelApplication.class, args);
		IntelService service = ctx.getBean(IntelService.class);
		service.loadCodeNames();
		service.loadProcessBrands();
		service.loadProcessors();
		service.loadProductFaimly();
		service.loadProductSeries();
		
		System.exit(SpringApplication
				.exit(ctx));
	}
}
