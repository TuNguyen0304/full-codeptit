select 
 City, 
 sum(Amount) as TotalRevenue
from(
 select City, Amount from OnlineOrder
 union all
 select City, Amount from StoreOrder
) as bang_tam
group by City
order by City asc
