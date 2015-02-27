import java.util.Comparator;


public class DRIBcomparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		return o1.attributes.get("Dribbling") - o2.attributes.get("Dribbling");
	}
}
