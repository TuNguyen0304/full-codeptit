select
 h.name,
 h.capacity,
 count(p.id) as vaccinated
from hospitals h
join patient_vaccinations p on h.id = p.hospital_id
where h.location = 'Nairobi'
group by h.name, h.capacity
