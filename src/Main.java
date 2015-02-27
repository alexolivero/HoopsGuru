// test #3
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void printPlayerListByPosition(ArrayList<Player> p_l, String position_queried){
		for(Player p : p_l){
			System.out.println(p.name+", "+position_queried
					+" OVR:"+p.getOverall(position_queried)+", Team:"+p.team);
			System.out.println("Age:"+p.age+", DRIB:"+p.attributes.get("Dribbling")
					+", PASS:"+p.attributes.get("Passing")+", LAY:"+p.attributes.get("Layup")
					+", MID SHOT:"+p.attributes.get("Midrange Shot")
					+", 3 PT SHOT:"+p.attributes.get("3 PT Shot")
					+", PERIM DEF:"+p.attributes.get("Perimeter Defense")
					+", POST DEF:"+p.attributes.get("Post Defense")
					+", ATH:"+p.attributes.get("Athleticism"));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		String[] position_list = {"Point Guard","Shooting Guard",
				"Small Forward","Power Forward","Center"};
		ArrayList<Player> free_agent_player_list = new ArrayList<Player>();
		//ArrayList<Player> retired_player_list = new ArrayList<Player>();
		//ArrayList<Player> current_player_list = new ArrayList<Player>();
		MakeRoster.initializePlayers(free_agent_player_list, position_list);
		
		//to sort a list with a comparator
		Collections.sort(free_agent_player_list,new ovrShootingGuardcomparator());
		printPlayerListByPosition(free_agent_player_list, "Shooting Guard");
		
		//ArrayList<Team> team_list = new ArrayList<Team>();
		//MakeRoster.initializeTeams(team_list);

		
	}
	

	

}
