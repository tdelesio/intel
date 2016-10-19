package com.delesio;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.delesio.model.CodeName;
import com.delesio.service.IntelService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntelApplicationTests {
	
	@Autowired
	private IntelService service;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCodeNames()
	{
		
//		Processors processors = service.loadProcessors();
//		List<Processor> list = processors.getD();
//		for (Processor p: list)
//		{
//			System.out.println(p.toString());
//		}
		
		List<CodeName> list =  service.loadCodeNames().getD();
		for (CodeName p: list)
		{
			System.out.println(p.toString());
		}
	}

}
