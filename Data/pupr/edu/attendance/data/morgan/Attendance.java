/**
 * The Attendance class stores information about the state of a student's attendance.
 * It keeps count of attendances and absences. Many students may have many attendances and absences.
 * Students are absent by default. Only once they mark attendance will their attendance state be change to true.
 * For every instance of the student or educator changing the state the true, the counter will go up.
 * Courses have schedules: start and end times. If the student's absent state has not been changed within
 * the bounds of this schedule, the absent count will go up.
 *
 * There is an excused state that will also be counted. Normally excused means that a student won't get points for attending
 * but won't lose points for not being able to attend (somehow this makes sense).
 *
 * The Attendance class requires information from the Student and Course class to
 * A) know the student's attendance state
 * B) know the Course's schedule.
 *
 * Knowing the student's attendance state during a course's time will ensure that the counters function accordingly.
 * An observer could be implemented. Will check later.
 */

package Data.pupr.edu.attendance.data.morgan;

import java.time.LocalTime;

public class Attendance
{
    int attendanceCount = 0;
    int absenceCount = 0;
    int excuseCount = 0;
    /**
     * This method returns the amount of times a student has attended class.
     * @return student's attendance
     */
    public int getAttendanceCount() {
        return attendanceCount;
    }

    /**
     * This method sets the amount of attendances a student has in the case that
     * an educator wishes to change the attendance count.
     * @param attendanceCount
     */
    public void setAttendanceCount(int attendanceCount) {
        this.attendanceCount = attendanceCount;
    }

    /**
     * This method returns the amount of absences a student has.
     * @return student's absence
     */
    public int getAbsenceCount() {
        return absenceCount;
    }

    /**
     * This method changes the amount of absences of a student.
     * @param absenceCount
     */
    public void setAbsenceCount(int absenceCount) {
        this.absenceCount = absenceCount;
    }
    /**
     * This method increments attendance count if a student's IsAttending state is changed to true.
     */
    public void incrementAttendanceCount()
    {
       if (Student.isEnrolled()) {
           attendanceCount++;
       }
    }
    /**
     * This method increments the absence count if a student object's IsAttending state did not
     * change within a timeframe, notably the course's scheduled time. It will take a Course's scheduled time
     * as a parameter.
     * It must check if the action is being done within the bounds of the course schedule.
     * If it is before the beginning of class or after the end of class, the method will return with no changes.
     * @param schedule
     * @param attendanceState
     */
    public void trackAttendance(Course schedule, Student attendanceState) {

        LocalTime now = LocalTime.now();
        LocalTime classStart = schedule.getStartClassSession();
        LocalTime classEnd = schedule.getEndClassSession();
        boolean isAttending = attendanceState.isAttending();

        if (now.isBefore(classStart) || now.isAfter(classEnd)) {
            return;
        }
        if (now.isAfter(classStart) || now.isBefore(classEnd)) {
            incrementAttendanceCount();
            } else {
                absenceCount++;
            }
        }
    }
}