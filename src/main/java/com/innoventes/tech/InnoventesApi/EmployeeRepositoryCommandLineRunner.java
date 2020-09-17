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
 * import com.innoventes.tech.InnoventesApi.Dao.EmployeeRepository; import
 * com.innoventes.tech.InnoventesApi.Entity.Address; import
 * com.innoventes.tech.InnoventesApi.Entity.Employee;
 * 
 * @Component public class EmployeeRepositoryCommandLineRunner implements
 * CommandLineRunner {
 * 
 * private static final Logger log =
 * LoggerFactory.getLogger(EmployeeRepositoryCommandLineRunner.class);
 * 
 * @Autowired private EmployeeRepository employeeRepository;
 * 
 * @Override public void run(String... args) throws Exception { Address address1
 * = new Address("chausa", "buxar", "patna"); Address address2 = new
 * Address("roopena", "bangalore", "karnatka"); Address address3 = new
 * Address("dumrav", "buxar", "bihar"); Set<Address> s = new HashSet();
 * s.add(address1); s.add(address2); s.add(address3); Employee employee = new
 * Employee("rahul", new Date(), s); employeeRepository.save(employee); //
 * employeeRepository.save(employee1); log.info("new employee is create :" +
 * employee);
 * 
 * }
 * 
 * }
 */