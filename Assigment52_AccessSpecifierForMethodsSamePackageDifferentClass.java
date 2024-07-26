package access_modifiers_accessifiersPrograms;

/*Here accessing methods from class within same package. Class name is Assigment51_AccessSpecifierForMethodsSameClass 
 having Methods with all four access specifiers.
 Within same package we can access methods from another class by creating it's object here methods having access specifier as public, protected 
 and default/package but not method having access specifier as private.
 */

public class Assigment52_AccessSpecifierForMethodsSamePackageDifferentClass 
{
	
	public static void main(String[] args) 
	{
		Assigment51_AccessSpecifierForMethodsSameClass a1 = new Assigment51_AccessSpecifierForMethodsSameClass();
		a1.add(); // access specifier public
		a1.multi();// protected
		a1.div();   //default/package
		
		
		
	}

}
