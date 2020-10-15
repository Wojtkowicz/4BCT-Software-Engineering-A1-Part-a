import java.util.List;

public class Module {

    private String name;
    private String ID;
    private List<Student> studentsEnrolled;
    //private List<CourseProgramme> courseProgrammes;

    public Module(final String name, final String ID, final List<Student> studentsEnrolled){
        this.setName(name);
        this.setID(ID);
        this.setStudentsEnrolled(studentsEnrolled);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
}
