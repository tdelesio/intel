package com.delesio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.delesio.model.CodeName;
import com.delesio.model.CodeNames;
import com.delesio.model.Processor;
import com.delesio.model.Processors;
import com.delesio.service.IntelService;

@SpringBootApplication
public class IntelApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelApplication.class, args);
		
		
	}
}
