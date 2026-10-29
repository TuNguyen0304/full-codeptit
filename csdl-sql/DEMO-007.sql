UPDATE SALEORDER s
JOIN PAYMENT p ON s.OrderID = p.OrderID
SET s.Status = 'PAID'
WHERE p.Status = 'PAID';