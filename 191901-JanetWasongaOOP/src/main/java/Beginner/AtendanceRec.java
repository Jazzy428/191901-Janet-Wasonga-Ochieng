package Beginner;


class AttendanceRec{
    private int recordId;
    private String date;
    private int studentId;
    private String status;

    public AttendanceRec(int recordId, String date, int studentId, String status) {
        this.recordId = recordId;
        this.date = date;
        this.studentId = studentId;
        this.status = status;
    }

    public void updateStatus(String newStatus) { this.status = newStatus; }

    public void getRecord() {
        System.out.println("Record " + recordId + ": Student " + studentId + " - " + status + " on " + date);
    }
}

