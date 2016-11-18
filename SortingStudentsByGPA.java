package pr6;
import java.util.Comparator;
/**
 * Created by liveuser on 18.11.16.
 */
public class SortingStudentsByGPA implements Comparator<Student> {

    public int compare(Student st1, Student st2) {

        if(st1.getGpa()> st2.getGpa())
            return 1;
        else if(st1.getGpa()< st2.getGpa())
            return -1;
        else
            return 0;
    }

    public void sortingByGPA(Student[] students){
        for(int i = students.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (compare(students[j], students[j+1])==1) {
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }

        }
    }
}
