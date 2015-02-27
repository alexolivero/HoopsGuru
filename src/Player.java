import java.util.Map;

public class Player {

	int id;
	String name;
	String position;
	Team team;
	int age;
	Map<String, Integer> attributes;
	//Dribbling, Passing, Layup, Midrange Shot, 3 PT Shot, Perimeter Defense, Post Defense, Athleticism
	//Morale Threshold, Growth Potential, MORE MENTAL STATS
	Map<String, Integer> caps;
	//Dribbling, Passing, Layup, Midrange Shot, 3 PT Shot, Perimeter Defense, Post Defense, Athleticism
	int energy;
	int current_form;
	int market_value;
	
	public Player(int id_num, String nam, String pos, int ag, Map<String, Integer> att, Map<String, Integer> c){
		id = id_num;
		name = nam;
		position = pos;
		age = ag;
		attributes = att;
		caps = c;
		energy = 99;
	}
	
	//IMPORTANT
	public void playerGrow(int coaches_skill, int playtime, int growth_factor){
		//all the factors
	}
	
	public double gfr(double n, double low, double high){
		if(n>high){
			return 1;
		}
		if(n<low){
			return 0;
		}
		double output;
		output = (n - low) / (high - low);
		return output;
	}
	
	public int getPointGuardOverall(){
		int overall = 0;
		overall += 20 * gfr(attributes.get("Dribbling"), 50, 99);
		overall += 30 * gfr(attributes.get("Passing"), 50, 99);
		overall += 10 * gfr(attributes.get("Layup"), 50, 99);
		overall += 15 * gfr(attributes.get("Midrange Shot"), 50, 99);
		overall += 10 * gfr(attributes.get("3 PT Shot"), 50, 99);
		overall += 5 * gfr(attributes.get("Athleticism"), 40, 99);
		overall += 10 * gfr(attributes.get("Perimeter Defense"), 50, 99);
		return (int) overall;
	}
	public int getShootingGuardOverall(){
		int overall = 0;
		overall += 15 * gfr(attributes.get("Dribbling"), 50, 99);
		overall += 10 * gfr(attributes.get("Passing"), 50, 99);
		overall += 15 * gfr(attributes.get("Layup"), 50, 99);
		overall += 15 * gfr(attributes.get("Midrange Shot"), 50, 99);
		overall += 20 * gfr(attributes.get("3 PT Shot"), 50, 99);
		overall += 10 * gfr(attributes.get("Athleticism"), 40, 99);
		overall += 15 * gfr(attributes.get("Perimeter Defense"), 50, 99);
		return (int) overall;
	}
	public int getSmallForwardOverall(){
		int overall = 0;
		overall += 10 * gfr(attributes.get("Dribbling"), 50, 99);
		overall += 5 * gfr(attributes.get("Passing"), 50, 99);
		overall += 20 * gfr(attributes.get("Layup"), 50, 99);
		overall += 15 * gfr(attributes.get("Midrange Shot"), 50, 99);
		overall += 10 * gfr(attributes.get("3 PT Shot"), 50, 99);
		overall += 20 * gfr(attributes.get("Athleticism"), 40, 99);
		overall += 15 * gfr(attributes.get("Perimeter Defense"), 50, 99);
		overall += 5 * gfr(attributes.get("Post Defense"), 50, 99);
		return (int) overall;
	}
	public int getPowerForwardOverall(){
		int overall = 0;
		overall += 5 * gfr(attributes.get("Passing"), 50, 99);
		overall += 20 * gfr(attributes.get("Layup"), 50, 99);
		overall += 10 * gfr(attributes.get("Midrange Shot"), 50, 99);
		overall += 5 * gfr(attributes.get("3 PT Shot"), 50, 99);
		overall += 20 * gfr(attributes.get("Athleticism"), 40, 99);
		overall += 5 * gfr(attributes.get("Perimeter Defense"), 50, 99);
		overall += 20 * gfr(attributes.get("Post Defense"), 50, 99);
		return (int) overall;
	}
	public int getCenterOverall(){
		int overall = 0;
		overall += 5 * gfr(attributes.get("Passing"), 50, 99);
		overall += 25 * gfr(attributes.get("Layup"), 50, 99);
		overall += 10 * gfr(attributes.get("Midrange Shot"), 50, 99);
		overall += 5 * gfr(attributes.get("3 PT Shot"), 50, 99);
		overall += 15 * gfr(attributes.get("Athleticism"), 40, 99);
		overall += 5 * gfr(attributes.get("Perimeter Defense"), 50, 99);
		overall += 35 * gfr(attributes.get("Post Defense"), 50, 99);
		return (int) overall;
	}
	
	public int getOverall(String position){
		int overall = 0;
		switch(position){
		case "Point Guard": 
			overall += 20 * gfr(attributes.get("Dribbling"), 50, 99);
			overall += 30 * gfr(attributes.get("Passing"), 50, 99);
			overall += 10 * gfr(attributes.get("Layup"), 50, 99);
			overall += 15 * gfr(attributes.get("Midrange Shot"), 50, 99);
			overall += 10 * gfr(attributes.get("3 PT Shot"), 50, 99);
			overall += 5 * gfr(attributes.get("Athleticism"), 40, 99);
			overall += 10 * gfr(attributes.get("Perimeter Defense"), 50, 99);
			break;
		case "Shooting Guard":
			overall += 15 * gfr(attributes.get("Dribbling"), 50, 99);
			overall += 10 * gfr(attributes.get("Passing"), 50, 99);
			overall += 15 * gfr(attributes.get("Layup"), 50, 99);
			overall += 15 * gfr(attributes.get("Midrange Shot"), 50, 99);
			overall += 20 * gfr(attributes.get("3 PT Shot"), 50, 99);
			overall += 10 * gfr(attributes.get("Athleticism"), 40, 99);
			overall += 15 * gfr(attributes.get("Perimeter Defense"), 50, 99);
			break;
		case "Small Forward":
			overall += 10 * gfr(attributes.get("Dribbling"), 50, 99);
			overall += 5 * gfr(attributes.get("Passing"), 50, 99);
			overall += 20 * gfr(attributes.get("Layup"), 50, 99);
			overall += 15 * gfr(attributes.get("Midrange Shot"), 50, 99);
			overall += 10 * gfr(attributes.get("3 PT Shot"), 50, 99);
			overall += 20 * gfr(attributes.get("Athleticism"), 40, 99);
			overall += 15 * gfr(attributes.get("Perimeter Defense"), 50, 99);
			overall += 5 * gfr(attributes.get("Post Defense"), 50, 99);
			break;
		case "Power Forward":
			overall += 5 * gfr(attributes.get("Passing"), 50, 99);
			overall += 20 * gfr(attributes.get("Layup"), 50, 99);
			overall += 10 * gfr(attributes.get("Midrange Shot"), 50, 99);
			overall += 5 * gfr(attributes.get("3 PT Shot"), 50, 99);
			overall += 20 * gfr(attributes.get("Athleticism"), 40, 99);
			overall += 5 * gfr(attributes.get("Perimeter Defense"), 50, 99);
			overall += 20 * gfr(attributes.get("Post Defense"), 50, 99);
			break;
		case "Center":
			overall += 5 * gfr(attributes.get("Passing"), 50, 99);
			overall += 25 * gfr(attributes.get("Layup"), 50, 99);
			overall += 10 * gfr(attributes.get("Midrange Shot"), 50, 99);
			overall += 5 * gfr(attributes.get("3 PT Shot"), 50, 99);
			overall += 15 * gfr(attributes.get("Athleticism"), 40, 99);
			overall += 5 * gfr(attributes.get("Perimeter Defense"), 50, 99);
			overall += 35 * gfr(attributes.get("Post Defense"), 50, 99);
			break;
		}
		return (int) overall;
	}


	
}
