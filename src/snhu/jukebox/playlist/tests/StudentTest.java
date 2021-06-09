package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import snhu.jukebox.playlist.Student;
import snhu.jukebox.playlist.StudentList;
import snhu.student.playlists.*;


public class StudentTest {

	//Test the list of student names and ensure we get back the name value we expect at the correct/specific point in the list
	@Test
	public void testGetStudentNameList1() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent1Name", studentNames.get(0));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	@Test
	public void testGetStudentNameList2() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent2Name", studentNames.get(1));							//test case to see if the second value contains the name we expect
	}
	
	//Module 5 - Add your unit test case here to check for your name after you have added it to the StudentList
	
	@Test
	public void testGetGabrielSwortwoodList() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Gabriel Swortwood", studentNames.get(2));				     		//test case to see if the third value contains the name we expect
	}
	
	@Test
	public void testGetTennysonMcCallaList4() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Tennyson McCalla", studentNames.get(3));				     			//test case to see if the third value contains the name we expect
	}
	
	@Test
	public void testContainsSarahDeleppoList() { //added by Sarah Deleppo
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertTrue(studentNames.contains("Sarah Deleppo"));							//test case for pass/fail. Check to see if studentList contains name "Sarah Deleppo", does not rely on arraylist index
	}	
	
	public void testGetTyosnSmithList4() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Tyson Smith", studentNames.get(4));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	@Test
	public void testGetKateKowalyshynList() { //added by Kate Kowalyshyn
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Kate Kowalyshyn", studentNames.get(6));							//test case to see if the third value contains the name we expect
	}	
	
	@Test
	public void testContainsMichaelDarlingList() {
		List<String> studentNames = new ArrayList<String>();							// Declare and instantiate a list that will hold student names.
		StudentList studentList = new StudentList();									// Declare and instantiate a StudentList object.
		studentNames = studentList.getStudentsNames();									// Populate the studentNames list with the actual values in the StudentsList object.
		assertTrue(studentNames.contains("Michael Darling"));							// Test case for pass/fail. Check to see if studentList contains name "Michael Darling", does not rely on arraylist index.
	}

	@Test
	public void testGetDakotaCromerList5() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Dakota Cromer", studentNames.get(7));				     			//test case to see if the third value contains the name we expect
	}

	@Test
	public void testGetJeremyMorrisonList4() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Jeremy Morrison", studentNames.get(8));				     			//test case to see if the third value contains the name we expect
	}
	
	//Module 6 Test Case Area
	//Test each student profile to ensure it can be retrieved and accessed
	
	@Test
	public void testGetStudent1Profile() {
		TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();						//instantiating the variable for a specific student
		Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());		//creating populated student object
		assertEquals("TestStudent1", TestStudent1.getName());											//test case pass/fail line - did the name match what you expected?
	}
	
	@Test
	public void testGetStudent2Profile() {
		TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
		Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
		assertEquals("TestStudent2", TestStudent2.getName());
	}
	
	//Module 6 - Add your unit test case here to check for your profile after you have added it to the StudentList
	
	@Test
	public void testGetPhilipEnkemaProfile() {     // added instructor profile test
		PhilipEnkema_Playlist PhilipEnkema_Playlist = new PhilipEnkema_Playlist();
		Student PhilipEnkema = new Student("Philip Enkema", PhilipEnkema_Playlist.StudentPlaylist());
		assertEquals("Philip Enkema", PhilipEnkema.getName());
	}

		
	@Test
	public void testGetGabrielSwortwoodProfile() {     // added student profile test
		GabrielSwortwood_Playlist GabrielSwortwood_Playlist = new GabrielSwortwood_Playlist();
		Student GabrielSwortwood = new Student("Gabriel Swortwood", GabrielSwortwood_Playlist.StudentPlaylist());
		assertEquals("Gabriel Swortwood", GabrielSwortwood.getName());
	}
	
	@Test
	public void testGetSarahDeleppoProfile() {	//added Sarah Deleppo profile test  
		//instantiate student profile
		SarahDeleppo_Playlist SarahDeleppo_Playlist = new SarahDeleppo_Playlist();
		//create new student from student profile
		Student SarahDeleppo = new Student("Sarah Deleppo", SarahDeleppo_Playlist.StudentPlaylist());
		//check that getName returns expected value "Sarah Deleppo"
		assertEquals("Sarah Deleppo", SarahDeleppo.getName());

	}
}
