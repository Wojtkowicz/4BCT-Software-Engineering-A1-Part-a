import java.util.List;

public class Module {

    private String name;
    private Long ID;
    private List<Student> studentsEnrolled;
    private List<CourseProgramme> courseProgrammes;

    public Module(final String name, final Long ID, final List<Student> studentsEnrolled, final List<CourseProgramme> courseProgrammes){
        this.setName(name);
        this.setID(ID);
        this.setStudentsEnrolled(studentsEnrolled);
        this.setCourseProgramme(courseProgrammes);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public List<CourseProgramme> getCourseProgramme() {
        return courseProgrammes;
    }

    public void setCourseProgramme(List<CourseProgramme> courseProgramme) {
        this.courseProgrammes = courseProgramme;
    }
}
