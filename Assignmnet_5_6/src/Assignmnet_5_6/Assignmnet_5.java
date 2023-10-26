package Assignmnet_5_6;
import java.util.Random;

public class Assignmnet_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Coin coin = new Coin();

        System.out.println("Initial side of the coin: " + coin.getSideUp());

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 1; i <= 20; i++) {
            coin.toss();
            
            System.out.println("Toss " + i + ": " + coin.getSideUp());

            if (coin.getSideUp().equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }


        System.out.println("Number of times Heads came up: " + headsCount);
        System.out.println("Number of times Tails came up: " + tailsCount);
    }
}

class Coin {
    private String sideUp;

    public Coin() {
        toss();
    }

    public void toss() {
        Random random = new Random();
        int randomValue = random.nextInt(2);

        if (randomValue == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    public String getSideUp() {
        return sideUp;

	}

}
