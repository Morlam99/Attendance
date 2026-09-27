package Data.pupr.edu.attendance.data.morgan;
import java.util.ArrayList;
/**
 * The Department class stores information about a university department (e.g. department of computer science).
 * A department has many professors, a name, and many courses.
 * This method will be able to create department objects, add professors and courses as well as remove them.
 */

public class Department  {
	private String deptName;
    private ArrayList<Educator> educators;
    private ArrayList<Course> courses;

    /**
     * Constructor that creates a department object with a department name as a parameter.
     * It should also separate space for courses and educators to avoid null exceptions.
     * @param deptName name of department
     */
    public Department(String deptName) {
        this.deptName = deptName;
    }
    /**
     * Grants the name of a department.
     * @return department name.
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     *  Sets the deparment name.
     * @param deptName name of department
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * Returns the whole list of professors in a given department.
     * @return All professors
     */
    public ArrayList<Educator> getProfessors() {
        return educators;
    }

    /**
     * Sets the list of professors. It should take a list of professors
     * @param professors all professors
     */
    public void setEducator(ArrayList<Educator> professors) {
       this.educators = professors;
    }

    /**
     * This method grants the list of courses.
     * @return list of courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * This method sets the list of courses. It should accept a list of courses.
     * @param courses all courses
     */
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    /**
     * This method compares if two department objects are the same.
     * @param object another department to compare
     * @return true if objects are the same, false if they are not
     */
    public boolean equals(Object object) {
        if (!(object instanceof Department)) return false;
        if (!super.equals(object)) return false;
        Department that = (Department) object;
        return java.util.Objects.equals(getDeptName(), that.getDeptName()) && java.util.Objects.equals(getProfessors(), that.getProfessors()) && java.util.Objects.equals(getCourses(), that.getCourses());
    }
}