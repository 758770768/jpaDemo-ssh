package org.jpaDemo.dao;

import org.jpaDemo.bean.Emp;
import org.springframework.data.repository.CrudRepository;

public interface EmpDaoI extends CrudRepository<Emp, String> {

}
