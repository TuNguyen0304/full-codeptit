select da.gender, count(db.id) as total_donations
 from Donors da
 inner join Donations db on da.id = db.donor_id
group by gender