SELECT 
    Team,
    AVG(HomeAttendance) AS Avg_As_Home,
    AVG(AwayAttendance) AS Avg_As_Away
FROM (
    SELECT 
        HomeTeam AS Team, 
        HomeAttendance, 
        NULL AS AwayAttendance 
    FROM TeamStats
    
    UNION ALL
    
    SELECT 
        AwayTeam AS Team, 
        NULL AS HomeAttendance, 
        AwayAttendance 
    FROM TeamStats
) AS CombinedStats
GROUP BY Team
ORDER BY Team ASC;