package com.delesio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.delesio.data.CodeNameRepository;
import com.delesio.data.ProcessorBrandRepository;
import com.delesio.data.ProcessorRespority;
import com.delesio.data.ProductFamilyRespository;
import com.delesio.data.ProductSeriesRespository;
import com.delesio.model.CodeName;
import com.delesio.model.CodeNames;
import com.delesio.model.ProcessorBrands;
import com.delesio.model.Processors;
import com.delesio.model.ProductFamily;
import com.delesio.model.ProductFamilys;
import com.delesio.model.ProductSeriess;

@Service
public class IntelService {

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
	
	private final static String apikey = "1CEAF259DAD4459AA915D4B26C97239B";
			//"http://odata.intel.com/API/v1_0/Products/Processors()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B"
	
	
	
	public Processors loadProcessors()
	{
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		Processors processors = restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/Processors()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", Processors.class);
		
		processorRespority.save(processors.getD());
		
		return processors;
		
		
	}
	
	public CodeNames loadCodeNames()
	{
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		CodeNames codeNames = restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/CodeNames()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", CodeNames.class);
		
		codeNameRepository.save(codeNames.getD());
		
		return codeNames;
		
	}
	
	public ProductSeriess loadProductSeries()
	{
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		ProductSeriess restobject = restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/SeriesSet()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", ProductSeriess.class);
		
		productSeriesRespository.save(restobject.getD());
		
		return restobject;
		
	}
	
	public ProductFamilys loadProductFaimly()
	{
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		ProductFamilys restobject = restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/Families()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", ProductFamilys.class);
		
		productFamilyRespository.save(restobject.getD());
		
		return restobject;
		
	}
	
	public ProcessorBrands loadProcessBrands()
	{
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		ProcessorBrands restobject = restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/ProcessorBrands()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", ProcessorBrands.class);
		
		processorBrandRepository.save(restobject.getD());
		
		return restobject;
		
	}
}
