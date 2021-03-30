-- SELECT 열이름 FROM 테이블명 WHERE 조건;
-- 증상인 두통인 사람에게 처방할 약정보 조회 (제품명, 제품이름 증상, 재고, 가격)
SELECT PID, PNAME,category,stock, price FROM product
WHERE category='두통';

select * from indextbl where first_name='JACK';
-- 인덱스 지정(이름만으로 어느 열에 설정된 인덱스인지 알 수 있도록 지정)
create index idx_indextbl_firstname on indextbl(first_name);

--뷰 
create view shop.product_view as
select pid, pname, category from shop.product;


select count(*) from product;
select count(*) from indextbl;