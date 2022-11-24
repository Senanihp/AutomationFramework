package testng_basics;

import org.testng.annotations.Test;

public class Basics_group1 {
	@Test
	public void Login() {
		System.out.println("Executing Login");	
	}
	@Test(groups="Smoke Test")
	public void Search() {
		System.out.println("Executing Search");	
	}
	@Test(groups="Smoke Test")
	public void AdvSearch() {
		System.out.println("Executing AdvSearch");
	}
	}



