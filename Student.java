public class Student {
    // Setting the variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private double courseworkMark;
    private double examMark;

    // Student constructor with all variables 
    public Student(String firstName, String lastName, int studentNumber, double courseworkMark, double examMark) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setCourseworkMark(courseworkMark);
        setExamMark(examMark);
    }

    // Method to set first name of student
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to set last name of student
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to set student number
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;

    }

    // Method to set exam mark 
    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    // Method to set coursework mark 
    public void setCourseworkMark(double courseworkMark) {
        this.courseworkMark = courseworkMark;
    }

    // Gets fulll name of student by adding concatenating first and last name
    public String getfullName() {
        return this.firstName + " " +  this.lastName;
    }

    // Gets average mark of coursework and exam 
    public double getAverageMark() {
        return ((courseworkMark + examMark) / (double)2);
    }

    // To String to print out nicely
    public String toString() {
        return "Name: " + getfullName() + "." + " StdNo: " + studentNumber + " Average Mark: " + getAverageMark();
    }


}
