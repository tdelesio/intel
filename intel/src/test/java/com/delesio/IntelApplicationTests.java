package com.delesio;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.delesio.data.CodeNameRepository;
import com.delesio.data.ProcessorBrandRepository;
import com.delesio.data.ProcessorRespority;
import com.delesio.data.ProductFamilyRespository;
import com.delesio.data.ProductSeriesRespository;
import com.delesio.model.CodeName;
import com.delesio.model.Processor;
import com.delesio.model.Processors;
import com.delesio.service.IntelService;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class IntelApplicationTests {
	
	@Autowired
	private IntelService service;
	
	@Autowired
	private CodeNameRepository codeNameRepository;
	
	@Autowired
	private ProcessorRespority processorRespority;
	
	@Autowired
	private ProcessorBrandRepository processorBrandRepository;
	
	@Autowired
	private ProductSeriesRespository productSeriesRespository;
	
	@Autowired
	private ProductFamilyRespository productFamilyRespository;

//	@Test
//	public void contextLoads() {
//	}
	
//	@Test
//	public void testCodeNames()
//	{
//		service.loadCodeNames();
//		
//		Assert.assertTrue(codeNameRepository.count()>0);
//	}
//	
//	@Test
//	public void testProcessor()
//	{
//		Processors processors = service.loadProcessors();
//		List<Processor> list = processors.getD();
//		for (Processor processor:list)
//		{
//			System.out.println(processor.getLaunchDateDisplay());
//		}
//		Assert.assertTrue(processorRespority.count()>0);
//	}
//	
//	@Test
//	public void testProcessBrand()
//	{
//		service.loadProcessBrands();
//		
//		Assert.assertTrue(processorBrandRepository.count()>0);
//	}
//	
//	@Test
//	public void testProductFamily()
//	{
//		service.loadProductFaimly();
//		
//		Assert.assertTrue(productFamilyRespository.count()>0);
//	}
//	
//	@Test
//	public void testProductSeries()
//	{
//		service.loadProductSeries();
//		
//		Assert.assertTrue(productSeriesRespository.count()>0);
//	}

}
