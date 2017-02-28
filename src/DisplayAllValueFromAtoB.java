import java.util.Scanner;
public class DisplayAllValueFromAtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("Enter the initial value: ");
		a = input.nextInt();
		
		System.out.print("Enter the last value: ");
		b = input.nextInt();
		
		do{
			System.out.print(a+ " ");
			a++;
			
		}while(a <= b);
		
	}

}
