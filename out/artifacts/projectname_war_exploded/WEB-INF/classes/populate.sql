-- add logins for some users
INSERT INTO user(id,username,password,role,enabled) VALUES (1,'admin','admin', 'ROLE_ADMIN',TRUE);
INSERT INTO user(id,username,password,role,enabled) VALUES (2,'student','student', 'ROLE_STUDENT',TRUE);
INSERT INTO user(id,username,password,role,enabled) VALUES (3,'faculty','faculty', 'ROLE_FACULTY',TRUE);



update hibernate_sequence set next_val = 10;

















