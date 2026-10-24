select t.username, t.dept, t.number
 from Teaches t
join Instructor i
 on t.username = i.username
order by i.lname desc
limit 2;