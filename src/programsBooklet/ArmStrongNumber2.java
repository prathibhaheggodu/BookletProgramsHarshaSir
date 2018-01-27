package programsBooklet;



public class ArmStrongNumber2 {

	public static void main(String[] args) {
        // To check between the range
		// armstrong number n=371
		// 3cube+7cube+1cube=371
		/*153
           370
           371
           407
        */


		System.out.println("The armstrong numbers are");

		for(int num=100;num<=1000;num++)

		{ int sum = 0, temp=num, r=0;
		while (temp > 0) 
		{
			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		
		}
		if (num == sum)
			System.out.println(num);
	}
}}