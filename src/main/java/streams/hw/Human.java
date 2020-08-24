package streams.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Human {
    private final String name;
    private final List<String> wifes;
}
