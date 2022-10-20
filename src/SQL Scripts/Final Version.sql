USE Gradebook;

BEGIN TRANSACTION;

DROP TABLE IF EXISTS Grade.Grade;
DROP TABLE IF EXISTS Enrollment.Enrollment;
DROP TABLE IF EXISTS Division.Division;
DROP TABLE IF EXISTS Semester.Semester;
DROP TABLE IF EXISTS Course.Course;
DROP TABLE IF EXISTS Professor.Professor;
DROP TABLE IF EXISTS Student.Student;
DROP TABLE IF EXISTS Assignment.Assignment;
DROP TABLE IF EXISTS Room.Room;
DROP TABLE IF EXISTS Building.Building;
DROP VIEW IF EXISTS HighestScore;
DROP VIEW IF EXISTS AverageScore;
DROP USER IF EXISTS Assistant;

CREATE TABLE Building (
	ID INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(60) NOT NULL,
	City VARCHAR(30) NOT NULL,
	State VARCHAR(30) NOT NULL,
	Zipcode VARCHAR(10) NOT NULL
);

CREATE TABLE Room (
	ID INT PRIMARY KEY IDENTITY(1,1),
	BuildingID INT Foreign Key References Building.Building (ID)
);

CREATE TABLE Professor (
	ID INT PRIMARY KEY IDENTITY(1,1),
	FirstName NVARCHAR(60) NOT NULL,
	LastName NVARCHAR(60) NOT NULL,
	Email VARCHAR(60) NOT NULL,
	PhoneNumber VARCHAR(16) NOT NULL,
	Address VARCHAR(40) NOT NULL
);

CREATE TABLE Semester (
	ID INT PRIMARY KEY IDENTITY(1,1),
	StartDate DATE NOT NULL,
	EndDate DATE NOT NULL
);

CREATE TABLE Course (
	ID INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(20) NOT NULL,
	Description VARCHAR(60) NOT NULL,
	CreditHour SMALLINT NOT NULL,
	ProfessorID INT Foreign Key References Professor.Professor (ID)
);

CREATE TABLE Assignment (
	ID INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(60) NOT NULL,
	Type VARCHAR(15) NOT NULL,
	PointsPossible INT NOT NULL
);

CREATE TABLE Division (
	ID INT PRIMARY KEY IDENTITY(1,1),
	Time VARCHAR(60) NOT NULL,
	ProfessorID INT Foreign Key References Professor.Professor (ID),
	SemesterID INT Foreign Key References Semester.Semester (ID),
	CourseID INT Foreign Key References Course.Course (ID),
	RoomID INT Foreign Key References Room.Room (ID)
);

CREATE TABLE Student (
	ID INT PRIMARY KEY IDENTITY(1,1),
	FirstName NVARCHAR(60) NOT NULL,
	LastName NVARCHAR(60) NOT NULL,
	Email VARCHAR(60) NOT NULL,
	PhoneNumber VARCHAR(16) NOT NULL,
	Address VARCHAR(40) NOT NULL

);

CREATE TABLE Enrollment (
	PRIMARY KEY (StudentID, DivisionID),
	EnrollDate DATE NOT NULL,
	CurrentGrade INT NOT NULL,
	MidtermGrade INT,
	FinalGrade INT,
	DivisionID INT Foreign Key References Division.Division (ID),
	StudentID INT Foreign Key References Student.Student (ID)
);


CREATE TABLE Grade (
	ID INT PRIMARY KEY IDENTITY(1,1),
	Points INT NOT NULL,
	AssignmentID INT Foreign Key References Assignment.Assignment(ID),
	DivisionID INT Foreign Key References Division.Division (ID),
	StudentID INT Foreign Key References Student.Student (ID),
	ProfessorID INT Foreign key References Student.Student (ID)
);
GO 

 -- Highest Score
CREATE VIEW HighestScore AS
	(SELECT MAX(Points) AS HighestScore
		FROM Grade
			WHERE (DivisionID = DivisionID) AND (StudentID = StudentID) AND (AssignmentID = AssignmentID));
GO

-- Average Score
CREATE VIEW AverageScore AS
	(SELECT AVG(Points) AS AverageScore
		FROM Grade
			WHERE (DivisionID = DivisionID) AND (StudentID = StudentID) AND (AssignmentID = AssignmentID)); 
GO

-- Points Reveived
ALTER TABLE Grade
	ADD CHECK (Points >= 0);

-- Student.Student Index
CREATE UNIQUE INDEX Student ON Enrollment (StudentID, DivisionID);

-- AssistantProfessor 
CREATE USER Assistant WITHOUT LOGIN;
GRANT UPDATE (Points) ON Grade TO AssistantProfessor;

COMMIT TRANSACTION;