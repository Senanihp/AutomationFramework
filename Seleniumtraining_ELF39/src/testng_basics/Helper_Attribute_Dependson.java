package testng_basics;

import org.testng.annotations.Test;

public class Helper_Attribute_Dependson {
@Test(dependsOnMethods="Login")
public void Search() {
	System.out.println("Executing search");
	
}
@Test
public void Register() {
	System.out.println("Executing Register");
	
}
@Test(dependsOnMethods="Register")
public void Login() {
	System.out.println("Executing Login");
}
@Test(dependsOnMethods="Search")
public void Logout() {
	System.out.println("Executing Logout");
}
}
