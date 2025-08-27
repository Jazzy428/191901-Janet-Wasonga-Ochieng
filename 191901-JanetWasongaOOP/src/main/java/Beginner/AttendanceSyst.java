package Beginner;

public class AttendanceSyst {
    private String students;
    private String courses;
    private String records;

    public AttendanceSyst(String students, String courses, String records) {
        this.students = students;
        this.courses = courses;
        this.records = records;
    }

    public String getStudents() { return students; }
    public void setStudents(String students) { this.students = students; }

    public String getCourses() { return courses; }
    public void setCourses(String courses) { this.courses = courses; }

    public String getRecords() { return records; }
    public void setRecords(String records) { this.records = records; }

    // generateReport method
    public void generateReport() {
        System.out.println("Generating report...");
        System.out.println("Students: " + students);
        System.out.println("Courses: " + courses);
        System.out.println("Records: " + records);
    }

    // Dummy findStudent method
    public Student findStudent(int id) {
        System.out.println("Searching for student with ID: " + id);
        // In a real system this would check a database/list
        return null; 
    }
}

