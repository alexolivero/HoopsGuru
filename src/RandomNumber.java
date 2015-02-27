import java.util.Random;


public class RandomNumber {
	
	public static int normDist(int min, int max, int mean, int std_dev){
		Random rand = new Random();
		int randomNum;
		do {
			  double val = rand.nextGaussian() * std_dev + mean;
			  randomNum = (int) Math.round(val);
			} 
		while (randomNum <= min | randomNum >= max);
		return randomNum;
	}
	
	public static int randInt(int min, int max){
		Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}

}
