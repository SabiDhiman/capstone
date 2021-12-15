INSERT INTO hubs (hub_name, location) VALUES ('Hub1', 'Central London');
INSERT INTO hubs (hub_name, location) VALUES ('Hub2', 'Bristol');
INSERT INTO hubs (hub_name, location) VALUES ('Hub3', 'Finchley');
INSERT INTO hubs (hub_name, location) VALUES ('Hub4', 'Greenwich');
INSERT INTO hubs (hub_name, location) VALUES ('Hub5', 'Holborn');
INSERT INTO hubs (hub_name, location) VALUES ('Hub6', 'Southwark');
INSERT INTO hubs (hub_name, location) VALUES ('Hub7', 'Lewisham');
INSERT INTO hubs (hub_name, location) VALUES ('Hub8', 'Newham');
INSERT INTO hubs (hub_name, location) VALUES ('Hub9', 'Hounslow');
INSERT INTO hubs (hub_name, location) VALUES ('Hub10', 'Stratford');
INSERT INTO hubs (hub_name, location) VALUES ('Hub11', 'Clapham');


INSERT INTO users (user_name, email) VALUES ('Aaishah', 'aaishah@gmail.com');
INSERT INTO users (user_name, email) VALUES ('Jess', 'aaishah@gmail.com');

INSERT INTO posts (hub_id, post_body) VALUES (1, 'Hello, please help us by donating the some items');
INSERT INTO posts (hub_id, post_body) VALUES (2, 'Help save lives by donating today to Hub2.');
INSERT INTO posts (hub_id, post_body) VALUES (3, 'Even the smallest of donations count');
INSERT INTO posts (hub_id, post_body) VALUES (4, 'Help us provide food, clothes and shelter for those in need.');
INSERT INTO posts (hub_id, post_body) VALUES (5, 'URGENT- donations needed please see list below!');
INSERT INTO posts (hub_id, post_body) VALUES (6, 'Looking for clothing donations, please contact us for further information.');

INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (1, 'Blankets', 3);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (2, 'Rucksacks', 10);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (3, 'Blankets', 13);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (4, 'Socks', 7);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (5, 'Tinned foods', 10);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (6, 'Coats', 4);

INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (1, 1, 2);
INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (2, 2, 3);
INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (1, 1, 2);
INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (2, 4, 1);
INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (2, 2, 3);
INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (1, 6, 2);