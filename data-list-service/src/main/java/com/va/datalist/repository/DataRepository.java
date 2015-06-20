package com.va.datalist.repository;

import com.va.datalist.domain.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vaneet_sharma
 */
@Repository
public interface DataRepository extends CrudRepository<Data, String> {
}
