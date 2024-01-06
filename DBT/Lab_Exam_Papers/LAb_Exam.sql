DELIMITER &&
CREATE PROCEDURE getWorkerBySalary(IN sal int)
BEGIN
   SELECT * FROM Worker where Salary=sal;
END 
&&

DELIMITER ;
   
   
DELIMITER &&
CREATE PROCEDURE getSalary(OUT val int)
BEGIN
   SELECT  max(Salary) into val FROM Worker where Salary>20000;
END 
&&

DELIMITER ;
   
   
   
DELIMITER &&
CREATE PROCEDURE getName(OUT val varchar(20))
BEGIN
   SELECT  FIRST_NAME into val FROM Worker where WORKER_ID=2;
END 
&&

DELIMITER 
   
Functions-----------------------------------


DELIMITER &&
CREATE FUNCTION getTSal(id int)
RETURNS int
DETERMINISTIC
BEGIN 
DECLARE tSal int;
  select sum(Salary) into tSal from Worker where  WORKER_ID=id;
RETURN tSal;
END &&
DELIMITER ;



DELIMITER &&
CREATE FUNCTION getTotalSal(id int)
RETURNS int
DETERMINISTIC
BEGIN 
DECLARE tSal int;

  select sum(Salary) into tSal from Worker where  department=(select department from Worker where WORKER_ID=id);
RETURN tSal;
END &&
DELIMITER ;