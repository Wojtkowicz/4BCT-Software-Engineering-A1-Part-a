import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Student {

    private String name;
    private Integer age;
    private String DOB;
    private Long ID;
    private String username;
    private List<Module> registeredModules;
    private List<CourseProgramme> registeredCourses;

    public Student(final String name, final Integer age, final String DOB, final Long ID){
        this.setName(name);
        this.setAge(age);
        this.setDOB(DOB);
        this.setID(ID);
        this.setUsername(getUsername());
    }

    public String getUsername(){
       return (name.replaceAll("\\s","") + age);
    }
}
