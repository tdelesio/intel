package com.delesio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.delesio.data.CodeNameRepository;
import com.delesio.model.CodeName;
import com.delesio.model.CodeNames;
import com.delesio.model.Processors;

@Service
public class IntelService {

	@Autowired
	private CodeNameRepository codeNameRepository;
	
	private final static String apikey = "1CEAF259DAD4459AA915D4B26C97239B";
			//"http://odata.intel.com/API/v1_0/Products/Processors()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B"
	
	
	
	public Processors loadProcessors()
	{
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		return restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/Processors()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", Processors.class);
		
		
	}
	
	public CodeNames loadCodeNames()
	{
		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//		restTemplate.getMessageConverters().add(new );
		CodeNames codeNames = restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/CodeNames()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", CodeNames.class);
		
		codeNameRepository.save(codeNames.getD());
		
		return codeNames;
		
		//System.out.println(restTemplate.getForObject("http://odata.intel.com/API/v1_0/Products/CodeNames()?$format=json&&api_key=1CEAF259DAD4459AA915D4B26C97239B", String.class));
		//return new CodeNames();
	}
}
