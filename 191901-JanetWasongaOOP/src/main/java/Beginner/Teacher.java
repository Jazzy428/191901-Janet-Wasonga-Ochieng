package Beginner;

 class Teacher extends Person {
    private int teacherId;
    private String subject;
    private String course;

    public Teacher(String name, int teacherId, String subject, String course) {
        super(teacherId, name, subject);
        this.teacherId = teacherId;
        this.course = subject;
        this.subject = subject;
        
    }

    public void takeAttendance() {
        System.out.println("Teacher " + getName() + " is taking attendance for course: " + course);
    }

    public void viewClassList() {
        System.out.println("Viewing class list for course: " + course);
    }

    @Override
    public String getRawName() {
        return getName();
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + teacherId + ", Subject: " + subject);
    }
}
