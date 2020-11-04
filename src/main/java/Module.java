import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Module {

    private String name;
    private String ID;
    private List<Student> studentsEnrolled;
    private List<CourseProgramme> courseProgrammes;

    public Module(final String name, final String ID){
        this.setName(name);
        this.setID(ID);
    }
}
