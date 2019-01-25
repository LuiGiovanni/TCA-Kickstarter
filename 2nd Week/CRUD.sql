    CREATE TABLE enrollment(
    enrollmentID int(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    grade decimal(4,2) NOT NULL,
    CourseID int UNSIGNED,
    StudentID int UNSIGNED,
    FOREIGN KEY (CourseID)
            REFERENCES course(courseID),
            ON DELETE CASCADE
    FOREIGN KEY (StudentID)
            REFERENCES student(id)
            ON DELETE CASCADE
    
    )

    CREATE TABLE course(
    courseID int(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(30) NOT NULL,
    credits int(2) NOT NULL,
    DepartmentID int UNSIGNED,
    FOREIGN KEY (DepartmentID)
            REFERENCES department(ID)
            ON DELETE CASCADE
    )

    CREATE TABLE department(
    ID int(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY
    )

    CREATE TABLE student(
    id int(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    lastname VARCHAR(30) NOT NULL,
    fistname VARCHAR(30) NOT NULL,
    enrollmentdate TIMESTAMP
    )

    INSERT INTO course(title,credits)
        VALUES('Artificial Inteligence',6)

    INSERT INTO student(lastname,firstname)
        VALUES('Lopez','Giovanni')

    INSERT INTO enrollment(CourseID,StudentID,grade)
        VALUES(1,1,85)

    SELECT * FROM student
    SELECT * FROM course
    SELECT * FROM enrollment

    UPDATE student SET lastname = 'Lopez Celaya' WHERE lastname = 'Lopez'
    UPDATE course SET credits = 18 WHERE title = 'Artificial Inteligence'
    UPDATE enrollment SET grade = 90 WHERE courseID = 1

    DELETE FROM student WHERE id = 1