SELECT 
    h.name,
    h.capacity
FROM hospitals h
LEFT JOIN patient_vaccinations pv 
    ON h.id = pv.hospital_id 
   AND pv.date BETWEEN '2022-03-01' AND '2022-03-31'
WHERE pv.id IS NULL
ORDER BY h.name ASC;