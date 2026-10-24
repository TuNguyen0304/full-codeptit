select 
 sr.SID,
 sr.SName
from Supplier sr
join Supply s on sr.SID = s.SID
join Product p on s.PID = p.PID
join Category c on p.CatID = c.CatID
where c.CatName = 'Electronics'
group by sr.SID
having count(distinct s.PID) >= 2
