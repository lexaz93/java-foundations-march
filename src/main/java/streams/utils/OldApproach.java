package streams.utils;

import streams.model.Faculty;
import streams.model.Student;

import java.util.ArrayList;
import java.util.List;

public class OldApproach {
    public static List<Student> generate(Student harryPotter, Student jennyWeasly, Student drakoMalfoy, Student cedricDigory) {
        List<Student> resList = new ArrayList<>();
        resList.add(harryPotter);
        resList.add(jennyWeasly);
        resList.add(drakoMalfoy);
        resList.add(cedricDigory);

        return resList;
    }

    public static List<Student> getGryffindorStudents(List<Student> students) {
        List<Student> gryffindorList = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty() == Faculty.GRYFFINDOR) {
                gryffindorList.add(student);
            }
        }
        return gryffindorList;
    }
}
