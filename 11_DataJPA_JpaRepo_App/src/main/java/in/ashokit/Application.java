package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	
		EmployeeRepository repository=context.getBean(EmployeeRepository.class);
	Employee emp=new Employee();
	//emp.setEmpId(102);
	emp.setEmpName("rani");
	emp.setDept("sales");
	emp.setEmpGeneder("Male");
repository.save(emp);
	
	}

}
