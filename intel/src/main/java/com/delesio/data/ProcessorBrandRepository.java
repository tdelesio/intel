package com.delesio.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delesio.model.ProcessorBrand;

@Repository
public interface ProcessorBrandRepository extends CrudRepository<ProcessorBrand, String> {

}
