package com.delesio.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delesio.model.CodeName;

@Repository
public interface CodeNameRepository extends CrudRepository<CodeName,String> {

}
