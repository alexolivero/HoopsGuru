import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MakeRoster {

	public static void initializePlayers(ArrayList<Player> p_list,
			String[] position_list){

			for(int i = 0; i<500; i++){
					int id = i;
					Map<String, Integer> attributes = new HashMap<String, Integer>();
					Map<String, Integer> caps = new HashMap<String, Integer>();
					String name = NameGenerator.generateName();
					int age = RandomNumber.randInt(19, 36);
					String position = position_list[RandomNumber.randInt(0,4)];

					switch(position){
					case "Point Guard": 
						attributes.put("Dribbling",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Passing",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Layup",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Midrange Shot",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("3 PT Shot",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Perimeter Defense",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Post Defense",RandomNumber.normDist(1, 99, 10, 10));
						attributes.put("Athleticism",RandomNumber.normDist(1, 99, 50, 20));
						attributes.put("Morale Threshold",RandomNumber.normDist(1, 10, 5, 1));
						attributes.put("Growth Potential",RandomNumber.normDist(1, 10, 5, 1));
						caps.put("Dribbling",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Passing",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Layup",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Midrange Shot",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("3 PT Shot",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Perimeter Defense",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Post Defense",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Athleticism",RandomNumber.normDist(1, 99, 65, 20));
						
						break;
					case "Shooting Guard":
						attributes.put("Dribbling",RandomNumber.normDist(1, 99, 40, 10));
						attributes.put("Passing",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Layup",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Midrange Shot",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("3 PT Shot",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Perimeter Defense",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Post Defense",RandomNumber.normDist(1, 99, 10, 10));
						attributes.put("Athleticism",RandomNumber.normDist(1, 99, 50, 20));
						attributes.put("Morale Threshold",RandomNumber.normDist(1, 10, 5, 1));
						attributes.put("Growth Potential",RandomNumber.normDist(1, 10, 5, 1));
						caps.put("Dribbling",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Passing",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Layup",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Midrange Shot",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("3 PT Shot",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Perimeter Defense",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Post Defense",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Athleticism",RandomNumber.normDist(1, 99, 65, 20));
						break;
					case "Small Forward":
						attributes.put("Dribbling",RandomNumber.normDist(1, 99, 30, 10));
						attributes.put("Passing",RandomNumber.normDist(1, 99, 40, 10));
						attributes.put("Layup",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Midrange Shot",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("3 PT Shot",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Perimeter Defense",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Post Defense",RandomNumber.normDist(1, 99, 30, 10));
						attributes.put("Athleticism",RandomNumber.normDist(1, 99, 60, 20));
						attributes.put("Morale Threshold",RandomNumber.normDist(1, 10, 5, 1));
						attributes.put("Growth Potential",RandomNumber.normDist(1, 10, 5, 1));
						caps.put("Dribbling",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Passing",RandomNumber.normDist(1, 99, 60, 10));
						caps.put("Layup",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Midrange Shot",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("3 PT Shot",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Perimeter Defense",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Post Defense",RandomNumber.normDist(1, 99, 55, 10));
						caps.put("Athleticism",RandomNumber.normDist(1, 99, 75, 20));
						break;
					case "Power Forward":
						attributes.put("Dribbling",RandomNumber.normDist(1, 99, 20, 10));
						attributes.put("Passing",RandomNumber.normDist(1, 99, 30, 10));
						attributes.put("Layup",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Midrange Shot",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("3 PT Shot",RandomNumber.normDist(1, 99, 50, 10));
						attributes.put("Perimeter Defense",RandomNumber.normDist(1, 99, 30, 10));
						attributes.put("Post Defense",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Athleticism",RandomNumber.normDist(1, 99, 60, 20));
						attributes.put("Morale Threshold",RandomNumber.normDist(1, 10, 5, 1));
						attributes.put("Growth Potential",RandomNumber.normDist(1, 10, 5, 1));
						caps.put("Dribbling",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Passing",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Layup",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Midrange Shot",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("3 PT Shot",RandomNumber.normDist(1, 99, 65, 10));
						caps.put("Perimeter Defense",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Post Defense",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Athleticism",RandomNumber.normDist(1, 99, 75, 20));
						break;
					case "Center":
						attributes.put("Dribbling",RandomNumber.normDist(1, 99, 10, 10));
						attributes.put("Passing",RandomNumber.normDist(1, 99, 20, 10));
						attributes.put("Layup",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Midrange Shot",RandomNumber.normDist(1, 99, 40, 10));
						attributes.put("3 PT Shot",RandomNumber.normDist(1, 99, 40, 10));
						attributes.put("Perimeter Defense",RandomNumber.normDist(1, 99, 20, 10));
						attributes.put("Post Defense",RandomNumber.normDist(1, 99, 60, 10));
						attributes.put("Athleticism",RandomNumber.normDist(1, 99, 50, 20));
						attributes.put("Morale Threshold",RandomNumber.normDist(1, 10, 5, 1));
						attributes.put("Growth Potential",RandomNumber.normDist(1, 10, 5, 1));
						caps.put("Dribbling",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Passing",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Layup",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Midrange Shot",RandomNumber.normDist(1, 99, 60, 10));
						caps.put("3 PT Shot",RandomNumber.normDist(1, 99, 50, 10));
						caps.put("Perimeter Defense",RandomNumber.normDist(1, 99, 45, 10));
						caps.put("Post Defense",RandomNumber.normDist(1, 99, 80, 10));
						caps.put("Athleticism",RandomNumber.normDist(1, 99, 70, 20));
						break;
					}//end the switch statement
					
					p_list.add(new Player(id, name, position, age, attributes, caps));
			}
	}
	
	public static void initializeTeams(ArrayList<Team> t_l){
		for(int i = 0; i <29; i++){
			String name = Team.GetNBAteam(i);
			t_l.add(new Team(i,name,500));			
		}
	}
}






