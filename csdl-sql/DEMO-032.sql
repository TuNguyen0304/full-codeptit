UPDATE Customer
SET Tier = 'TOP_CITY'
WHERE CustID IN (
    SELECT CustID 
    FROM (
        SELECT 
            c.CustID,
            RANK() OVER (PARTITION BY c.City ORDER BY SUM(p.Amount) DESC) AS rnk
        FROM Customer c
        JOIN SaleOrder o ON c.CustID = o.CustID
        JOIN Payment p ON o.OrderID = p.OrderID
        WHERE p.Status = 'PAID'
        GROUP BY c.CustID, c.City
    ) AS t
    WHERE rnk = 1
);