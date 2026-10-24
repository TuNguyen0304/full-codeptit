select name, category, tickets_sold
from events e1
where category in ('music', 'theater')
 and tickets_sold > (
 select avg(tickets_sold)
 from events e2
 where e1.category = e2.category
 )
order by tickets_sold desc