package Beginner;

public class Course {
    private String courseId;
    private String courseName;
    private int teacherId;

    // Constructor
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getter and Setter for courseId
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    // Getter and Setter for courseName
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Behaviors (from your diagram)
    public void addStudent(String studentName) {
        System.out.println("Student " + studentName + " has been added to " + courseName);
    }

    public void removeStudent(String studentName) {
        System.out.println("Student " + studentName + " has been removed from " + courseName);
    }
}

