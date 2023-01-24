public class Test {
    public static void main(String[] args) {
        // Creating students
        Student studentOne = new Student("Alfred", "Jones", 2004738, 45, 80);
        Student studentTwo = new Student("Timmy", "Hadrick", 2003758, 32, 90);
        Student studentThree = new Student("Simon", "Johnson", 2005842, 82, 32);

        // Store students in an array 
        Student[] totalStudents = new Student[3];


        totalStudents[0] = studentOne;
        totalStudents[1] = studentTwo;
        totalStudents[2] = studentThree;

        // Iterating through the students and printing them out
        for (int i = 0; i < totalStudents.length; i++) {
            System.out.println(totalStudents[i]);
        }
    }
}
