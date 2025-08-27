package Beginner;

  public class Student extends Person {
    private int studentId;
    private String name;
    private String course;
    private int attendanceCount;

    public Student(String name, int studentId, String course) {
        super(studentId, name,course);
        this.studentId = studentId;
        this.course = course;
        this.attendanceCount = 0;
    }

    public void markPresent() { attendanceCount++; }

    public void viewAttendance() {
        System.out.println(getRawName() + " has attendance count: " + attendanceCount);
    }

    // Polymorphism (overridden methods)
    @Override
    public String getRawName() {
        return getName();
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Course: " + course);
    }
}
 

