--GradeBook Seed Data
Use GradeBook;

INSERT INTO Building VALUES ('Caperton','Parkersburg','West Virginia',26101);
INSERT INTO Building VALUES ('MAIN', 'Parkersburg', 'West Virginia', 26101);

INSERT INTO Semester VALUES ('2018-01-15', '2018-05-10');
INSERT INTO Semester VALUES ('2018-08-15', '2018-12-15');
INSERT INTO Semester VALUES ('2022-01-15', '2022-05-10');

INSERT INTO Course VALUES ('CS122', 'Programming 2',  3, 1);
INSERT INTO Course VALUES ('CS201', 'Database Theory and Design', 3, 1);

INSERT INTO Professor VALUES ('Charles', 'Almond', 'calmond@wvup.edu', '304-422-5232', '809 7th Street Parkersburg, WV 26101');
INSERT INTO Professor VALUES ('Doug', 'Rhodes', 'drhodes@wvup.edu','304-917-4741', '820 Market St, Parkersburg, WV 26101');

INSERT INTO Division (Time) VALUES ('M T W TH F SA SU 8:00-8:00');
INSERT INTO Division (Time) VALUES ('M T W TH F SA SU 8:00-8:00');

INSERT INTO Student VALUES ('Gage', 'Carpenter', 'gcarpen2@wvup.edu', '304-588-9230', '3555 Farnam Street Omaha, NE 68131');
INSERT INTO Student VALUES ('Thomas', 'Fullton', 'TFullton@gmail.com', '740-350-6696', 'narnia' );

INSERT INTO Assignment VALUES ('Repo Design', 'Final' ,100);
INSERT INTO Assignment VALUES ('Web Design Exam', 'Final' , 100);
INSERT INTO Assignment VALUES ('Build A Website', 'Final', 100);
INSERT INTO Assignment VALUES ('Build A Network', 'Final' , 100);

INSERT INTO Assignment VALUES ('Cisco Summary', 'Final' , 100);
INSERT INTO Assignment VALUES ('Five Card Stud', 'Final' , 100);
INSERT INTO Assignment VALUES ('Discrete Math Projects', 'Final' , 100);
INSERT INTO Assignment VALUES ('Discrete Math Exam', 'Final' , 100);

INSERT INTO Grade (Points) VALUES (100);    
INSERT INTO Grade (Points) VALUES (100);

