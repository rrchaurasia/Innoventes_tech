insert into EMPLOYEE(EMP_ID,DATE_OF_BIRTH,NAME) values(1,sysdate(),'rahul');

insert into EMPLOYEE(EMP_ID,DATE_OF_BIRTH,NAME) values(2,sysdate(),'ravi');

insert into EMPLOYEE(EMP_ID,DATE_OF_BIRTH,NAME) values(3,sysdate(),'abhinav');



insert into ADDRESS(ADD_ID,ADD_LINE_ONE,ADD_LINE_TWO,CITY) values(1,'chausa','buxar','bihar');

insert into ADDRESS(ADD_ID,ADD_LINE_ONE,ADD_LINE_TWO,CITY) values(2,'roopena','bangalore','karnataka');

insert into ADDRESS(ADD_ID,ADD_LINE_ONE,ADD_LINE_TWO,CITY) values(3,'hsr','delhi','new delhi');




insert into EMPLOYEE_ADDRESS(ID,ADDRESS_TYPE,ADD_ID,EMP_ID) values(1,'localAddress',1,1);

insert into EMPLOYEE_ADDRESS(ID,ADDRESS_TYPE,ADD_ID,EMP_ID) values(2,'billingAddress',2,1);

insert into EMPLOYEE_ADDRESS(ID,ADDRESS_TYPE,ADD_ID,EMP_ID) values(3,'companyAddress',2,2);
insert into EMPLOYEE_ADDRESS(ID,ADDRESS_TYPE,ADD_ID,EMP_ID) values(4,'residenceAddress',3,3);
insert into EMPLOYEE_ADDRESS(ID,ADDRESS_TYPE,ADD_ID,EMP_ID) values(5,'officeAddress',3,2);