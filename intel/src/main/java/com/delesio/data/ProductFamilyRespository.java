package com.delesio.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delesio.model.ProductFamily;

@Repository
public interface ProductFamilyRespository extends CrudRepository<ProductFamily, String> {

}
