package pr6;

/**
 * Created by liveuser on 18.11.16.
 */
public class Tester extends SortingStudentsByGPA{

    public static void sortID(Student students[]){
        for(int i = students.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (students[j].getId() > students[j + 1].getId()) {
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }

        }

    }

    public static void main(String[] args) {
        Student[] st = new Student[5];
        st[0] = new Student("Jane", "Doe", 12345, 3.6);
        st[1] = new Student("John", "Smith", 23456, 2.5);
        st[2] = new Student("Mary", "Watson", 73456, 3.5);
        st[3] = new Student("Olivia", "Bering", 34567, 3.9);
        st[4] = new Student("Pete", "Latimer", 12346, 2.9);

        for (int i = 0; i<5; i++){
        System.out.println(st[i]);}

        sortID(st);

        System.out.println("\n");
        for (int i = 0; i<5; i++){
            System.out.println(st[i]);}

    }

}
