import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {

	FizzBuzz fizzbuzz = new FizzBuzz();
	int input = fizzbuzz.getInt(4);
	
	@Test
	void input_4_expence_output_is_4() {
		assertEquals(4,input);
	}


}
