package skeletonnew;

import io.cucumber.java.en.Given;

public class SarahStepDefs {
	@Given("Sarah|She has {double} cucumber(s) in {word} {word}")
	public void sarahHasCucumbersInHerBag(Double double1,String string1,String string2) {
	  System.out.println(double1+"\t"+string1+"\t"+string2);
	}

}
