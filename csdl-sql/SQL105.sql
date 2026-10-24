select
 t.username,
 t.dept,
 t.number,
 c.title
from Teaches t
join Class c on t.number = c.number
order by t.username asc
limit 2