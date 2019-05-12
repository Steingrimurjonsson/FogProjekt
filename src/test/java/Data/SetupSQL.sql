/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  stoff
 * Created: May 12, 2019
 */

-- There is a schema named "useradmin" with one table: "Users"
-- The test schema is named "useradminTest"
-- make a copy of the table
CREATE TABLE FOG.UsersTest LIKE FOG.user;
INSERT INTO `UsersTest` VALUES 
    (1,'jens@somewhere.com','jensen','customer','customer','customer','customer','customer','customer','customer','customer'),
    (2,'ken@somewhere.com','kensen','customer','customer','customer','customer','customer','customer','customer','customer'),
    (3,'robin@somewhere.com','batman','employee','customer','customer','customer','customer','customer','customer','customer'),
    (4,'someone@nowhere.com','sesam','customer','customer','customer','customer','customer','customer','customer','customer');

-- make a new user for the test database
CREATE USER 'admin' IDENTIFIED BY 'admin2019';
GRANT ALL PRIVILEGES ON useradminTest.* TO 'admin';