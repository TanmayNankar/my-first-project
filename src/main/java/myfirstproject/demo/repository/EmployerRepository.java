package myfirstproject.demo.repository;

import java.util.*;

import org.springframework.boot.autoconfigure.web.servlet.JerseyApplicationPath;

import org.springframework.stereotype.Repository;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
import myfirstproject.demo.model.EmployerRegister;



@Repository
  public interface EmployerRepository extends JpaRepository<EmployerRegister , Integer>  {

	public abstract List<EmployerRegister> findByOrgName(String org_name);

//	public abstract EmployerRegister findByOrgName();

//	public abstract EmployerRegister findEmployerById();
		
}


