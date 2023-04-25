import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest{

    Cohort azeban;
    Student genesis = new Student(4567839, "Genesis");
    Student lenny = new Student(8937499, "Isleny");
    Student bryan = new Student(8374759, "Bryan");

    @Before
    public void setUp(){
        this.azeban = new Cohort();

       this.azeban.addStudent(genesis);
        genesis.addGrade(96);
        genesis.addGrade(98);
        genesis.addGrade(97);

        this.azeban.addStudent(lenny);
        lenny.addGrade(95);
        lenny.addGrade(95);
        lenny.addGrade(95);

    }

    @Test
    public void testAddStudent(){
        assertNotNull(azeban);
        azeban.addStudent(bryan);
        assertEquals(3, azeban.getStudents().size());
    }

    @Test
    public void testInstanceGetStudentList(){
        assertNotNull(azeban.getStudents());
        assertEquals("Genesis", azeban.getStudents().get(0).getName());
    }

    @Test
    public void testGetAverage(){
        assertEquals(96.0, azeban.getCohortAverage(), 0);
        System.out.println(azeban.getCohortAverage());
    }


}
