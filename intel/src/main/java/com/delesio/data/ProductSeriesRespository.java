package com.delesio.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delesio.model.ProductSeries;

@Repository
public interface ProductSeriesRespository extends CrudRepository<ProductSeries, String> {

}
