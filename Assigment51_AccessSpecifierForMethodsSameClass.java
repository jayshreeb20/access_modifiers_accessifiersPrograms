package access_modifiers_accessifiersPrograms;

public class Assigment51_AccessSpecifierForMethodsSameClass 

/*Access Specifier for methods within same class
	we can access all methods(with different access specifiers(4)) of same class in main method
	Access specifiers are of four types-
	*public
	*private
	*protected
	*default/package (if the access specifier is not mentioned in method namethen it is default /package)*/
{
	public void add()
	{
		
	}
	
	private void sub()
	{
		
	}
	
	protected void multi()
	{
		
	}
	
	void div()
	{
		
	}
	
	public static void main(String[] args)
	{
		Assigment51_AccessSpecifierForMethodsSameClass a1 = new Assigment51_AccessSpecifierForMethodsSameClass();
		a1.add();
		a1.sub();
		a1.multi();
		a1.div();
	}

}
