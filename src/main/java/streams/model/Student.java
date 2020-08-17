package streams.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private final String name;
    private int courseNum;
    private final Faculty faculty;


}
