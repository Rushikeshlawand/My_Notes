create database fsd;
use fsd;
select * from newstudent;
insert into newstudent value(4,"swaroop",4,"mech");
UPDATE newstudent SET name="sandeep" WHERE st_id=2;
SET SQL_SAFE_UPDATES = 0;
DELETE FROM newstudent WHERE roll_no=101;
