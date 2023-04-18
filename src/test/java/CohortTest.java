import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CohortTest{

    Cohort azeban = new Cohort();
    Student genesis = new Student(4567839, "Genesis");
    Student lenny = new Student(8937499, "Isleny");

    @Before
    public void setUp(){
        azeban.addStudent(genesis);
        genesis.addGrade(96);
        genesis.addGrade(98);
        genesis.addGrade(97);

        azeban.addStudent(lenny);
        lenny.addGrade(95);
        lenny.addGrade(95);
        lenny.addGrade(95);
    }

    @Test
    public void testAddStudent(){
        assertNotNull(azeban);
    }

    @Test
    public void testInstanceGetStudentList(){
        assertNotNull(azeban.getStudents());
    }

//    @Test
//    public void testGetAverage(){
//        assertSame(192, azeban.getCohortAverage());
//        System.out.println(azeban.getCohortAverage());
//        //find out if you're actually adding grades bc the debugger is saying the size of the arraylist is 0.
//    }


}
