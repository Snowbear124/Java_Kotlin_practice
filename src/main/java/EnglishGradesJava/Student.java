package EnglishGradesJava;

public class Student {
    public static void main(String[] args) {
        GradesRecord.pass = 50;
        GradesRecord stu_1 = new GradesRecord("Rain", 40);
        GradesRecord stu_2 = new GradesRecord("Tree", 90);
        GradesRecord stu_3 = new GradesRecord("Blue", 120);
        GradesRecord stu_4 = new GradesRecord("Bird", 50);

        stu_1.print();
        stu_2.print();
        stu_3.print();
        stu_4.print();
        System.out.println(GradesRecord.pass);
    }
}
