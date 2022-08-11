package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job test_job1 = new Job();
        Job test_job2 = new Job();

        assertTrue(test_job1.getId() != test_job2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job1.getId() == test_job1.getId());
        assertTrue(test_job1.getName() == "Product tester");
        assertTrue(test_job1.getEmployer() instanceof Employer);
        assertTrue(test_job1.getLocation() instanceof Location);
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(test_job1.getId(), test_job1.getId());
        assertEquals("Product tester", test_job1.getName());
        assertEquals("ACME", test_job1.getEmployer().getValue());
        assertEquals("Desert", test_job1.getLocation().getValue());
        assertEquals("Quality control", test_job1.getPositionType().getValue());
        assertEquals("Persistence", test_job1.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job test_job3 = new Job();
        Job test_job4 = new Job();

        assertFalse(test_job3.getId() == test_job4.getId());

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){

        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.toString().startsWith("\n"));
        assertTrue(test_job.toString().endsWith("\n"));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.toString().contains("ID: " + test_job.getId()));
        assertTrue(test_job.toString().contains("Name: " + test_job.getName()));
        assertTrue(test_job.toString().contains("Employer: " + test_job.getEmployer()));
        assertTrue(test_job.toString().contains("Location: " + test_job.getLocation()));
        assertTrue(test_job.toString().contains("Position Type: " + test_job.getPositionType()));
        assertTrue(test_job.toString().contains("Core Competency: " + test_job.getCoreCompetency()));
    }

}
