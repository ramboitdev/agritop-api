-- Create tables for agrisens project
CREATE TABLE IF NOT EXISTS seed_lots (
  id SERIAL PRIMARY KEY,
  variety VARCHAR(255) NOT NULL,
  supplier VARCHAR(255),
  year INT NOT NULL,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT now()
);

CREATE TABLE IF NOT EXISTS parcels (
  id SERIAL PRIMARY KEY,
  owner VARCHAR(255),
  name VARCHAR(255),
  geom GEOMETRY,
  soil_type VARCHAR(100),
  zone VARCHAR(100),
  created_at TIMESTAMP WITH TIME ZONE DEFAULT now()
);

CREATE TABLE IF NOT EXISTS cultures (
  id SERIAL PRIMARY KEY,
  parcel_id INT REFERENCES parcels(id),
  seed_lot_id INT REFERENCES seed_lots(id),
  date_sowed DATE,
  stage VARCHAR(100),
  expected_yield DOUBLE PRECISION,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT now()
);

CREATE TABLE IF NOT EXISTS climate_observations (
  id SERIAL PRIMARY KEY,
  parcel_id INT REFERENCES parcels(id),
  observed_at TIMESTAMP WITH TIME ZONE NOT NULL,
  temperature DOUBLE PRECISION,
  precipitation DOUBLE PRECISION,
  humidity DOUBLE PRECISION,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT now()
);
