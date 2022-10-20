import Assignment.Assignment;
import Assignment.AssignmentRepository;
import Building.Building;
import Building.BuildingRepository;
import Course.Course;
import Course.CourseRepository;
import Division.Division;
import Division.DivisionRepository;
import Enrollment.Enrollment;
import Enrollment.EnrollmentRepository;
import Grade.Grade;
import Grade.GradeRepository;
import Professor.Professor;
import Professor.ProfessorRepository;
import Room.Room;
import Room.RoomRepository;
import Semester.Semester;
import Semester.SemesterRepository;
import Student.Student;
import Student.StudentRepository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The main class that acts as the hub for the repository design patterns terminal interface representation of a grade book
 * The Grade book uses CRUD operations to satisfy the business requirements of a Grade book
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Application
{
    //Repositories
    private final AssignmentRepository _ASSIGNMENT_REPOSITORY;
    private final BuildingRepository _BUILDING_REPOSITORY;
    private final CourseRepository _COURSE_REPOSITORY;
    private final DivisionRepository _DIVISION_REPOSITORY;
    private final EnrollmentRepository _ENROLLMENT_REPOSITORY;
    private final GradeRepository _GRADE_REPOSITORY;
    private final ProfessorRepository _PROFESSOR_REPOSITORY;
    private final RoomRepository _ROOM_REPOSITORY;
    private final SemesterRepository _SEMESTER_REPOSITORY;
    private final StudentRepository _STUDENT_REPOSITORY;
    //Scanner
    private final Scanner SCAN;

    /**
     * creates a new instance of each repository.
     */
    public Application(){
        this._ASSIGNMENT_REPOSITORY = new AssignmentRepository();
        this._BUILDING_REPOSITORY = new BuildingRepository();
        this._COURSE_REPOSITORY = new CourseRepository();
        this._DIVISION_REPOSITORY = new DivisionRepository();
        this._ENROLLMENT_REPOSITORY = new EnrollmentRepository();
        this._GRADE_REPOSITORY = new GradeRepository();
        this._PROFESSOR_REPOSITORY = new ProfessorRepository();
        this._ROOM_REPOSITORY = new RoomRepository();
        this._SEMESTER_REPOSITORY = new SemesterRepository();
        this._STUDENT_REPOSITORY = new StudentRepository();
        this.SCAN = new Scanner(System.in);
    }
    
    /**
     * Entry point for the Application
     * Allows users to participate with the terminal to perform a set of operations
     * (C) create
     * (R) read
     * (U) update
     * (D) delete
     */
    public void start(){
        int menu = 0;
        System.out.println("Welcome to CS 201 GradeBook");
        do
        {
            System.out.println("1) List information about a Student.Student, Professor.Professor, Assignment.Assignment, Course.Course, Division.Division, Enrollment.Enrollment, Semester.Semester, Building.Building, Room.Room, or Grade.Grade");
            System.out.println("2) add a new  Student.Student, Professor.Professor, Assignment.Assignment, Course.Course, Division.Division, Enrollment.Enrollment, Semester.Semester, Building.Building, Room.Room, or Grade.Grade");
            System.out.println("3) Update a Student.Student, Professor.Professor, Assignment.Assignment, Course.Course, Division.Division, Enrollment.Enrollment, Semester.Semester, Building.Building, Room.Room, or Grade.Grade");
            System.out.println("4) Remove a Student.Student, Professor.Professor, Assignment.Assignment, Course.Course, Division.Division, Enrollment.Enrollment, Semester.Semester, Building.Building, Room.Room, or Grade.Grade");
            System.out.println("5) Exit \n");
            try
            {
                System.out.print("Enter Your Selection");
                menu = SCAN.nextInt();
            }
            catch (Exception ex)
            {
                System.err.println("There was a problem with your menu selection. Please try again");
            }
            switch (menu)
            {
                case 1:
                    listInformation();
                    break;
                case 2:
                    addInformation();
                    break;
                case 3:
                    updateInformation();
                    break;
                case 4:
                    removeInformation();
                    break;
            }
        }while (menu != 5); // While we choose not to exit
    }

    /**
     * Allows the user to select a table to list information from
     *
     */
    public void listInformation() 
    {
        int menu = 0;
         do {
            System.out.println("\n\nPlease select from one of the following options\n");
            System.out.println("1) List Information about Assignments");
            System.out.println("2) List Information about Buildings");
            System.out.println("3) List Information about Courses");
            System.out.println("4) List Information about Divisions");
            System.out.println("5) List Information about Enrollments");
            System.out.println("6) List Information about Grades");
            System.out.println("7) List Information about Professors");
            System.out.println("8) List Information about Rooms");
            System.out.println("9) List Information about Semesters");
            System.out.println("10) List Information about Students");
            System.out.println("11) Exit\n");
            try {
                System.out.print("Enter Your Selection: ");
                menu = SCAN.nextInt();
            } catch (Exception ex) {
                System.err.println("There was a problem with your menu selection.  Please try again");
            }

            switch (menu) {
                case 1:
                try{
                    ArrayList<Assignment> assignments = _ASSIGNMENT_REPOSITORY.search("where ID > 0");
                    for (Assignment assignment : assignments) {
                        System.out.println(assignment); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 2:
                try{
                    ArrayList<Building> buildings = _BUILDING_REPOSITORY.search("where ID > 0");
                    for (Building building : buildings) {
                        System.out.println(building); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 3:
                    try{
                    ArrayList<Course> courses = _COURSE_REPOSITORY.search("where ID > 0");
                    for (Course course : courses) {
                        System.out.println(course); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 4:
                    try{
                    ArrayList<Division> divisions = _DIVISION_REPOSITORY.search("where ID > 0");
                    for (Division division : divisions) {
                        System.out.println(division); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 5:
                    try{
                    ArrayList<Enrollment> enrollments = _ENROLLMENT_REPOSITORY.search("where ID > 0");
                    for (Enrollment enrollment : enrollments) {
                        System.out.println(enrollment); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 6:
                    try{
                    ArrayList<Grade> grades = _GRADE_REPOSITORY.search("where ID > 0");
                    for (Grade grade : grades) {
                        System.out.println(grade); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 7:
                    try{
                    ArrayList<Professor> professors = _PROFESSOR_REPOSITORY.search("where ID > 0");
                    for (Professor professor : professors) {
                        System.out.println(professor); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 8:
                    try{
                    ArrayList<Room> rooms = _ROOM_REPOSITORY.search("where ID > 0");
                    for (Room room : rooms) {
                        System.out.println(room); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 9:
                    try{
                    ArrayList<Semester> semesters = _SEMESTER_REPOSITORY.search("where ID > 0");
                    for (Semester semester : semesters) {
                        System.out.println(semester); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
                case 10:
                try{
                    ArrayList<Student> students = _STUDENT_REPOSITORY.search("where ID > 0");
                    for (Student student : students) {
                        System.out.println(student); 
                    }
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to list");
                        }
                    break;
            }
        } while (menu != 11); //While we choose not to exit
    }

    /**
     * allows the user to add information to the database
     */
    public void addInformation() {
        int menu = 0;
        
        do
        {
            System.out.println("\n\nPlease select from one of the following options\n");
            System.out.println("1) Add Information about Assignments");
            System.out.println("2) Add Information about Buildings");
            System.out.println("3) Add Information about Courses");
            System.out.println("4) Add Information about Divisions");
            System.out.println("5) Add Information about Enrollments");
            System.out.println("6) Add Information about Grades");
            System.out.println("7) Add Information about Professors");
            System.out.println("8) Add Information about Rooms");
            System.out.println("9) Add Information about Semesters");
            System.out.println("10) Add Information about Students");
            System.out.println("11) Exit\n");
            try {
                System.out.print("Enter Your Selection: ");
                menu = SCAN.nextInt();
            } catch (Exception ex) {
                System.err.println("There was a problem with your menu selection. Try again");
            }
            switch (menu) {
                case 1:   
                try{ 
                    System.out.println("\n Assignments Selected\n");
                    System.out.println("Provide the name of the assignment?");
                    String assignmentName = SCAN.nextLine();
                    System.out.println("Provide the type of assignment?");
                    String assignmentType = SCAN.nextLine();
                    System.out.println("Provide the amount of points possible");
                    int pointsPossible = Integer.parseInt(SCAN.nextLine());
                    Assignment assignment = new Assignment(assignmentName, assignmentType, pointsPossible);
                    _ASSIGNMENT_REPOSITORY.add(assignment);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 2:
                try{        
                    System.out.println("\n Buildings Selected \n");
                    System.out.println("Provide the name of the building");
                    String buildingName = SCAN.nextLine();
                    System.out.println("Provide the city the building is located in");
                    String buildingCity = SCAN.nextLine();
                    System.out.println("provide the state the building is located in");
                    String buildingState = SCAN.nextLine();
                    System.out.println("provide the zipcode the building is located in");
                    int buildingZipcode = Integer.parseInt(SCAN.nextLine());
                    Building building = new Building(buildingName,buildingCity, buildingState, buildingZipcode);
                    _BUILDING_REPOSITORY.add(building);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 3:
                try{
                    System.out.println("\n Courses Selected \n");
                    System.out.println("Provide the name of the course");
                    String courseName = SCAN.nextLine();
                    System.out.println("Provide the description of the course");
                    String courseDescription = SCAN.nextLine();
                    System.out.println("Provide the amount of credit hours");
                    int courseCreditHours = Integer.parseInt(SCAN.nextLine());
                    System.out.println("Provide the professors ID who instructs the course");
                    int courseProfessorID = Integer.parseInt(SCAN.nextLine());
                    Professor courseProfessor = _PROFESSOR_REPOSITORY.get(courseProfessorID);

                    Course course = new Course(courseName, courseDescription, courseCreditHours, courseProfessor );
                    _COURSE_REPOSITORY.add(course);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 4:
                try{
                    System.out.println("\n Divisions Selected \n");
                    System.out.println("Provide the time this division begins");
                    int divisionTime = Integer.parseInt(SCAN.nextLine());
                    System.out.println("Provide the division");
                    int divisionProfessorID = Integer.parseInt(SCAN.nextLine());
                    Professor divisionProfessor = _PROFESSOR_REPOSITORY.get(divisionProfessorID);
                    System.out.println("Provide the semester ID for the chosen division");
                    int divisionSemesterID = Integer.parseInt(SCAN.nextLine());
                    Semester divisionSemester = _SEMESTER_REPOSITORY.get(divisionSemesterID);
                    System.out.println("Provide the division ID for the chosen division");
                    int divisionCourseID = Integer.parseInt(SCAN.nextLine());
                    Course divisionCourse = _COURSE_REPOSITORY.get(divisionCourseID);
                    System.out.println("Provide the room ID for the chosen division");
                    int divisionRoomID = Integer.parseInt(SCAN.nextLine());
                    Room divisionRoom = _ROOM_REPOSITORY.get(divisionRoomID);

                    Division division = new Division(divisionTime, divisionProfessor, divisionSemester, divisionCourse, divisionRoom);
                    _DIVISION_REPOSITORY.add(division);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 5:
                try{
                    
                    System.out.println("\n Enrollments Selected \n");
                    System.out.println("Provide the date enrolled [mm/dd/yyyy]");
                    String enrollmentEnrollDate = SCAN.nextLine();
                    DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");
                    Date date = null;
                    try {
                        date = (Date) formatter.parse(enrollmentEnrollDate);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Provide The Current Grade.Grade");
                    int currentGrade = Integer.parseInt(SCAN.nextLine());
                    System.out.println("Provide The Midterm Grade.Grade");
                    int midtermGrade = Integer.parseInt(SCAN.nextLine());
                    System.out.println("Provide The Final Grade.Grade");
                    int finalGrade = Integer.parseInt(SCAN.nextLine());
                    System.out.println("Provide the Division.Division ID");
                    int enrollmentDivisionID = Integer.parseInt(SCAN.nextLine());
                    Division enrollmentDivision = _DIVISION_REPOSITORY.get(enrollmentDivisionID);
                    System.out.println("Provide the Student.Student ID");
                    int enrollmentStudentID = Integer.parseInt(SCAN.nextLine());
                    Student enrollmentStudent = _STUDENT_REPOSITORY.get(enrollmentStudentID);

                    Enrollment enrollment = new Enrollment(date,currentGrade,midtermGrade,finalGrade,enrollmentDivision,enrollmentStudent);
                    _ENROLLMENT_REPOSITORY.add(enrollment);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 6:
                try{
                    System.out.println("\n Grades Selected \n");
                    System.out.println("Provide the amount of points recieved ");
                    int gradePoints = Integer.parseInt(SCAN.nextLine());
                    System.out.println("Provide the assignment ID");
                    int gradeAssignmentID = Integer.parseInt(SCAN.nextLine());
                    Assignment gradeAssignment = _ASSIGNMENT_REPOSITORY.get(gradeAssignmentID);
                    System.out.println("Provide the Division.Division ID");
                    int gradeDivsionID = Integer.parseInt(SCAN.nextLine());
                    Division gradeDivision = _DIVISION_REPOSITORY.get(gradeDivsionID);
                    System.out.println("Provide the Student.Student ID");
                    int gradeStudentID = Integer.parseInt(SCAN.nextLine());
                    Student gradeStudent = _STUDENT_REPOSITORY.get(gradeStudentID);
                    System.out.println("Provide the Professor.Professor ID");
                    int gradeProfessorID = Integer.parseInt(SCAN.nextLine());
                    Professor gradeProfessor = _PROFESSOR_REPOSITORY.get(gradeProfessorID);

                    Grade grade = new Grade(gradePoints,gradeAssignment,gradeDivision,gradeStudent,gradeProfessor);
                    _GRADE_REPOSITORY.add(grade);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 7:
                try{
                    System.out.println("\n Professors Selected \n");
                    System.out.println("Provide the professors first name");
                    String professorFirstName = SCAN.nextLine();
                    System.out.println("Provide the professors last name");
                    String professorLastName = SCAN.nextLine();
                    System.out.println("provide the professors email");
                    String professorEmail = SCAN.nextLine();
                    System.out.println("provide the professors phone number");
                    String professorPhoneNumber = SCAN.nextLine();
                    System.out.println("provide the professors address");
                    String professorAddress = SCAN.nextLine();

                    Professor professor = new Professor(professorFirstName, professorLastName, professorEmail, professorPhoneNumber, professorAddress);
                    _PROFESSOR_REPOSITORY.add(professor);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 8:
                try{
                    System.out.println("\n Rooms Selected \n");
                    System.out.println("Provide your Building.Building ID to which the room belongs");
                    int roomBuildingID = Integer.parseInt(SCAN.nextLine());
                    Building roomBuilding = _BUILDING_REPOSITORY.get(roomBuildingID);

                    Room room = new Room (roomBuilding);
                    _ROOM_REPOSITORY.add(room);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
                case 9:
                try{    
                    System.out.println("\n Semesters Selected \n");
                    System.out.println("Provide the semester start date [mm/dd/yyyy]");
                    String semesterStart = SCAN.nextLine();
                    DateFormat format = new SimpleDateFormat("EEEE dd MMM yyyy");
                    Date startSemester = (Date) format.parse(semesterStart); //had to cast... dont hate me
                    System.out.println("Provide the semester start date [mm/dd/yyyy]");
                    String semesterEnd = SCAN.nextLine();
                    DateFormat another = new SimpleDateFormat("EEEE dd MMM yyyy");
                    Date endSemester = (Date) another.parse(semesterEnd); //had to cast... dont hate me

                    Semester semester = new Semester(semesterStart,semesterEnd);
                    _SEMESTER_REPOSITORY.add(semester);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                    break;
                case 10:
                try{    
                    System.out.println("\n Students Selected \n");
                    System.out.println("Provide the students first name");
                    String studentFirstName = SCAN.nextLine();
                    System.out.println("Provide the students last name");
                    String studentLastName = SCAN.nextLine();
                    System.out.println("Provide the students email");
                    String studentEmail = SCAN.nextLine();
                    System.out.println("Provide the students phone number");
                    String studentPhoneNumber = SCAN.nextLine();
                    System.out.println("Provide the students Address");
                    String studentAddress = SCAN.nextLine();

                    Student student = new Student(studentFirstName, studentLastName, studentEmail, studentPhoneNumber, studentAddress);
                    _STUDENT_REPOSITORY.add(student);
                }
                catch(InputMismatchException e)
                {
                    System.err.println("There was a problem with your menu selection.  Please try again");
                }
                break;
            } 
        }while (menu != 11);
    }

     /**
      *  allows the user to update information in the database
      */
     public void updateInformation()
    {
        int menu = 0;
        do
        {
            System.out.println("\nPlease select from one of the following Updates\n");
            System.out.println("1) update Information about Assignments");
            System.out.println("2) update Information about Buildings");
            System.out.println("3) update Information about Courses");
            System.out.println("4) update Information about Divisions");
            System.out.println("5) update Information about Enrollments");
            System.out.println("6) update Information about Grades");
            System.out.println("7) update Information about Professors");
            System.out.println("8) update Information about Rooms");
            System.out.println("9) update Information about Semesters");
            System.out.println("10) update Information about Students");
            System.out.println("11) Exit\n");
            Scanner selection = new Scanner(System.in);
            try {
                System.out.print("Enter Your Selection: ");
                menu = SCAN.nextInt();
            } 
            catch (Exception ex) {
                System.err.println("There was a problem with your menu selection.  Please try again");
            }
                switch (menu) {
                        case 1: 
                        try
                        {
                            System.out.println("Enter an Assignment.Assignment ID that you would like to update");
                            int a = SCAN.nextInt();
                            _ASSIGNMENT_REPOSITORY.delete( _ASSIGNMENT_REPOSITORY.get(a));
                            System.out.println("Provide the assignment name");
                            String name = SCAN.nextLine();
                            System.out.println("Provide the type of assignment (test, quiz, e.g)");
                            String type = SCAN.nextLine();
                            System.out.println("Provide the amount of points possible");
                            int pointsPossible = Integer.parseInt(SCAN.nextLine());
                            Assignment assignment = new Assignment(name, type, pointsPossible);
                            _ASSIGNMENT_REPOSITORY.add(assignment);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        }
                         break;
                        case 2:
                        try
                        {
                            System.out.println("Enter a Building.Building ID that you would like to update");
                            int b = Integer.parseInt(SCAN.nextLine());
                            _BUILDING_REPOSITORY.delete( _BUILDING_REPOSITORY.get(b));
                            System.out.println("Provide the name of the building");
                            String buildingName = SCAN.nextLine();
                            System.out.println("Provide the city the building is located in");
                            String buildingCity = SCAN.nextLine();
                            System.out.println("provide the state the building is located in");
                            String buildingState = SCAN.nextLine();
                            System.out.println("provide the zipcode the building is located in");
                            int buildingZipcode = Integer.parseInt(SCAN.nextLine());
                            Building building = new Building(buildingName,buildingCity, buildingState, buildingZipcode);
                            _BUILDING_REPOSITORY.add(building);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        }
                         break;
                        case 3:
                        try
                        {
                            System.out.println("Enter a course ID that you would like to update");
                            int c = Integer.parseInt(SCAN.nextLine());
                            _COURSE_REPOSITORY.delete( _COURSE_REPOSITORY.get(c));
                            System.out.println("Provide the name of the course");
                            String courseName = SCAN.nextLine();
                            System.out.println("Provide the description of the course");
                            String courseDescription = SCAN.nextLine();
                            System.out.println("Provide the amount of credit hours");
                            int courseCreditHours = Integer.parseInt(SCAN.nextLine());
                            System.out.println("Provide the professors ID who instructs the course");
                            int courseProfessorID = Integer.parseInt(SCAN.nextLine());
                            Professor courseProfessor = _PROFESSOR_REPOSITORY.get(courseProfessorID);

                            Course course = new Course(courseName, courseDescription, courseCreditHours, courseProfessor );
                            _COURSE_REPOSITORY.add(course);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        } 
                         break;
                        case 4:
                        try
                        {
                            System.out.println("Enter a division ID that you would like to update");
                            int c = Integer.parseInt(SCAN.nextLine());
                            _COURSE_REPOSITORY.delete( _COURSE_REPOSITORY.get(c));
                            System.out.println("Provide the time this division begins");
                            int divisionTime = Integer.parseInt(SCAN.nextLine());
                            System.out.println("Provide the division");
                            int divisionProfessorID = Integer.parseInt(SCAN.nextLine());
                            Professor divisionProfessor = _PROFESSOR_REPOSITORY.get(divisionProfessorID);
                            System.out.println("Provide the semester ID for the chosen division");
                            int divisionSemesterID = Integer.parseInt(SCAN.nextLine());
                            Semester divisionSemester = _SEMESTER_REPOSITORY.get(divisionSemesterID);
                            System.out.println("Provide the division ID for the chosen division");
                            int divisionCourseID = Integer.parseInt(SCAN.nextLine());
                            Course divisionCourse = _COURSE_REPOSITORY.get(divisionCourseID);
                            System.out.println("Provide the room ID for the chosen division");
                            int divisionRoomID = Integer.parseInt(SCAN.nextLine());
                            Room divisionRoom = _ROOM_REPOSITORY.get(divisionRoomID);

                            Division division = new Division(divisionTime, divisionProfessor, divisionSemester, divisionCourse, divisionRoom);
                            _DIVISION_REPOSITORY.add(division);

                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        }
                         break;
                        case 5:
                        try
                        {
                            System.out.println("Enter a enrollment ID that you would like to update");
                            int c = Integer.parseInt(SCAN.nextLine());
                            _ENROLLMENT_REPOSITORY.delete( _ENROLLMENT_REPOSITORY.get(c));
                            System.out.println("Provide the date enrolled [mm/dd/yyyy]");
                            String enrollmentEnrollDate = SCAN.nextLine();
                            DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");
                            Date date = (Date) formatter.parse(enrollmentEnrollDate); //had to cast... dont hate me
                            System.out.println("Provide The Current Grade.Grade");
                            int currentGrade = Integer.parseInt(SCAN.nextLine());
                            System.out.println("Provide The Midterm Grade.Grade");
                            int midtermGrade = Integer.parseInt(SCAN.nextLine());
                            System.out.println("Provide The Final Grade.Grade");
                            int finalGrade = Integer.parseInt(SCAN.nextLine());
                            System.out.println("Provide the Division.Division ID");
                            int enrollmentDivisionID = Integer.parseInt(SCAN.nextLine());
                            Division enrollmentDivision = _DIVISION_REPOSITORY.get(enrollmentDivisionID);
                            System.out.println("Provide the Student.Student ID");
                            int enrollmentStudentID = Integer.parseInt(SCAN.nextLine());
                            Student enrollmentStudent = _STUDENT_REPOSITORY.get(enrollmentStudentID);

                            Enrollment enrollment = new Enrollment(date,currentGrade,midtermGrade,finalGrade,enrollmentDivision,enrollmentStudent);
                            _ENROLLMENT_REPOSITORY.add(enrollment);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException | ParseException n)
                        {
                            System.out.println("There is nothing to update");
                        } 
                         break;
                        case 6:
                        try
                        {
                            System.out.println("Enter a grade ID that you would like to update");
                            int f = Integer.parseInt(SCAN.nextLine());
                            _ENROLLMENT_REPOSITORY.delete( _ENROLLMENT_REPOSITORY.get(f));
                            System.out.println("Provide the amount of points recieved ");
                            int gradePoints = Integer.parseInt(SCAN.nextLine());
                            System.out.println("Provide the assignment ID");
                            int gradeAssignmentID = Integer.parseInt(SCAN.nextLine());
                            Assignment gradeAssignment = _ASSIGNMENT_REPOSITORY.get(gradeAssignmentID);
                            System.out.println("Provide the Division.Division ID");
                            int gradeDivsionID = Integer.parseInt(SCAN.nextLine());
                            Division gradeDivision = _DIVISION_REPOSITORY.get(gradeDivsionID);
                            System.out.println("Provide the Student.Student ID");
                            int gradeStudentID = Integer.parseInt(SCAN.nextLine());
                            Student gradeStudent = _STUDENT_REPOSITORY.get(gradeStudentID);
                            System.out.println("Provide the Professor.Professor ID");
                            int gradeProfessorID = Integer.parseInt(SCAN.nextLine());
                            Professor gradeProfessor = _PROFESSOR_REPOSITORY.get(gradeProfessorID);

                            Grade grade = new Grade(gradePoints,gradeAssignment,gradeDivision,gradeStudent,gradeProfessor);
                            _GRADE_REPOSITORY.add(grade);

                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        } 
                         break;
                        case 7:
                        try
                        {
                            System.out.println("Enter a grade ID that you would like to update");
                            int g = Integer.parseInt(SCAN.nextLine());
                            _GRADE_REPOSITORY.delete( _GRADE_REPOSITORY.get(g));
                            System.out.println("Provide the professors first name");
                            String professorFirstName = SCAN.nextLine();
                            System.out.println("Provide the professors last name");
                            String professorLastName = SCAN.nextLine();
                            System.out.println("provide the professors email");
                            String professorEmail = SCAN.nextLine();
                            System.out.println("provide the professors phone number");
                            String professorPhoneNumber = SCAN.nextLine();
                            System.out.println("provide the professors address");
                            String professorAddress = SCAN.nextLine();

                            Professor professor = new Professor(professorFirstName, professorLastName, professorEmail, professorPhoneNumber, professorAddress);
                            _PROFESSOR_REPOSITORY.add(professor);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        }
                         break;
                        case 8:
                        try
                        {
                            System.out.println("Enter a room ID that you would like to update");
                            int g = Integer.parseInt(SCAN.nextLine());
                            _ROOM_REPOSITORY.delete( _ROOM_REPOSITORY.get(g));
                            System.out.println("Enter a room ID that you would like to update");
                            int h = Integer.parseInt(SCAN.nextLine());
                            _ROOM_REPOSITORY.delete( _ROOM_REPOSITORY.get(h));
                            System.out.println("Provide your Building.Building ID to which the room belongs");
                            int roomBuildingID = Integer.parseInt(SCAN.nextLine());
                            Building roomBuilding = _BUILDING_REPOSITORY.get(roomBuildingID);

                            Room room = new Room (roomBuilding);
                            _ROOM_REPOSITORY.add(room);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        }
                         break;
                        case 9:
                        try
                        {
                            System.out.println("Enter a Semester.Semester ID that you would like to update");
                            int g = Integer.parseInt(SCAN.nextLine());
                            _SEMESTER_REPOSITORY.delete( _SEMESTER_REPOSITORY.get(g));
                            System.out.println("Provide the semester start date [mm/dd/yyyy]");
                            String semesterStart = SCAN.nextLine();
                            DateFormat format = new SimpleDateFormat("EEEE dd MMM yyyy");
                            Date startSemester = (Date) format.parse(semesterStart); //had to cast... dont hate me
                            System.out.println("Provide the semester start date [mm/dd/yyyy]");
                            String semesterEnd = SCAN.nextLine();
                            DateFormat another = new SimpleDateFormat("EEEE dd MMM yyyy");
                            Date endSemester = (Date) another.parse(semesterEnd); //had to cast... dont hate me

                            Semester semester = new Semester(semesterStart,semesterEnd);
                            _SEMESTER_REPOSITORY.add(semester);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                         break;
                    case 10:
                         try
                        {
                            System.out.println("Enter a Students ID that you would like to update");
                            int g = Integer.parseInt(SCAN.nextLine());
                            _STUDENT_REPOSITORY.delete( _STUDENT_REPOSITORY.get(g));
                            System.out.println("Provide the students first name");
                            String studentFirstName = SCAN.nextLine();
                            System.out.println("Provide the students last name");
                            String studentLastName = SCAN.nextLine();
                            System.out.println("Provide the students email");
                            String studentEmail = SCAN.nextLine();
                            System.out.println("Provide the students phone number");
                            String studentPhoneNumber = SCAN.nextLine();
                            System.out.println("Provide the students Address");
                            String studentAddress = SCAN.nextLine();

                            Student student = new Student(studentFirstName, studentLastName, studentEmail, studentPhoneNumber, studentAddress);
                            _STUDENT_REPOSITORY.add(student);
                        }
                        catch (InputMismatchException I)
                        {
                            System.out.println("The information you entered could not be used");
                        }
                        catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to update");
                        }
                         break;
            }
        } while (menu != 11);
    }


    /**
     * allows the user to delete information from the database
     */
    public void removeInformation() {
        int menu = 0;
        do 
        {
            System.out.println("\nPlease select from one of the following Updates\n");
            System.out.println("1) Delete Information about Assignments");
            System.out.println("2) Delete Information about Buildings");
            System.out.println("3) Delete Information about Courses");
            System.out.println("4) Delete Information about Divisions");
            System.out.println("5) Delete Information about Enrollments");
            System.out.println("6) Delete Information about Grades");
            System.out.println("7) Delete Information about Professors");
            System.out.println("8) Delete Information about Rooms");
            System.out.println("9) Delete Information about Semesters");
            System.out.println("10) Delete Information about Students");
            System.out.println("11) Exit\n");
            Scanner selection = new Scanner(System.in);
            try 
            {
                System.out.print("Enter Your Selection: ");
                menu = Integer.parseInt(SCAN.nextLine());
            } 
            catch (Exception ex) 
            {
                System.err.println("There was a problem with your menu selection.  Please try again");
            }
            switch (menu) {
                case 1:
                try {
                        System.out.println("Provide the ID of the Assignment.Assignment you would like to delete");
                        int a = Integer.parseInt(SCAN.nextLine());
                        _ASSIGNMENT_REPOSITORY.delete( _ASSIGNMENT_REPOSITORY.get(a));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                     break;
                case 2:
                try {
                        System.out.println("Provide the ID of the building you would like to delete");
                        int b= Integer.parseInt(SCAN.nextLine());
                        _BUILDING_REPOSITORY.delete( _BUILDING_REPOSITORY.get(b));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                     break;
                case 3:
                try {
                        System.out.println("Provide the ID of the course you would like to delete");
                        int c = Integer.parseInt(SCAN.nextLine());
                        _COURSE_REPOSITORY.delete( _COURSE_REPOSITORY.get(c));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                     break;
                case 4:
                try {
                        System.out.println("Provde the ID of the division information you would like to delete");
                        int d = Integer.parseInt(SCAN.nextLine());
                        _DIVISION_REPOSITORY.delete( _DIVISION_REPOSITORY.get(d));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                     break;
                case 5:
                try {
                        System.out.println("Provide the ID of the enrollment information you would like to delete");
                        int e = Integer.parseInt(SCAN.nextLine());
                        _ENROLLMENT_REPOSITORY.delete( _ENROLLMENT_REPOSITORY.get(e));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                     break;
                case 6:
                try {
                        System.out.println("Provide the ID of the grades you would like to delete");
                        int f = Integer.parseInt(SCAN.nextLine());
                        _GRADE_REPOSITORY.delete( _GRADE_REPOSITORY.get(f));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                     break;
                case 7:
                try {
                        System.out.println("Provide the ID of the professor you would like to delete");
                        int g = Integer.parseInt(SCAN.nextLine());
                        _PROFESSOR_REPOSITORY.delete( _PROFESSOR_REPOSITORY.get(g));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                     break;
                case 8:
                try {
                        System.out.println("Provide the ID of the room you would like to delete");
                        int h = Integer.parseInt(SCAN.nextLine());
                        _ROOM_REPOSITORY.delete( _ROOM_REPOSITORY.get(h));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                    break;
                case 9:
                try {
                        System.out.println("Provide the ID of the semester you would like to delete");
                        int i = Integer.parseInt(SCAN.nextLine());
                        _SEMESTER_REPOSITORY.delete( _SEMESTER_REPOSITORY.get(i));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                    break;
                case 10:
                try {
                        System.out.println("Provide the ID of the Student.Student you would like to delete");
                        int j = Integer.parseInt(SCAN.nextLine());
                        _STUDENT_REPOSITORY.delete( _STUDENT_REPOSITORY.get(j));
                    }
                    catch (InputMismatchException I)
                    {
                        System.out.println("An unexpected value was recieved. Try again");
                    }
                    catch (NullPointerException n)
                        {
                            System.out.println("There is nothing to remove");
                        }
                    break;
                }
            }while (menu != 11);
        }
    }