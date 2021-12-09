INSERT INTO hubs (hub_name, location) VALUES ('hub1', 'london');
INSERT INTO hubs (hub_name, location) VALUES ('hub2', 'bristol');
INSERT INTO hubs (hub_name, location) VALUES ('hub3', 'london');
INSERT INTO hubs (hub_name, location) VALUES ('hub1', 'bristol');

INSERT INTO users (user_name, email) VALUES ('Aaishah', 'aaishah@gmail.com');
INSERT INTO users (user_name, email) VALUES ('Jess', 'aaishah@gmail.com');

INSERT INTO posts (hub_id, post_body) VALUES (1, 'hello, please help us by donating the some items');
INSERT INTO posts (hub_id, post_body) VALUES (2, 'hello world');
INSERT INTO posts (hub_id, post_body) VALUES (3, 'hi there world');

INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (1, 'blankets', 3);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (1, 'rucksacks', 10);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (2, 'blankets', 13);
INSERT INTO requests (post_id, donation_type, quantity_needed) VALUES (3, 'socks', 7);

INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (1, 1, 2);
INSERT INTO donations (user_id, request_id, donation_quantity) VALUES (2, 2, 2);