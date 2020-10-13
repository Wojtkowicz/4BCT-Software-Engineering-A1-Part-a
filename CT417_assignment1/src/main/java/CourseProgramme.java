import org.joda.time.DateTime;

import java.util.List;

public class CourseProgramme {

    private String name;
    private List<Module> modules;
    private List<Student> enrolledStudents;
    private DateTime academicStartDate;
    private DateTime academicEndDate;

    public CourseProgramme(final String name, final List<Module> modules, final List<Student> enrolledStudents, final DateTime academicStartDate, final DateTime academicEndDate){
        this.setName(name);
        this.setModules(modules);
        this.setEnrolledStudents(enrolledStudents);
        this.setAcademicStartDate(academicStartDate);
        this.setAcademicEndDate(academicEndDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public DateTime getAcademicStartDate() {
        return academicStartDate;
    }

    public void setAcademicStartDate(DateTime academicStartDate) {
        this.academicStartDate = academicStartDate;
    }

    public DateTime getAcademicEndDate() {
        return academicEndDate;
    }

    public void setAcademicEndDate(DateTime academicEndDate) {
        this.academicEndDate = academicEndDate;
    }
}
