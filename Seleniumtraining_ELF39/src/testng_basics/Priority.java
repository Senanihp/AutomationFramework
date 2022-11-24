package testng_basics;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=3)
	public void Search() {
		System.out.println("Executing search");
		
	}
	@Test(priority=1)
	public void Register() {
		System.out.println("Executing Register");
		
	}
   @Test(priority=2)
	public void Login() {
		System.out.println("Executing Login");
	}
	@Test(priority=4)
	public void Logout() {
		System.out.println("Executing Logout");
	}
	}


