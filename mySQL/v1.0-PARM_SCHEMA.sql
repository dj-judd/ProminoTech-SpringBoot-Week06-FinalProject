DROP TABLE IF EXISTS res_assets;
DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS assets;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS locations;

CREATE TABLE locations (
  id int unsigned NOT NULL AUTO_INCREMENT,
  street varchar(45) NOT NULL,
  city varchar(45) NOT NULL, 
  state varchar(45) NOT NULL,
  zip varchar(45) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE users (
  id int unsigned NOT NULL AUTO_INCREMENT,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL, 
  email varchar(45) NOT NULL,
  permissions enum('ADMIN', 'SUPER_USER', 'USER') NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE assets (
  id int unsigned NOT NULL AUTO_INCREMENT,
  location_fk int unsigned NOT NULL,
  common_name varchar(45) NOT NULL,
  make varchar(45) NOT NULL, 
  model varchar(45) NOT NULL,
  model_number varchar(45) NOT NULL,
  serial_number varchar(45) NOT NULL,
  status enum('GOOD', 'DAMAGED', 'BROKEN') NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (location_fk) REFERENCES locations (id)
);

CREATE TABLE reservations (
  id int unsigned NOT NULL AUTO_INCREMENT,
  location_fk int unsigned NOT NULL,
  user_fk int unsigned NOT NULL,
  res_date timestamp NOT NULL,
  planned_checkin_date timestamp NOT NULL,
  checkout_date timestamp NOT NULL,
  checkin_date timestamp NOT NULL,
  created_on timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (location_fk) REFERENCES locations (id),
  FOREIGN KEY (user_fk) REFERENCES users (id)
);

CREATE TABLE res_assets (
  res_fk int unsigned NOT NULL,
  asset_fk int unsigned NOT NULL,
  FOREIGN KEY (res_fk) REFERENCES reservations (id),
  FOREIGN KEY (asset_fk) REFERENCES assets (id)
);
