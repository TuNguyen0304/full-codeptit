UPDATE Users
SET name = UPPER(LEFT(name, 1)) + LOWER(SUBSTRING(name, 2, LEN(name)));