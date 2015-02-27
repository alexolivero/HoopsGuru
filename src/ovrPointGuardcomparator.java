import java.util.Comparator;


public class ovrPointGuardcomparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getPointGuardOverall() - o2.getPointGuardOverall();
	}
}
