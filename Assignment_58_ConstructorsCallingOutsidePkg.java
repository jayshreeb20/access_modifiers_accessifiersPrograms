package access_modifiers_accessifiersPrograms;

public class Assignment_58_ConstructorsCallingOutsidePkg 
{
	private Assignment_58_ConstructorsCallingOutsidePkg()
	{
		int a=10;
		int b= 20;
		int sum= a+b;
		System.out.println(sum);
		
	}
	
	public Assignment_58_ConstructorsCallingOutsidePkg(int a,int b)
	{
		int division = a/b;
		System.out.println(division);
	}
	
	protected Assignment_58_ConstructorsCallingOutsidePkg(float c,int d)
	{
		float sum= c+d;
		System.out.println(sum);
	}
	
	 Assignment_58_ConstructorsCallingOutsidePkg(double m , double n)
	{
		double sum= m+n;
		System.out.println(sum);
	}
	
	
	

}
