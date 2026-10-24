SELECT dept, number, title
FROM Class
WHERE LOWER(title) LIKE 'introduction%';
