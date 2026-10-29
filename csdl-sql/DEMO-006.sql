UPDATE EMPLOYEE e
JOIN (
    SELECT EmpID
    FROM SALEORDER
    WHERE Status = 'COMPLETED'
    GROUP BY EmpID
    HAVING SUM(TotalAmount) > 50000
) t ON e.EmpID = t.EmpID
SET e.Salary = e.Salary * 1.10;