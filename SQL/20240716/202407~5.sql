--1. BOOK ���̺��� PRICE �� 20000 �̻� ���
SELECT *
FROM BOOK
WHERE PRICE >= 20000;

--2. BOOK ���̺��� BOOKNAME �÷��� '�߱�' �� �� ���ڵ� ���
SELECT *
FROM BOOK
WHERE BOOKNAME LIKE '%�߱�%';

--3. BOOK ���̺��� PUBLISHER �÷��� '�½�����'�� �����͸� BOOKNAME �÷� ������������ ���
SELECT *
FROM BOOK
WHERE PUBLISHER = '�½�����'
ORDER BY BOOKNAME DESC;

--4. BOOK ���̺��� PRICE �� 5000�̻� 20000���� ������ ���
SELECT *
FROM BOOK
WHERE PRICE BETWEEN 5000 AND 20000;

--5. CUSTOMER ���̺��� PHONE�� NULL�� �ƴϰ� CUSTID�� 3�̻��� ���ڵ� ���
SELECT *
FROM CUSTOMER
WHERE PHONE IS NOT NULL AND CUSTID >= 3;

--6. ���� ��� �ֹ� �ݾ��� ��� ������ �ݿø��� ���� ���Ͻÿ�.
SELECT ROUND(AVG(SALEPRICE), -2) , C.NAME
FROM CUSTOMER C
INNER JOIN ORDERS O ON C.CUSTID = O.CUSTID
GROUP BY C.NAME;

--7. �̻�̵���� �� �߿��� ���� ��(��)�� ���� ����� �� ���̳� �Ǵ��� ���� �ο����� ���Ͻÿ�.
-- ������ �κ� : ���� ���� ���� ��� ī��Ʈ ���ϱ� ����
SELECT ������, ���ǻ�
FROM CUSTOMER C
INNER JOIN (
    SELECT COUNT(*), C.NAME AS ������, B.PUBLISHER AS ���ǻ�
    FROM BOOK B
    INNER JOIN ORDERS O ON B.BOOKID = O.BOOKID
    INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
    GROUP BY C.NAME, B.PUBLISHER
) M ON C.NAME = ������
WHERE ���ǻ� = '�̻�̵��'; 


SELECT COUNT(*), C.NAME, B.PUBLISHER
FROM BOOK B
INNER JOIN ORDERS O ON B.BOOKID = O.BOOKID
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
GROUP BY C.NAME, B.PUBLISHER; 

--8. �̻�̵��� 2020�� 7�� 7�Ͽ� �ֹ����� ������ �ֹ���ȣ, �ֹ���, ����ȣ, ������ȣ�� ��� ���̽ÿ�. �� �ֹ����� ��yyyy-mm-dd ���ϡ� ���·� ǥ���Ѵ�.
-- ������ �κ� : '����' �ֱ� �Ұ�
SELECT *
FROM (
    SELECT O.ORDERID, TO_CHAR(TO_DATE('20/07/07', 'YY/MM/DD'), 'YYYY-MM-DD') AS ORDERDATE, C.CUSTID, B.BOOKID
    FROM BOOK B
    INNER JOIN ORDERS O ON B.BOOKID = O.BOOKID
    INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
    WHERE PUBLISHER = '�̻�̵��' AND ORDERDATE = (TO_DATE('2020-07-07', 'YYYY-MM-DD'))
);

SELECT O.ORDERID, TO_CHAR(TO_DATE('20/07/07', 'YY/MM/DD'), 'YYYY-MM-DD') AS ORDERDATE, C.CUSTID, B.BOOKID
FROM BOOK B
INNER JOIN ORDERS O ON B.BOOKID = O.BOOKID
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
WHERE PUBLISHER = '�̻�̵��' AND ORDERDATE = (TO_DATE('2020-07-07', 'YYYY-MM-DD'));

--9. �̸�, ��ȭ��ȣ�� ���Ե� ������� ���̽ÿ�. ��, ��ȭ��ȣ�� ���� ���� ������ó���������� ǥ���Ͻÿ�.
SELECT NAME, NVL(PHONE, '����ó����')
FROM CUSTOMER;

--10. ����Ͽ��� ����ȣ, �̸�, ��ȭ��ȣ�� ���� �� �� ���̽ÿ�.
SELECT CUSTID, NAME, PHONE
FROM CUSTOMER
WHERE CUSTID < 3;

--11. ��� �ֹ��ݾ� ������ �ֹ��� ���ؼ� �ֹ���ȣ�� �ݾ��� ���̽ÿ�.
SELECT ORDERID, SALEPRICE
FROM ORDERS
WHERE (
SELECT AVG(SALEPRICE)
FROM ORDERS
) > SALEPRICE;

SELECT AVG(SALEPRICE)
FROM ORDERS;

--12. �����ѹα����� �����ϴ� ������ �Ǹ��� ������ �� �Ǹž��� ���Ͻÿ�.
SELECT SUM(SALEPRICE)
FROM CUSTOMER C
INNER JOIN ORDERS O ON C.CUSTID = O.CUSTID
WHERE ADDRESS LIKE '%���ѹα�%';

--13. 3�� ���� �ֹ��� ������ �ְ� �ݾ׺��� �� ��� ������ ������ �ֹ��� �ֹ���ȣ�� �ݾ��� ���̽ÿ�.
SELECT ORDERID, SALEPRICE
FROM CUSTOMER C
INNER JOIN ORDERS O ON C.CUSTID = O.CUSTID
WHERE SALEPRICE > (
    SELECT MAX(SALEPRICE)
    FROM CUSTOMER C
    INNER JOIN ORDERS O ON C.CUSTID = O.CUSTID
    WHERE C.CUSTID = 3
);

SELECT MAX(SALEPRICE)
FROM CUSTOMER C
INNER JOIN ORDERS O ON C.CUSTID = O.CUSTID
WHERE C.CUSTID = 3;

--14. �̻�̵���� ���� �Ǹž��� ���̽ÿ�(���̸��� ���� �Ǹž� ���).
SELECT C.NAME, O.SALEPRICE
FROM BOOK B
INNER JOIN ORDERS O ON B.BOOKID = O.BOOKID
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
WHERE B.PUBLISHER = '�̻�̵��';

--15. ����ȣ�� 2 ������ ���� �Ǹž��� ���̽ÿ�(���̸��� ���� �Ǹž� ���).
SELECT C.NAME, O.SALEPRICE
FROM CUSTOMER C
INNER JOIN ORDERS O ON C.CUSTID = O.CUSTID
INNER JOIN BOOK B ON O.BOOKID = B.BOOKID
WHERE C.CUSTID <= 2;

--16. �ּҿ� �����ѹα����� �����ϴ� ����� ������ �並 ����� ��ȸ�Ͻÿ�. ���� �̸��� vw_Customer�� �����Ͻÿ�.


--17. Orders ���̺��� ���̸��� �����̸��� �ٷ� Ȯ���� �� �ִ� �並 ������ ��, ���迬�ơ� ���� ������ ������ �ֹ���ȣ, �����̸�, �ֹ����� ���̽ÿ�.