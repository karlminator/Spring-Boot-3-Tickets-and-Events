INSERT INTO organizers (id, name, description) VALUES (101, 'Ica', 'Ica''s dagliga matvaruhandel');
INSERT INTO organizers (id, name, description) VALUES (102, 'Karbin', 'Karbin Klätterhall');

INSERT INTO venues (id, name, street, city, country) VALUES (201, 'Ica''s Main Office', 'Solnagatan 25', 'Stockholm', 'Sverige');
INSERT INTO venues (id, name, street, city, country) VALUES (202, 'Västberga Coop', 'Västberga Industriområde', 'Stockholm', 'Sverige');
INSERT INTO venues (id, name, street, city, country) VALUES (203, 'Kungliga Slottet', 'Kungsbacken 1', 'Stockholm', 'Sverige');
INSERT INTO venues (id, name, street, city, country) VALUES (204, 'El Chapo', 'El Chapo no.1', 'Washington', 'USA');

INSERT INTO events (id, name, organizer_id, venue_id, start_date, end_date) VALUES (501, 'Ica''s Årsmöte', 101, 201, '2023-10-25', '2023-10-25');
INSERT INTO events (id, name, organizer_id, venue_id, start_date, end_date) VALUES (502, 'Ica''s Personalfest', 101, 201, '2023-10-25', '2023-10-25');
INSERT INTO events (id, name, organizer_id, venue_id, start_date, end_date) VALUES (503, 'Stora Klätterdagen', 102, 202, '2024-06-29', '2024-06-29');
INSERT INTO events (id, name, organizer_id, venue_id, start_date, end_date) VALUES (504, 'Freesolo', 102, 204, '2026-06-29', '2026-06-29');

INSERT INTO products (id, event_id, name, description, price) VALUES (801, 501, 'Standard', 'Standard Conference Ticket', 499.00);
INSERT INTO products (id, event_id, name, description, price) VALUES (802, 501, 'Premium', 'Premium Conference Ticket', 649.00);
INSERT INTO products (id, event_id, name, description, price) VALUES (803, 502, 'Standard', 'Developer Day Ticket', 195.50);
INSERT INTO products (id, event_id, name, description, price) VALUES (804, 503, 'Regular', 'Regular Entrance', 35.00);
INSERT INTO products (id, event_id, name, description, price) VALUES (805, 503, 'VIP', 'VIP Bonus Entrance', 65.00);