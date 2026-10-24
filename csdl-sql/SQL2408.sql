SELECT 
    MAX(vr.Horsepower) AS horsepower
FROM Vehicle_Releases vr
JOIN Vehicle_Types vt 
    ON vr.Vehicle_Type_Id = vt.Id
WHERE vt.Name = 'Sedan'
  AND YEAR(vr.Release_Date) >= 2020;