SELECT DISTINCT p.country
FROM Products p
JOIN ProductTransparency pt 
    ON p.product_id = pt.product_id
JOIN SupplyChainViolations s 
    ON p.country = s.country
WHERE pt.recycled_materials = TRUE
  AND s.num_violations > 0;