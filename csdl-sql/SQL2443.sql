select v.name
from vessels v
join voyages vo on v.id = vo.vessel_id
where 
 vo.region = 'Arctic'
 and vo.cargo_weight > 5000
