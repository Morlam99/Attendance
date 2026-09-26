package pupr.edu.attendance.data.morgan;
import java.util.HashMap;

/**
 * This class will store information pertaining the educators of a course.
 * An educator has a first and last name, many courses, many students,
 * their unique ID and their unique assigned department.
 *
 * Educators will be able to add and remove students as well as add and remove courses. Educators will also be able
 * to view and edit a student's attendance state. Educators will set course course, name, start and end times.
 */

public class Educator {

    private String firstName;
    private String lastName;
    private String educatorID;
    private String department;
    private Map<String, Student> students;
    private Map<String, Course> courses;

    /**
     * Constructor to create an educator object, initializing their first name,
     * last name, educator ID and department.
     */
    public Educator(String firstName, String lastName, String educatorID, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.educatorID = educatorID;
        this.department = department;
    }

    /**
     * Grants the educator's first name.
     * @return Educator's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the educator's first name as a string.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Grants the educator's last name.
     * @return Educator's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the educator's last name as a string.
     * In the case of sur names, both last names need
     *  may be entered.
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Grants the educator's identification. Use for verification or id key.
     * @return educator's id.
     */
    public String getEducatorID() {
        return educatorID;
    }

    /**
     * Sets the educator's ID as a string. Should be a max of 9 chars.
     * @param educatorID
     */
    public void setEducatorID(String educatorID) {
        this.educatorID = educatorID;
    }

    /**
     * Grants department.
     * @return department name.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets department name as a string.
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Returns students and their IDs.
     * @return student names and IDs.
     */
    public Map<String, Student> getStudents() {
        return students;
    }

    /**
     * Returns single student from hashmap with @param studentID.
     * The method should check if the student is enrolled before searching.
     * If the student is not enrolled, the system will notify and themethod will return null.
     * @return student selected by ID
    **/
    public Student getStudentByID(String id) {
        Student target = this.students.get(id);
        if (target == null) {
            System.out.println("Student with ID " + id + " not found");
            return null;
        }

        if (!target.isEnrolled()){
            System.out.println("Student not enrolled. Please notify student.");
            return null;
        } else {
            return target;
        }
    }

    /**
     * Returns single student from hashmap with @param studentName
     * If it doesn't find it in th hash table, the method will notify and return null.
     * If the student isn't enrolled, the method will notify and return null.
     * This is done for posterity.
     * @return studentobject selected by name
     **/
    public Student getStudentByName(String name) {
       for (Student targetStudent : this.students.values())
           if (targetStudent.getName().equals(name))
           {
               return targetStudent;
           } else {
               System.out.println("Student with name " + name + " not found");
               return null;
           }
    }

    /**
     * Fills the hash map with key value pairs Student ID and student object.
     * The student object should have been created beforehand.
     * @param students
     */
    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }

    /**
     *
     * @return
     */
    public Map<String, Course> getCourses() {
        return courses;
    }

    /**
     *
     * @param courses
     */
    public void setCourses(Map<String, Course> courses) {
        this.courses = courses;
    }
}