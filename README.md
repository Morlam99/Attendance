# **Attendance Mark Project**   
## This project aims to streamline the attendance process in my CECS 4204 Software Engineering class.

### Time spent in development: 7 hours
### The Attendance Marker considers the following as the main stakeholders

- Educators
- Students
- Registar Office staff
- Student Aid Offices

### The purposes of this software are for taking attendance from students to make student attendance reporting easier for educators and save time on review.

### The main features of this project are: 

 - [ ] Students will access with an interface to mark down attendance.
 - [ ] Educators will view and edit student attendance.
 - [ ] Educators will be able to request for a .csv excel file summarizing attendance on a basis of their choosing.
 - [ ] Educators will view and accept or refuse student excusals. 
 - [ ] Students may be able to request to be excused for the class. 

### Features that are nice to have but not obligatory: 

 - [ ] Educator will be able to rank student participation.
- [ ] Educators can set up events. 
- [ ] Educators can take notes about student participation. 

### At the time of this writing the project is of course a work in progress. The main features are the absolute must-haves and necessary for a minimum viable product (MVP). While the non-obligatory features are goals, they may not be implemented. 

# Users and Roles

| User     | Role-based Permissions                                                                                                                                                                                                                                  | 
|:----------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| Student  | Students may see what days they have marked attendance as well as professor responses to excusals. They may not see attendance related information about other students. Students may also see the Attendance Marker form and the Excusal Request form. Students cannot edit their attendance once it has been marked. |
| Educator | Educators may view attendance related information for all students as well as edit this information. Educators may also view all previously sent excusal forms.                                                                                         |

# Classes

- ###   Student

This class contains information about students such as their first and last name, their student ID,
whether they are enrolled in a class or not and also whether they are attending or not. This class may only access
a course's code to verify if they are attending and if they are enrolled. Only the Educator class may edit
the Student's first name, last name and age.
---

- ### Educator  

This class will store information pertaining the educators of a course.
An educator has a first and last name, many courses, many students,
their unique ID and their unique assigned department.

Educators will be able to add and remove students as well as add and remove courses. Educators will also be able
to view and edit a student's attendance state. Educators will set course course, name, start and end times.
---
- ### Course

This Course class will store information about the university courses such as Course code, term,
schedule, professor and students. This class will be able to add and remove students depending on their enrollment
status. Thus, the only thing it changes is a student's enrollment status. Student variable will be a hash table to
find them quickly.

One class has many students. One class has many course codes.
One class has one department. One class has many professors.
One class has many start and end sessions.
---
- ### Department
---
- ### Attendance
---
- ### Excuse 
