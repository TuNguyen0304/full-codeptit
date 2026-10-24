SELECT AVG(budget) AS num_budget
FROM (
    SELECT budget, year FROM ai_budget_usa
    UNION ALL
    SELECT budget, year FROM ai_budget_uk
    UNION ALL
    SELECT budget, year FROM ai_budget_japan
) AS combined_budgets
WHERE year BETWEEN 2018 AND 2020;