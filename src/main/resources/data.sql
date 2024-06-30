USE emp_management;

-- Create Organisation table
CREATE TABLE IF NOT EXISTS organisation (
    organisation_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    total_employees INT,
    total_cost DECIMAL(10, 2)
);

-- Insert data into Organisation table
INSERT INTO organisation (name, location, total_employees, total_cost) VALUES
('TechCorp', 'San Francisco', 7000, 3000000.00),
('HealthInc', 'Los Angeles', 6000, 2500000.00),
('EduWorld', 'Boston', 5000, 2000000.00),
('AutoWorks', 'Detroit', 4000, 1800000.00),
('MegaTech', 'Seattle', 8000, 3500000.00);

-- Create Department table
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
('Housekeeping', 1500, 200000.00),
('Marketing', 1100, 450000.00),
('R&D', 900, 700000.00),
('Legal', 600, 400000.00);

-- Create Employee table
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
('Michael', 'Brown', 32, 'Male', 1, 'Developer', 'Active', 85000.00, '2020-02-20', NULL),
('Sara', 'Wilson', 29, 'Female', 1, 'Developer', 'Active', 83000.00, '2021-03-11', NULL),
('David', 'Taylor', 40, 'Male', 2, 'Finance Manager', 'Active', 95000.00, '2015-08-15', NULL),
('Sophia', 'Anderson', 38, 'Female', 2, 'Accountant', 'Active', 76000.00, '2017-11-12', NULL),
('James', 'Martinez', 36, 'Male', 3, 'HR Manager', 'Active', 90000.00, '2018-06-21', NULL),
('Olivia', 'Thomas', 27, 'Female', 3, 'HR Assistant', 'Active', 60000.00, '2019-05-01', NULL),
('William', 'Moore', 45, 'Male', 4, 'Cleaner', 'Inactive', 32000.00, '2010-09-05', '2023-01-10'),
('Emma', 'Jackson', 22, 'Female', 4, 'Cleaner', 'Active', 29000.00, '2022-01-15', NULL),
('Ethan', 'White', 33, 'Male', 5, 'Marketing Manager', 'Active', 87000.00, '2016-03-01', NULL);

-- Commit the transaction
COMMIT;
