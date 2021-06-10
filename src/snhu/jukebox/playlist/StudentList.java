package snhu.jukebox.playlist;

import snhu.student.playlists.*;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);
		
		//Module 5 Code Assignment
		//Add your name to create a new student profile
		//Use template below and put your name in the areas of 'StudentName'
		//String StudentName3 = "TestStudent3Name";
		//studentNames.add(StudentName3);
		
		String StudentName3 = "Philip Enkema";  // added instructor as student 3
		studentNames.add(StudentName3);
		
		String StudentName4 = "Tennyson McCalla";
		studentNames.add(StudentName4);
		
		String TysonSmith = "Tyson Smith";
		studentNames.add(TysonSmith);
		
		String SarahDeleppo = "Sarah Deleppo"; //create string with name
		studentNames.add(SarahDeleppo); // add SarahDeleppo string to list of student names
		
		String KateKowalyshyn = "Kate Kowalyshyn"; //create string with name
		studentNames.add(KateKowalyshyn); // add KateKowalyshyn string to list of student names

		String StudentName8 = "Dakota Cromer";//added Dakota Cromer as student 5- updated to student 8 by KateKowalyshyn
		studentNames.add(StudentName8);

		String StudentName7 = "Jeremy Morrison";   //added Jeremy Morrison as student 4 - updated to student 7 by KateKowalyshyn
		studentNames.add(StudentName7);
		
		String MichaelDarling = "Michael Darling";
		studentNames.add(MichaelDarling); // Adding MichaelDarling to list of student names.
		
		String GabrielSwortwood = "Gabriel Swortwood";  // create string with name
		studentNames.add(GabrielSwortwood); // add GabrielSwortwood string to list of names
		
		return studentNames;
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		switch(student) {
		   case "TestStudent1_Playlist":
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			   
		   case "TestStudent2_Playlist":
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
  
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.
			   
		   case "PhilipEnkema_Playlist":
			   PhilipEnkema_Playlist PhilipEnkema_Playlist = new PhilipEnkema_Playlist();
			   Student PhilipEnkema = new Student("Philip Enkema", PhilipEnkema_Playlist.StudentPlaylist());
			   return PhilipEnkema;
			   
		   case "KateKowalyshyn_Playlist":
			   KateKowalyshyn_Playlist KateKowalyshynPlaylist = new KateKowalyshyn_Playlist();
			   Student KateKowalyshyn = new Student("Kate Kowalyshyn",KateKowalyshynPlaylist.StudentPlaylist());
			   return KateKowalyshyn;

		   case "GabrielSwortwood_Playlist":
			   GabrielSwortwood_Playlist GabrielSwortwood_Playlist = new GabrielSwortwood_Playlist();
			   Student GabrielSwortwood = new Student("Gabriel Swortwood", GabrielSwortwood_Playlist.StudentPlaylist());
			   return GabrielSwortwood;

		   case "SarahDeleppo_Playlist": //define new student Sarah Deleppo with associated playlist
			   SarahDeleppo_Playlist SarahDeleppo_Playlist = new SarahDeleppo_Playlist();
			   Student SarahDeleppo = new Student("Sarah Deleppo", SarahDeleppo_Playlist.StudentPlaylist());
			   return SarahDeleppo;
		}
		return emptyStudent;
	}
}
