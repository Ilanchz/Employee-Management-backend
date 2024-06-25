-- Insert data into Organisation table
DROP TABLE organisation IF EXISTS;
DROP TABLE department IF EXISTS;
DROP TABLE employee IF EXISTS;
CREATE TABLE IF NOT EXISTS organisation (
                                            Citi_Id INT AUTO_INCREMENT PRIMARY KEY,
                                            name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    total_Employees INT,
    total_Cost DECIMAL(10, 2)
    );

INSERT INTO organisation (name, location, total_Employees, total_Cost) VALUES
    ('CitiBank', 'New York', 5000, 2000000.00);

-- Table creation for Department
CREATE TABLE IF NOT EXISTS department (
                                          dept_ID INT AUTO_INCREMENT PRIMARY KEY,
                                          dept_Name VARCHAR(255) NOT NULL,
    total_Employees INT,
    total_Cost DECIMAL(10, 2)
    );
-- Insert data into Department table
INSERT INTO department (dept_Name, total_Employees, total_Cost) VALUES
                                                                    ('IT', 1200, 500000.00),
                                                                    ('Finance', 1500, 600000.00),
                                                                    ('HR', 800, 300000.00),
                                                                    ('Housekeeping', 1500, 200000.00);



-- Table creation for Employee
CREATE TABLE IF NOT EXISTS employee (
                                        employee_Id INT AUTO_INCREMENT PRIMARY KEY,
                                        first_Name VARCHAR(255) NOT NULL,
    last_Name VARCHAR(255) NOT NULL,
    age INT,
    gender VARCHAR(10),
    dept_ID INT, -- Foreign key to department table
    role VARCHAR(255),
    status VARCHAR(20), -- Active or Inactive
    salary DECIMAL(10, 2),
    start_Date DATE,
    end_Date DATE,
    FOREIGN KEY (dept_ID) REFERENCES department (dept_ID)
    );


-- Insert data into Employee table
INSERT INTO employee (first_Name, last_Name, age, gender, dept_ID, role, status, salary, start_Date, end_Date) VALUES
                                                                                                                   ('John', 'Doe', 30, 'Male', 1, 'Developer', 'Active', 80000.00, '2020-01-15', NULL),
                                                                                                                   ('Jane', 'Smith', 28, 'Female', 2, 'Accountant', 'Active', 75000.00, '2019-03-10', NULL),
                                                                                                                   ('Mike', 'Johnson', 35, 'Male', 3, 'HR Manager', 'Active', 85000.00, '2018-07-22', NULL),
                                                                                                                   ('Emily', 'Davis', 40, 'Female', 4, 'Cleaner', 'Inactive', 30000.00, '2015-02-17', '2022-12-31'),
                                                                                                                   ('Alice', 'Brown', 25, 'Female', 1, 'Tester', 'Active', 65000.00, '2021-06-01', NULL),
                                                                                                                   ('Robert', 'Wilson', 45, 'Male', 2, 'Finance Manager', 'Active', 95000.00, '2010-10-10', NULL);
