package pupr.edu.attendance.data.morgan;

/**
 * This class contains information about students such as their first and last name, their student ID,
 * whether they are enrolled in a class or not and also whether they are attending or not. This class may only access
 * a course's code to verify if they are attending and if they are enrolled. Only the Educator class may edit
 * the Student's first name, last name and age.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String StudentID;
    private boolean isAttending = false;
    private boolean isEnrolled = false;

    /**
     * Constructor to create a Student object. Takes @param firstName and @param lastName and @param id
     * to fill student information.
     */
    public Student(String firstName, String lastName, String StudentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.StudentID = StudentID;
    }

    /**
     * This method will grant a Student's first name.
     * @returns Student's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method will initialize a student's first name.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method will grant a student's last name.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method will initialize student's last name.
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method will grant student's
     * @return Student's ID number.
     */
    public String getStudentID() {
        return StudentID;
    }

    /**
     * Initializes student's ID
     * @param StudentID
     */
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    /**
     * This method confirms whether or not a student is attending.
     * @return true if student is attending
     */
    public boolean isAttending() {
        return isAttending;
    }

    /**
     * Takes the parameter "attending" to change student state.
     * @param attending
     */
    public void setAttendance(boolean attending) {
        isAttending = attending;
    }

    /**
     * Confirms whether or not a student is enrolled.
     * @return student's enrollment status
     */
    public boolean isEnrolled() {
        return isEnrolled;
    }

    /**
     * Initializes student's enrollment status.
     * @param enrolled
     */
    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName;
    }
}