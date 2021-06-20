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

		String DakotaCromer = "Dakota Cromer";//added Dakota Cromer as student 5- updated to student 8 by KateKowalyshyn
		studentNames.add(DakotaCromer);

		String StudentName7 = "Jeremy Morrison";   //added Jeremy Morrison as student 4 - updated to student 7 by KateKowalyshyn
		studentNames.add(StudentName7);
		
		String MichaelDarling = "Michael Darling";
		studentNames.add(MichaelDarling); 					// Adding MichaelDarling to list of student names.
		
		String GabrielSwortwood = "Gabriel Swortwood";  	// create string with name
		studentNames.add(GabrielSwortwood); 				// add GabrielSwortwood string to list of names
		
		String KaitlynFrench = "Kaitlyn French"; 			//created string with my name
		studentNames.add(KaitlynFrench); 					//add KaitlynFrench string to list of student names
		
		String StudentName5 = "Peter Ozechowski";			//created string with my name  ---mistake here?
		studentNames.add(StudentName5); 					//add Peter Ozechowski string to list of student names
		
		String RyanBills = "Ryan Bills";					// Added RyanBills to list of student names
		studentNames.add(RyanBills);
		
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
			   
		   case "Tennyson_Playlist":
			   Tennyson_Playlist Tennyson_Playlist = new Tennyson_Playlist();
			   Student TennysonMcCalla = new Student("Tennyson McCalla", Tennyson_Playlist.StudentPlaylist());
			   return TennysonMcCalla;
			   
		   case "KateKowalyshyn_Playlist":
			   KateKowalyshyn_Playlist KateKowalyshynPlaylist = new KateKowalyshyn_Playlist();
			   Student KateKowalyshyn = new Student("Kate Kowalyshyn",KateKowalyshynPlaylist.StudentPlaylist());
			   return KateKowalyshyn;

		   case "TysonSmith_Playlist":
			   TysonSmith_Playlist tysonSmithPlaylist = new TysonSmith_Playlist();
			   Student tysonSmith = new Student("Tyson Smith", tysonSmithPlaylist.StudentPlaylist());
			   return tysonSmith;

		   case "GabrielSwortwood_Playlist":
			   GabrielSwortwood_Playlist GabrielSwortwood_Playlist = new GabrielSwortwood_Playlist();
			   Student GabrielSwortwood = new Student("Gabriel Swortwood", GabrielSwortwood_Playlist.StudentPlaylist());
			   return GabrielSwortwood;

		   case "SarahDeleppo_Playlist": //define new student Sarah Deleppo with associated playlist
			   SarahDeleppo_Playlist SarahDeleppo_Playlist = new SarahDeleppo_Playlist();
			   Student SarahDeleppo = new Student("Sarah Deleppo", SarahDeleppo_Playlist.StudentPlaylist());
			   return SarahDeleppo;
			   
		   case "KaitlynFrench_Playlist": //define new student Kaitlyn French with associated playlist
			   KaitlynFrench_Playlist KaitlynFrench_Playlist = new KaitlynFrench_Playlist();
			   Student KaitlynFrench = new Student("Kaitlyn French", KaitlynFrench_Playlist.StudentPlaylist());
			   return KaitlynFrench;
		   
		   case "MichaelDarling_Playlist": // Define new student Michael Darling with associated playlist
			   MichaelDarling_Playlist MichaelDarling_Playlist = new MichaelDarling_Playlist();
			   Student MichaelDarling = new Student("Michael Darling", MichaelDarling_Playlist.StudentPlaylist());
			   return MichaelDarling;
			   
		   case "JeremyMorrison_Playlist": //define new student Jeremy Morrison with associated playlist
			   JeremyMorrison_Playlist JeremyMorrison_Playlist = new JeremyMorrison_Playlist();
			   Student JeremyMorrison = new Student("Jeremy Morrison", JeremyMorrison_Playlist.StudentPlaylist());
			   return JeremyMorrison;

			   
		   case "PeterOzechowski_Playlist": //define new student Peter Ozechowski with associated playlist
			   PeterOzechowski_Playlist PeterOzechowski_Playlist = new PeterOzechowski_Playlist();
			   Student PeterOzechowski = new Student("Peter Ozechowski", PeterOzechowski_Playlist.StudentPlaylist());
			   return PeterOzechowski;
			   
		   case "DakotaCromer_Playlist":
			   DakotaCromer_Playlist DakotaCromer_Playlist = new DakotaCromer_Playlist();
			   Student DakotaCromer = new Student("Dakota Cromer", DakotaCromer_Playlist.StudentPlaylist());
			   return DakotaCromer;
			   
		   case "RyanBills_Playlist":
			   RyanBills_Playlist RyanBills_Playlist = new RyanBills_Playlist();
			   Student RyanBills = new Student("Dakota Cromer", RyanBills_Playlist.StudentPlaylist());
			   return RyanBills;
		}
		return emptyStudent;
	}
}
