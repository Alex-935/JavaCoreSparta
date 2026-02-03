public class SweetToothApp {

    public static void main(String[] args) {

        int numSweets = 40;
        int numStudents = 14;

        // the num of sweets each child gets
        int sweets = 40 / 14;
        int teacherSweets = 40 % 14;

        System.out.printf("The students get %d sweets each.%nThe teacher gets %d sweets.",
                sweets, teacherSweets);
    }
}
