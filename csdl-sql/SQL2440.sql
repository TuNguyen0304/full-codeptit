SELECT 
    MAX(CASE WHEN year = 2019 THEN recycling_rate END) - 
    MAX(CASE WHEN year = 2018 THEN recycling_rate END) AS rate_difference
FROM recycling_rates
WHERE material = 'glass' 
  AND year IN (2018, 2019);