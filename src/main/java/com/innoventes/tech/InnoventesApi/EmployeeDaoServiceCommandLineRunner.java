package com.innoventes.tech.InnoventesApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.innoventes.tech.InnoventesApi.Dao.EmployeeDaoService;

@Component
public class EmployeeDaoServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log= LoggerFactory.getLogger(EmployeeDaoServiceCommandLineRunner.class);
	
	@Autowired
	private EmployeeDaoService employeeDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		
		//long empId=employeeDaoService.insert(employee);
		//log.info("new employee is create :"+ employee);
		
	}

}
