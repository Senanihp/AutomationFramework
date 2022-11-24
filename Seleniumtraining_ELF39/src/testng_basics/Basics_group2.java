package testng_basics;

import org.testng.annotations.Test;

public class Basics_group2 {
	@Test
	public void Register() {
		System.out.println("Executing Register");	
	}
	@Test
	public void Addtocart() {
		System.out.println("Executing Addtocart");
		
	}
	@Test(groups="Smoke Test")
	public void Logout() {
		System.out.println("Executing Logout");
	}
	}

