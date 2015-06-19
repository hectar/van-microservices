package com.va.datalist.repository;

import com.va.datalist.domain.Data;
import org.springframework.stereotype.Repository;

/**
 * Created by vaneet_sharma
 */
@Repository
public class DataRepository extends CrudRepository<Data, String> {
}
