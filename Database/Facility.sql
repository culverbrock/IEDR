CREATE TABLE facility (
  facility_id VARCHAR,
  facility_name VARCHAR(255) NOT NULL,
  facility_type VARCHAR(255),
  location_lat DECIMAL(10, 8),
  location_long DECIMAL(11, 8),
  capacity_mw DECIMAL(10,2)
  PRIMARY KEY (facility_id)
);