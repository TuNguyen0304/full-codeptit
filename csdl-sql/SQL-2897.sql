select category, sum(tickets_sold) as total_tickets
 from events
 group by category
 having total_tickets > 300