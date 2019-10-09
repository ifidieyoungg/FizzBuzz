import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	String input = fizzbuzz.toString("Fizz");
	
	@Test
	void input_6_expence_output_is_Fizz() {
		assertEquals("Fizz",input);
	}


}
