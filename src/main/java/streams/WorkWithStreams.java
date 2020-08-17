package streams;

import streams.model.Faculty;
import streams.model.Student;
import streams.utils.NewApproach;
import streams.utils.OldApproach;

import java.util.List;

public class WorkWithStreams {
    public static void main(String[] args) {
        Student harryPotter = new Student("Harry Potter", 2, Faculty.GRYFFINDOR);
        Student jennyWeasly = new Student("Jenny Weasly", 1, Faculty.GRYFFINDOR);
        Student drakoMalfoy = new Student("Drako Malfoy", 2, Faculty.SLYTHERIN);
        Student cedricDigory = new Student("Cedric Digory", 3, Faculty.HUFFLEPUFF);

//        List<Student> hogwartsStudents = OldApproach.generate(harryPotter, jennyWeasly, drakoMalfoy, cedricDigory);
        List<Student> hogwartsStudents = NewApproach.generate(harryPotter, jennyWeasly, drakoMalfoy, cedricDigory);

//        System.out.println(OldApproach.getGryffindorStudents(hogwartsStudents));
        System.out.println(NewApproach.getGryffindorStudents(hogwartsStudents));
        System.out.println(NewApproach.getCoursesGryffindorStudents(hogwartsStudents));

    }
}
