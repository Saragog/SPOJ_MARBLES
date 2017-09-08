import java.util.Scanner;

class Marbles {
	private static Scanner input;
	
	private void performOneTest()
	{
		int marbleTypeCount, marblesToChoose;
		marbleTypeCount = input.nextInt();
		marblesToChoose = input.nextInt();
		
		// TODO tutaj trzeba zamiescic obliczenie liczby mozliwosci :(
		
		return;
	}
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int testNumber = input.nextInt();
		Marbles marbles = new Marbles();
		while(testNumber-- > 0)
			marbles.performOneTest();
		return;
	}
}
