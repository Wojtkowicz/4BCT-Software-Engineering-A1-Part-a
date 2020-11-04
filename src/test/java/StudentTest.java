import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class StudentTest {

    @Mock
    private List<Module> mockRegisteredModules;

    @Mock
    private List<CourseProgramme> mockRegisteredCourses;

    private Student classUnderTest;

    private final String name = "John Smith";
    private final Integer age = 22;
    private final String DOB = "25/01/1990";
    private final Long ID = 236385649L;

    @Before
    public void setUp(){
        classUnderTest = new Student();
    }

    @Test
    public void testGetUsernameBehavesCorrectly(){

        // Setup
        classUnderTest = new Student(name, age, DOB, ID);
        String expected = "JohnSmith22";

        // Execute
        String actual = classUnderTest.getUsername();

        // Verify
        assertEquals(expected, actual);
    }

    @Test
    public void testGettersWorkingCorrectly(){
        // Setup
        classUnderTest = new Student(name, age, DOB, ID);
        classUnderTest.setRegisteredCourses(mockRegisteredCourses);
        classUnderTest.setRegisteredModules(mockRegisteredModules);

        // Execute
        String actualName = classUnderTest.getName();
        Integer actualAge = classUnderTest.getAge();
        String actualDOB = classUnderTest.getDOB();
        Long actualID = classUnderTest.getID();
        List<Module> actualModules = classUnderTest.getRegisteredModules();
        List<CourseProgramme> actualProgrammes = classUnderTest.getRegisteredCourses();

        // Verify
        assertEquals(name, actualName);
        assertEquals(age, actualAge);
        assertEquals(DOB, actualDOB);
        assertEquals(ID, actualID);
        assertEquals(mockRegisteredModules, actualModules);
        assertEquals(mockRegisteredCourses, actualProgrammes);
    }

    @Test
    public void testSettersWorkingCorrectly(){
        // Setup
        Student actual = classUnderTest;

        // Execute
        classUnderTest.setName(name);
        classUnderTest.setAge(age);
        classUnderTest.setDOB(DOB);
        classUnderTest.setID(ID);
        classUnderTest.setRegisteredModules(mockRegisteredModules);
        classUnderTest.setRegisteredCourses(mockRegisteredCourses);

        // Verify
        assertEquals(name, actual.getName());
        assertEquals(age, actual.getAge());
        assertEquals(DOB, actual.getDOB());
        assertEquals(ID, actual.getID());
        assertEquals(mockRegisteredModules, actual.getRegisteredModules());
        assertEquals(mockRegisteredCourses, actual.getRegisteredCourses());
    }
}