select username, fname, lname, started_on
 from Instructor
where cast(started_on as date) >= makedate(year(current_date()) - 20, 1);
