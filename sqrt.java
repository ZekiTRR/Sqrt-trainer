import java.util.Random;
import java.util.Scanner;
class sqrt{

	public static void main(String[] args){
/*		for(int x=0;x < 21;x = x+1){
			System.out.println("sqrt(x)" + x + "=" + x*x);
		}
*/	

		Scanner myObj = new Scanner(System.in);

		Random rand = new Random();
		// int x = rand.nextInt(21);
		int y;
		System.out.println("Enter the max value for generate root: ");
		int value = myObj.nextInt();

		while(true){
			

			int x = rand.nextInt(value);
			System.out.println("Enter the sqrt of: " + x*x);
			int res = myObj.nextInt();

			if(res != x){
				System.out.println(" ");
				System.out.println("No,sqrt of " + x*x + " was = " + x);
}

			
		}		

	}
}
