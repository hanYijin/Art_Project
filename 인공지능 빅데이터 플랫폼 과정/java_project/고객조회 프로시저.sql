--create or REPLACE PROCEDURE select_customer
--(p_id in customer.id%type,
--p_name customer.name%type,
--p_gender customer.gender%type,
--p_birthyear customer.birthyear%type,
--p_address customer.address%type,
--p_phone customer.phone%type)
--is
--begin
--SELECT name, gender, birthyear, address,phone into p_name, p_gender, p_birthyear,p_address,p_phone
--FROM customer 
--where id = p_id;
--end  select_customer;
--EXECUTE select_customer(1);
--drop PROCEDURE select_customer;

create or REPLACE PROCEDURE select_customer
(p_customer out SYS_REFCURSOR)
is begin open p_customer for 
select * from customer;
end  select_customer;