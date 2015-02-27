import java.util.Comparator;


public class ovrShootingGuardcomparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getShootingGuardOverall() - o2.getShootingGuardOverall();
	}
}
