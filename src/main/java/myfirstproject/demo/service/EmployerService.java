package myfirstproject.demo.service;

//import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myfirstproject.demo.model.EmployerRegister;
import myfirstproject.demo.repository.EmployerRepository;


@Service
public class EmployerService {

private static final Logger LOG = LoggerFactory.getLogger(EmployerService.class);

@Autowired
private EmployerRepository repository;

public EmployerRegister findEmployeeByOrg(String org_name) {
	LOG.info(org_name);
	return repository.findByOrgName();

}

public EmployerRegister findEmployerById(int eid) {
	LOG.info("eid");
	return repository.findEmployerById();
}

}


