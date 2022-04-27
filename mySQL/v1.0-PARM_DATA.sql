-- Users
INSERT INTO users (first_name, last_name, email, permissions) VALUES('DJ', 'Judd', 'DJJ@aol.com', 'ADMIN');
INSERT INTO users (first_name, last_name, email, permissions) VALUES('Hektor', 'Attaway', 'HKA@gmail.com', 'GUEST');
INSERT INTO users (first_name, last_name, email, permissions) VALUES('Dave', 'Roberts', 'DR@gmail.com', 'USER');
INSERT INTO users (first_name, last_name, email, permissions) VALUES('Josh', 'Baxter', 'JB@gmail.com', 'GUEST');
INSERT INTO users (first_name, last_name, email, permissions) VALUES('Kenneth', 'Lovette', 'Kenny@gmail.com', 'USER');


-- Locations
INSERT INTO locations (name, street, city, state, zip) VALUES('Cherry Hill Fountain', 'Central Park West', 'New York', 'NY', '10024');
INSERT INTO locations (name, street, city, state, zip) VALUES('Golden Gate Bridge', 'Coastal Trail', 'San Francisco', 'CA', '94129');
INSERT INTO locations (name, street, city, state, zip) VALUES('Griffith Park Observatory', '2715 N Vermont Ave', 'Los Angeles', 'CA', '90027');
INSERT INTO locations (name, street, city, state, zip) VALUES('Space Needle', '400 Broad St', 'Seattle', 'WA', '98109');
INSERT INTO locations (name, street, city, state, zip) VALUES('Walmart Global People Center', '508 SW 8th St', 'Bentonville', 'AR', '72712');


-- Assets
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'VR Microphone', 'Senheiser', 'AMBEO VR 3D Microphone', '507195', '12351v619', 'GOOD');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'Studio Monitor Speaker', 'KRK', 'Classic 8"', 'CL8G3-NA', '12345v123', 'GOOD');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'Studio Monitor Speaker', 'KRK', 'Classic 8"', 'CL8G3-NA', '12345v124', 'GOOD');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'RGB LED Panel Light', 'Aputure', 'amaran p60C', 'AMP60CUS', 'abcd1000', 'GOOD');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'RGB LED Panel Light', 'Aputure', 'amaran p60C', 'AMP60CUS', 'abcd1002', 'GOOD');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'RGB LED Panel Light', 'Aputure', 'amaran p60C', 'AMP60CUS', 'abcd1003', 'BROKEN');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'RGB LED Panel Light', 'Aputure', 'amaran p60C', 'AMP60CUS', 'abcd1004', 'GOOD');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'RGB LED Panel Light', 'Aputure', 'amaran p60C', 'AMP60CUS', 'abcd1005', 'DAMAGED');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'RGB LED Panel Light', 'Aputure', 'amaran p60C', 'AMP60CUS', 'abcd1006', 'BROKEN');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'Studio Camera', 'Blackmagic', 'Studio Camera 4K Pro', 'CINSTUDMFT/G24PDF', 'CAM1101', 'GOOD');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'Studio Camera', 'Blackmagic', 'Studio Camera 4K Pro', 'CINSTUDMFT/G24PDF', 'CAM1102', 'DAMAGED');
INSERT INTO assets (location_fk, common_name, make, model, model_number, serial_number, status) VALUES('4', 'Studio Camera', 'Blackmagic', 'Studio Camera 4K Pro', 'CINSTUDMFT/G24PDF', 'CAM1103', 'GOOD');
