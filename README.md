# Innoventes_tech
 poc

Kindly use development branch for use/update purpose
---------------------------------------------------------------
* DB details(In memory H2 db)-----

  Url- jdbc:h2:mem:testdb
  user name -sa
  password -
  
  -------------------------------------------------------
  * EndPoint Url
    1.) To get all the employee
    
      http://localhost:8081/employees
      
    2.) To get employee by employee Id
    
       http://localhost:8081/employee/{id}
       
    3.) To Create new employee
    
       http://localhost:8081/create/employee
       
       requestBody
       
       {
        "name": "shivam",
        "dateOfBirth": "2009-09-16T13:10:08.520+00:00"
       }
       
     4.) To delete employee
     
        http://localhost:8081/delete/employee/{Id}
        
        
     5.) To update employee
     
        localhost:8081/update/employee/{id}
     
        RequestBody
        
        {
          "name" :"Rahul"
        }
        
       
