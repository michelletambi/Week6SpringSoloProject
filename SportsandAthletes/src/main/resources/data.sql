--You have to insert into Sport first because it is a foreign key in the athletes table
INSERT INTO SPORTS (id, name, location) VALUES (1, 'Basketball', "Basketball Court");
INSERT INTO SPORTS (id, name, location) VALUES (2, 'Long Jump', "Track");
INSERT INTO SPORTS (id, name, location) VALUES (3, '100m Sprint', "Track");
INSERT INTO SPORTS (id, name, location) VALUES (4, '50m Butterfly', "Swimming Pool");
INSERT INTO SPORTS (id, name, location) VALUES (5, 'Discus Throw', "Field");
INSERT INTO SPORTS (id, name, location) VALUES (6, 'Park', "Urban Sports Park");

INSERT INTO ATHLETE (ID, FIRST_NAME, LAST_NAME, GENDER, COUNTRY, sport_id_id) VALUES (16, 'Poul', 'Storres', 'Male', 'France', 1);

insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (1, 'Chauncey', 'Utteridge', 'Male', 'Sweden', 1);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (2, 'Victoir', 'Marin', 'Male', 'Egypt', 1);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (3, 'Alyce', 'Dawltrey', 'Female', 'Brazil', 1);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (4, 'Brendon', 'Odeson', 'Male', 'Sweden', 1);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (5, 'Mal', 'Yanov', 'Male', 'China', 2);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (6, 'Katerine', 'Basketter', 'Female', 'Portugal', 2);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (7, 'Milt', 'Knapton', 'Male', 'China', 2);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (8, 'Jimmie', 'de Clerq', 'Polygender', 'Indonesia', 2);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (9, 'Bjorn', 'Leonardi', 'Female', 'Thailand', 2);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (10, 'Angie', 'Williams', 'Male', 'China', 2);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (11, 'Mahala', 'Bolitho', 'Female', 'Russia', 1);
insert into ATHLETE (id, firstName, lastName, gender, country ,sport_id_id) values (12, 'Corabel', 'Toms', 'Female', 'Kazakhstan', 3);
insert into ATHLETE (id, firstName, lastName, gender, country ,sport_id_id) values (13, 'Cord', 'Titford', 'Male', 'China'), 3;
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (14, 'Alvin', 'Wigin', 'Male', 'France', 3);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (15, 'Happy', 'Linneman', 'Female', 'China', 2);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (16, 'Poul', 'Storres', 'Male', 'France', 4);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (17, 'Albrecht', 'Husher', 'Male', 'Croatia', 4);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (18, 'Ky', 'Madsen', 'Male', 'Bolivia', 4);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (19, 'Kerrill', 'Sotham', 'Non-binary', 'Indonesia', 4);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (20, 'Jessie', 'Mongenot', 'Female', 'Czech Republic', 5);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (21, 'Wake', 'Crewes', 'Male', 'China', 5);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (22, 'Morganica', 'Saull', 'Female', 'China', 5);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (23, 'Kizzee', 'Beaudry', 'Female', 'China', 6);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (24, 'Dinnie', 'Garrish', 'Female', 'Ireland', 6);
insert into ATHLETE (id, firstName, lastName, gender, country, sport_id_id) values (25, 'Dawn', 'Rieme', 'Female', 'South Africa'1);