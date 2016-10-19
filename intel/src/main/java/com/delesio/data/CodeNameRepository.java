package com.delesio.data;

import org.springframework.data.repository.CrudRepository;

import com.delesio.model.CodeName;

public interface CodeNameRepository extends CrudRepository<CodeName,String> {

}
