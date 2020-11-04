import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.util.List;

@Data
@NoArgsConstructor
public class CourseProgramme {

    private String name;
    private List<Module> modules;
    private List<Student> studentsEnrolled;
    private DateTime academicStartDate;
    private DateTime academicEndDate;

    public CourseProgramme(final String name, final DateTime academicStartDate, final DateTime academicEndDate){
        this.setName(name);
        this.setAcademicStartDate(academicStartDate);
        this.setAcademicEndDate(academicEndDate);
    }
}
