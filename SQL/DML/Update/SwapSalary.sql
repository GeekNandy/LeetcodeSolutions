--Oracle
UPDATE salary
    SET sex  = (CASE WHEN sex = 'm' 
        THEN  'f' 
        ELSE 'm' 
        END);
		
--MySQL
update salary set sex = CHAR(ASCII('f') ^ ASCII('m') ^ ASCII(sex));
update salary set sex = CHAR(ASCII('f') + ASCII('m') - ASCII(sex));
