package Data.pupr.edu.attendance.data.morgan;

import java.util.HashMap;
import java.time.LocalTime;
/**
 * This Course class will store information about the university courses such as Course code, term,
 * schedule, professor and students. This class will be able to add and remove students depending on their enrollment
 * status. Thus, the only thing it changes is a student's enrollment status. Student variable will be a hash table to
 * find them quickly.
 *
 * The relation between courses and other classes are as follows:
 *
 * One class has many students. One class has many course codes.
 * One class has one department. One class has many professors.
 * One class has many start and end sessions.
 */
public class Course {
    private String courseName;
    private String courseCode;
    private HashMap<String, Student> students;
    private Educator professor;
    private String term;
    private LocalTime startClassSession;
    private LocalTime endClassSession;

    /**
     * Creates a Course object initializing the course name and code.
     * @param courseName name of course
     * @param courseCode course code
     */
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    /**
     *  Grants the course name.
     * @return the name of the course.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the name of the course.
     * @param courseName name of course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Grants the course code. A course may have several sections and thus different codes.
     * @return course code
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the course code for a given course.
     * @param courseCode course code
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * Grants the term for a course (e.g. Spring term.)
     * @return the course term.
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the term of the code with the corresponding term. The parameter should be a max of
     * four chars XXYY, where XX is FA for fall and YY is 26 for 2026.
     * @param term trimester term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     *  Grants the start time of the course.
     * @return Course start time.
     */
    public LocalTime getStartClassSession() {
        return startClassSession;
    }

    /**
     *  Sets the class start time. This will be important to ensure that a student doesn't attempt to mark
     *  attendance outside of the bounds of the class time.
     * @param startClassSession beginning of scheduled class time
     */
    public void setStartClassSession(LocalTime startClassSession) {
        this.startClassSession = startClassSession;
    }

    /**
     * Grants class end time.
     * @return Class end time.
     */
    public LocalTime getEndClassSession() {
        return endClassSession;
    }

    /**
     * Sets the time that the class ends. The educator should set an end time so
     * students may not try to mark attendance outside of the bounds of class.
     * @param endClassSession end of scheduled class time
     */
    public void setEndClassSession(LocalTime endClassSession) {
        this.endClassSession = endClassSession;
    }

}