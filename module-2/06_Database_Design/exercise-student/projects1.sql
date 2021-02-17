
CREATE TABLE employee (
	employee_id serial,
	department_id integer NOT NULL,
	first_name varchar(20) NOT NULL,
	last_name varchar(30) NOT NULL,
	job_title varchar(50) NOT NULL,
	birth_date date NOT NULL,
	gender char(1) NOT NULL,
	hire_date date NOT NULL,
	CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id),
	CONSTRAINT ck_gender CHECK (gender IN ('M', 'F'))
);

CREATE TABLE department (
	department_id serial,
	name varchar(40) UNIQUE NOT NULL,
	CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)
);

CREATE TABLE project (
	project_id serial,
	name varchar(40) UNIQUE NOT NULL,
	from_date date not null,
	to_date date not null,
	CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);

CREATE TABLE project_employee (
	project_id integer NOT NULL,
	employee_id integer NOT NULL,
	CONSTRAINT pk_project_employee PRIMARY KEY (project_id, employee_id)
);

ALTER TABLE employee ADD CONSTRAINT fk_employee_department FOREIGN KEY (department_id) REFERENCES department(department_id);

ALTER TABLE project_employee ADD FOREIGN KEY (project_id) REFERENCES project(project_id);
ALTER TABLE project_employee ADD FOREIGN KEY (employee_id) REFERENCES employee(employee_id);



INSERT INTO department (name) VALUES ('Department of Technology');
INSERT INTO department (name) VALUES ('Network Administration');
INSERT INTO department (name) VALUES ('Spend Money For Knowledge');
INSERT INTO department (name) VALUES ('Windows Support');

INSERT INTO project (name, from_date, to_date) VALUES ('Create Tesla', '1988-03-08', '2002-08-31');
INSERT INTO project (name, from_date, to_date) VALUES ('Modify Kernal', '1986-04-25', '2011-10-15');
INSERT INTO project (name, from_date, to_Date) VALUES ('Lil Tim', '1983-04-21', '2016-03-21');
INSERT INTO project (name, from_date, to_date) VALUES ('Speed Shop Repair', '2005-03-20', '2017-06-30');
INSERT INTO project (name, from_date, to_date) VALUES ('No Limit', '2010-07-15', '2016-03-14');
INSERT INTO project (name, from_date, to_date) VALUES ('Short Circuit', '2014-10-01', '2014-12-31');

INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (1, 'George', 'Washington', '1834-07-15', 'M', '2020-04-01', 'Old Man');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (1, 'Pennywise', 'Clown', '1732-12-28', 'M', '1732-12-28', 'Float Maker');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (2, 'Franklin', 'Tractor', '1984-03-15', 'M', '1999-04-25', 'John Deere Supplier');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (2, 'Dora', 'Explorer', '1999-08-23', 'F', '2000-08-23', 'GPS Builder');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (2, 'Gayle', 'Heile', '1960-03-07', 'F', '1983-04-21', 'Mother Of Lifetime');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (3, 'Sue', 'Mary', '1956-12-23', 'F', '2004-04-04', 'Stepmom Of Lifetime');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (3, 'Mia', 'Williamson', '2013-12-26', 'F', '2018-04-08', 'Daughter Of Kernal');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (3, 'Kernal', 'Hasty', '1986-04-25', 'M', '2019-11-14', 'Father');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (3, 'Emma', 'Williamson', '1992-02-20', 'F', '2019-11-14', 'Official Fiance');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (3, 'Dizzy', 'Wizzy', '2018-04-05', 'M', '2016-02-16', 'Cat');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (4, 'Ricky', 'Bobby', '1960-09-25', 'M', '2003-05-01', 'Car Racer Guy');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date, job_title)
VALUES (4, 'Cal', 'Naughton Jr', '1964-03-17', 'M', '2003-05-01', 'Backup Car Racer Guy');

INSERT INTO project_employee (project_id, employee_id) VALUES (1, 3);
INSERT INTO project_employee (project_id, employee_id) VALUES (1, 5);
INSERT INTO project_employee (project_id, employee_id) VALUES (3, 1);
INSERT INTO project_employee (project_id, employee_id) VALUES (3, 5);
INSERT INTO project_employee (project_id, employee_id) VALUES (3, 7);
INSERT INTO project_employee (project_id, employee_id) VALUES (4, 2);
INSERT INTO project_employee (project_id, employee_id) VALUES (4, 6);
INSERT INTO project_employee (project_id, employee_id) VALUES (5, 8);
INSERT INTO project_employee (project_id, employee_id) VALUES (5, 9);
INSERT INTO project_employee (project_id, employee_id) VALUES (6, 5);
INSERT INTO project_employee (project_id, employee_id) VALUES (6, 10);
INSERT INTO project_employee (project_id, employee_id) VALUES (6, 11);
