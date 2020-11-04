import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ModuleTest {

    @Mock
    private List<Student> mockStudentsEnrolled;

    @Mock
    private List<CourseProgramme> mockCourseProgrammes;

    private Module classUnderTest;

    private final String name = "Software Engineering";
    private final String ID = "CT417";

    @Before
    public void setUp(){
        classUnderTest = new Module();
    }

    @Test
    public void testGettersWorkingCorrectly(){
        // Setup
        classUnderTest = new Module(name, ID);
        classUnderTest.setCourseProgrammes(mockCourseProgrammes);
        classUnderTest.setStudentsEnrolled(mockStudentsEnrolled);

        // Execute
        String actualName = classUnderTest.getName();
        String actualID = classUnderTest.getID();
        List<CourseProgramme> actualCourses = classUnderTest.getCourseProgrammes();
        List<Student> actualStudents = classUnderTest.getStudentsEnrolled();

        // Verify
        assertEquals(name, actualName);
        assertEquals(ID, actualID);
        assertEquals(mockCourseProgrammes, actualCourses);
        assertEquals(mockStudentsEnrolled, actualStudents);
    }

    @Test
    public void testSettersWorkingCorrectly(){
        // Setup
        Module actual = classUnderTest;

        // Execute
        classUnderTest.setName(name);
        classUnderTest.setID(ID);
        classUnderTest.setCourseProgrammes(mockCourseProgrammes);
        classUnderTest.setStudentsEnrolled(mockStudentsEnrolled);

        // Verify
        assertEquals(name, actual.getName());
        assertEquals(ID, actual.getID());
        assertEquals(mockStudentsEnrolled, actual.getStudentsEnrolled());
        assertEquals(mockCourseProgrammes, actual.getCourseProgrammes());
    }
}
