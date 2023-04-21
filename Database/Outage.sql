CREATE TABLE outage (
   outage_id INT NOT NULL AUTO_INCREMENT,
   facility_id INT NOT NULL,
   start_time DATETIME NOT NULL,
   end_time DATETIME,
   volume_affected DECIMAL(10,2) NOT NULL,
   volume_unaffected DECIMAL(10,2) NOT NULL,
   PRIMARY KEY (outage_id),
   FOREIGN KEY (facility_id) REFERENCES facility(facility_id)
);