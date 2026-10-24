select 
 category, 
 sum(tickets_sold) as total_tickets
from events
group by category
having 
 category in ('music', 'theater')
 and total_tickets >= 200
order by total_tickets desc
