import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CourseProgrammeTest {

    @Mock
    private List<Module> mockModules;

    @Mock
    private List<Student> mockStudentsEnrolled;

    private final DateTime academicStartDate = new DateTime(2020, 9, 1, 10, 0);

    private final DateTime academicEndDate = new DateTime(2021, 6, 20, 16, 30);

    public CourseProgramme classUnderTest;

    private final String name = "CS &bIT";

    @Before
    public void setUp(){
        classUnderTest = new CourseProgramme();
    }

    @Test
    public void testGettersWorkingCorrectly(){
        // Setup
        classUnderTest = new CourseProgramme(name, academicStartDate, academicEndDate);
        classUnderTest.setModules(mockModules);
        classUnderTest.setStudentsEnrolled(mockStudentsEnrolled);

        // Execute
        String actualName = classUnderTest.getName();
        DateTime actualStartDate = classUnderTest.getAcademicStartDate();
        DateTime actualEndDate = classUnderTest.getAcademicEndDate();
        List<Module> actualModules = classUnderTest.getModules();
        List<Student> actualStudents = classUnderTest.getStudentsEnrolled();

        // Verify
        assertEquals(name, actualName);
        assertEquals(academicStartDate, actualStartDate);
        assertEquals(academicEndDate, actualEndDate);
        assertEquals(mockModules, actualModules);
        assertEquals(mockStudentsEnrolled, actualStudents);
    }

    @Test
    public void testSettersWorkingCorrectly(){
        // Setup
        CourseProgramme actual = classUnderTest;

        // Execute
        classUnderTest.setName(name);
        classUnderTest.setAcademicStartDate(academicStartDate);
        classUnderTest.setAcademicEndDate(academicEndDate);
        classUnderTest.setModules(mockModules);
        classUnderTest.setStudentsEnrolled(mockStudentsEnrolled);

        // Verify
        assertEquals(name, actual.getName());
        assertEquals(academicStartDate, actual.getAcademicStartDate());
        assertEquals(academicEndDate, actual.getAcademicEndDate());
        assertEquals(mockModules, actual.getModules());
        assertEquals(mockStudentsEnrolled, actual.getStudentsEnrolled());
    }
}
