select 
 h.name,
 h.num_beds - sum(o.beds_occupied) as empty_beds_count,
 (sum(o.beds_occupied)/h.num_beds)*100.0 as pct_occupied 
from hospitals h
join occupancy o on h.id = o.hospital_id
where h.state = 'New York'
group by h.name, h.id, h.num_beds
order by pct_occupied desc
