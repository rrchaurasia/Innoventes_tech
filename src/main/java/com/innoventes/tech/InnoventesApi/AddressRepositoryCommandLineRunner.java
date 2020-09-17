/*
 * package com.innoventes.tech.InnoventesApi;
 * 
 * import java.util.Date; import java.util.HashSet; import java.util.Set;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.innoventes.tech.InnoventesApi.Dao.AddressRepository; import
 * com.innoventes.tech.InnoventesApi.Entity.Address; import
 * com.innoventes.tech.InnoventesApi.Entity.Employee;
 * 
 * @Component public class AddressRepositoryCommandLineRunner implements
 * CommandLineRunner {
 * 
 * private static final Logger log =
 * LoggerFactory.getLogger(AddressRepositoryCommandLineRunner.class);
 * 
 * 
 * @Autowired private AddressRepository addressRepository;
 * 
 * @Override public void run(String... args) throws Exception { Employee emp1 =
 * new Employee("ravi", new Date()); Employee emp2 = new Employee("abhinav", new
 * Date()); Set<Employee> s1 = new HashSet(); s1.add(emp1); s1.add(emp2);
 * Address add1 = new Address("hsr", "bangalore", "karnataka", s1);
 * addressRepository.save(add1); log.info("new address is create :" + add1);
 * 
 * }
 * 
 * }
 */