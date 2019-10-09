import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	String input = fizzbuzz.toString("Buzz");
	
	@Test
	void input_10_expence_output_is_Buzz() {
		assertEquals("Buzz",input);
	}

}
