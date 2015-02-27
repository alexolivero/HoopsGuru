
public class NameGenerator {

	static String[] white_first_names = {"Rick","Ashley","Robert","Chris"
			,"Alex","Aaron","Steve","Max","Evan","Daniel","Chad","Rhys"
			,"Bret","Thomas","Lucas","George","Chaz","Ace","Sergio",
			"Christian","Fernando","Micah","Matt","Wayne","A.J.","Hector","Preston",
			"Albert","Adam","Abel","Angelo","Ramon","Randall","Rami","Raj","Regis",
			"Reid","Rayne","Ray","Rider","Riley","Salvio","Salim","Zachary",
			"Devin","Jon","Harsh","Patrick"};
	static String[] white_last_names = {"James","Michaels","Rosenberg",
			"Heidi","Richards","Jordan","Wilson","Hill","Stoffels","Swanson"
			,"Corteia","Dubilai","Guadalajara","Rosenwinkel","Ayalp",
			"Rothenberg","Hanson","Alva","Diekman","Flood","Young","Zimmer","Nash",
			"Cerave","Spare","Mapa","Battia","Matheson","Flueggie","Olivero,"
			,"Greenland","Samsoni","Lampard","Lampeire","Waker","Atlas","Ayers",
			"Myers","Atkins","O'Brien","O'Shea","Cameron","Lambert","Napolean",
			"Murphy","El Arabi","Antinosek","Tosie","Quebec","Towers","Torres",
			"Alba","Ferrell","Kodiak","Smith","Jones","Starr","Hart","Hazard"
			,"O'Hoolihan"};
	
	static String[] black_first_names = {"Jamal","Mike","Jameis","Idode",
			"Darnell","Malik","Trevon","Maurice","DeShawn","Caleb","Gabriel"
			,"Jayden","Josiah","Jeremiah","Jermaine","Edius","Devon","Levon","DeMarcus",
			"Bo","Jim","James","JJ","Herbert","DeVonte","Travis","Darius","Levonte",
			"Marquis","DeMario","Doran","Decovon","Dazhawn","Derick","Demondre","Kobe"
			,"Dwight","Tyrone","Grover"};
	static String[] black_last_names = {"Scott","Jackson","Brown","Jones",
			"Johnson","Williams","Scott","Adams","Davis","Montgomery"
			,"Wade","Chambers","Ferguson","Rice","Tate","Danger","Thomas","Russell","Kerobo",
			"Boyd","White","Black","India","Watt","Wattson","Leone","Navier","Oday"
			,"Niles","Marvin","Mendez","Naheim","Marcio","Bryant","Bogues"};
	
	
	public static String generateName(){
		int choose = RandomNumber.randInt(0,1);
		if(choose == 1){
			return generateWhiteName();
		}
		else{
			return generateBlackName();
		}
	}
	
	public static String generateWhiteName(){
		String name = white_first_names[
		       RandomNumber.randInt(0,white_first_names.length - 1)]
		    		   +" "+
		       white_last_names[RandomNumber.randInt(0, white_last_names.length - 1)];
		
		return name;
	}
	
	public static String generateBlackName(){
		String name = black_first_names[
		       RandomNumber.randInt(0,black_first_names.length - 1)]
		    		   +" "+
		       black_last_names[RandomNumber.randInt(0,black_last_names.length - 1)];
		
		return name;
	}
}
