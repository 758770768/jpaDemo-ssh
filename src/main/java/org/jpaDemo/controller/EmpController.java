package org.jpaDemo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.jpaDemo.bean.Emp;
import org.jpaDemo.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

	@Resource
	private EmpService es;

	@RequestMapping("/abc")
	public List<Emp> fun() {

		return es.selectAll();
		
	}

}
