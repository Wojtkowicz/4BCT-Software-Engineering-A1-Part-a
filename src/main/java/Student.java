import java.util.List;

public class Student {

    private String name;
    private Integer age;
    private String DOB;
    private Long ID;
    private String username;
    private List<Module> registeredModules;
    private List<CourseProgramme> registeredCourses;

    public Student(final String name, final Integer age, final String DOB, final Long ID, final List<Module> registeredModules, final List<CourseProgramme> registeredCourses){
        this.setName(name);
        this.setAge(age);
        this.setDOB(DOB);
        this.setID(ID);
        this.setUsername(getUsername());
        this.setRegisteredModules(registeredModules);
        this.setRegisteredCourses(registeredCourses);
    }

    public String getUsername(){
       return (name.replaceAll("\\s","") + age);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public List<Module> getRegisteredModules() {
        return registeredModules;
    }

    public void setRegisteredModules(List<Module> registeredModules) {
        this.registeredModules = registeredModules;
    }

    public List<CourseProgramme> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<CourseProgramme> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
}
