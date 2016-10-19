package com.delesio.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delesio.model.Processor;

@Repository
public interface ProcessorRespority extends CrudRepository<Processor, String> {

}
