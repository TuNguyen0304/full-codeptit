select
 c.CustID,
 c.CustomerName
from Customer c
join SaleOrder s on c.CustID = s.CustID
join Payment p on s.OrderID = p.OrderID
where 
 p.Status = 'PAID'
 and year(s.OrderDate) in ('2023', '2024')
group by
 c.CustID, 
 c.CustomerName
having 
 sum(case when year(s.OrderDate) = '2023' then p.Amount else 0 end) >= 500
 and sum(case when year(s.OrderDate) = '2024' then p.Amount else 0 end) >= 500
