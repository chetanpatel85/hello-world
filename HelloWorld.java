public class HelloWorld
{
	int discountValue;

	public static void main(String str[])
	{
		System.out.println("Hello World!");
		float d = new HelloWorld().calInterest(2.5);
		System.out.println("");

	}
		
        public float calInterest(float fInterestRate)
	{
		return discountValue * (1 + fInterestRate);
	}
}