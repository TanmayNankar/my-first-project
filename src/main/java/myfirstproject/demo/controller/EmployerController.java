package myfirstproject.demo.controller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myfirstproject.demo.model.EmployerRegister;
import myfirstproject.demo.service.EmployerService;

@RestController
public class EmployerController {

  private static final Logger LOG = LoggerFactory.getLogger(EmployerController.class);
  
  
  @Autowired
  private EmployerService service;
  

  @RequestMapping("/org_name/{org_name}")
  public EmployerRegister getEmployerByOrgName(@PathVariable("org_name") String org_name) {
	  LOG.info("orgName");
	return service.findEmployeeByOrg(org_name); 
	  
  } 
	
  @RequestMapping("/eid")
  public EmployerRegister getEmployerById(@PathVariable("eid") int eid) {
	 LOG.info("eid");
	  return service.findEmployerById(101);
	  
  }
  
  
}
