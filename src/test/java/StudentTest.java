import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class StudentTest {

    private Student classUnderTest;

    private final String name = "John Smith";
    private final Integer age = 22;
    private final String DOB = "25/01/1990";
    private final Long ID = 236385649L;
    //private final List<Module> registeredModules = List.of();//mock(Module.class), mock(Module.class), mock(Module.class)
    //private final List<CourseProgramme> registeredCourses = List.of();//mock(CourseProgramme.class), mock(CourseProgramme.class), mock(CourseProgramme.class)

    @Before
    public void setUp(){
        classUnderTest = new Student(name, age, DOB, ID);
    }

    @Test
    public void getUsernameBehavesCorrectly(){

        // Setup
        String expected = "JohnSmith22";

        // Execute
        String actual = classUnderTest.getUsername();

        // Verify
        assertThat(actual, equalTo(expected));
    }
}