package org.jpaDemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.jpaDemo.bean.Emp;
import org.jpaDemo.dao.EmpDaoI;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Resource
	private EmpDaoI edi;

	public List<Emp> selectAll() {
		List<Emp> el = new ArrayList<>();
		Iterable<Emp> findAll = edi.findAll();
		for (Emp emp : findAll) {
			el.add(emp);
		}

		return el;
	}

}
