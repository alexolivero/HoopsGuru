import java.util.ArrayList;

public class Team {

	int id;
	String name;
	static ArrayList<Player> roster;//size max of 15
	ArrayList<Player> starters;//size should be 5
	int budget;
	
	public Team(int id_num, String n, int budg){
		id = id_num;
		name = n;
		budget = budg;
	}
	
	public static String GetNBAteam(int id){
		String[] list = {"Atlanta","Boston","Brooklyn","Charlotte","Chicago","Cleveland","Dallas","Denver",
				"Detroit","Golden State","Houston","Indiana","Los Angeles","Memphis","Miami","Milwaukee",
				"Minnesota","New Orleans","New York","Oklahoma","Orlando","Philidelphia","Phoenix",
				"Sacramento","San Antonio","Seattle","Toronto","Utah","Washington"};
		//29 teams
		return list[id];
	}
	
	public static void draftPlayer(){
		if(roster.size() < 15){
			
		}
		
	}
}
