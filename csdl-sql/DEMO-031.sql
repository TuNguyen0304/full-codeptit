INSERT INTO VipCustomer (CustID, CustomerName, City, TotalSpent2024)
SELECT 
    c.CustID, 
    c.CustomerName, 
    c.City, 
    SUM(o.TotalAmount) AS TotalSpent2024
FROM Customer c
JOIN SaleOrder o ON c.CustID = o.CustID
WHERE YEAR(o.OrderDate) = 2024
GROUP BY c.CustID, c.CustomerName, c.City
HAVING SUM(o.TotalAmount) >= 2000;