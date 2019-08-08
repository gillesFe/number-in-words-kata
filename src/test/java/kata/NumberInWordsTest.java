package kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NumberInWordsTest {

	@Test
	public void should_return_one_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(1).get()).isEqualTo("UN");
	}
	
	@Test
	public void should_return_two_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(2).get()).isEqualTo("DEUX");
	}
	
	@Test
	public void should_return_three_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(3).get()).isEqualTo("TROIS");
	}
	
	@Test
	public void should_return_four_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(4).get()).isEqualTo("QUATRE");
	}
	
	@Test
	public void should_return_ten_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(10).get()).isEqualTo("DIX");
	}
	
	@Test
	public void should_return_fifteen_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(15).get()).isEqualTo("QUINZE");
	}
	
	@Test
	public void should_return_twenty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(20).get()).isEqualTo("VINGT");
	}
	
	@Test
	public void should_return_twenty_one_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(21).get()).isEqualTo("VINGT ET UN");
	}
	
	@Test
	public void should_return_twenty_two_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(22).get()).isEqualTo("VINGT DEUX");
	}
	
	@Test
	public void should_return_twenty_three_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(23).get()).isEqualTo("VINGT TROIS");
	}
	
	@Test
	public void should_return_twenty_nine_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(29).get()).isEqualTo("VINGT NEUF");
	}
	
	@Test
	public void should_return_fourty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(40).get()).isEqualTo("QUARANTE");
	}
	
	@Test
	public void should_return_fourty_one_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(41).get()).isEqualTo("QUARANTE ET UN");
	}
	
	@Test
	public void should_return_thirty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(30).get()).isEqualTo("TRENTE");
	}
	
	@Test
	public void should_return_fifty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(50).get()).isEqualTo("CINQUANTE");
	}
	
	@Test
	public void should_return_sixty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(60).get()).isEqualTo("SOIXANTE");
	}
	
	@Test
	public void should_return_seventy_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(70).get()).isEqualTo("SOIXANTE DIX");
	}
	
	@Test
	public void should_return_eighty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(80).get()).isEqualTo("QUATRE VINGT");
	}
	
	@Test
	public void should_return_eighty_ten_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(90).get()).isEqualTo("QUATRE VINGT DIX");
	}
	
	@Test
	public void should_return_one_hundred_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(100).get()).isEqualTo("CENT");
	}
	
	@Test
	public void should_return_one_hundred_and_ten_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(110).get()).isEqualTo("CENT DIX");
	}
	
	@Test
	public void should_return_one_hundred_and_eleven_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(111).get()).isEqualTo("CENT ONZE");
	}
	
	@Test
	public void should_return_one_hundred_and_twelve_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(112).get()).isEqualTo("CENT DOUZE");
	}
	
	@Test
	public void should_return_two_hundreds_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(200).get()).isEqualTo("DEUX CENT");
	}
	
	@Test
	public void should_return_one_hundreds_and_ten_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(210).get()).isEqualTo("DEUX CENT DIX");
	}
	
	@Test
	public void should_return_two_hundreds_and_twenty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(220).get()).isEqualTo("DEUX CENT VINGT");
	}
	
	@Test
	public void should_return_five_hundreds_and_twenty_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(520).get()).isEqualTo("CINQ CENT VINGT");
	}
	
	@Test
	public void should_return_one_hundred_and_twenty_one_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(121).get()).isEqualTo("CENT VINGT ET UN");
	}
	
	@Test
	public void should_return_one_hundred_and_twenty_nine_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(129).get()).isEqualTo("CENT VINGT NEUF");
	}
	
	@Test
	public void should_return_nine_hundreds_and_ninety_nine_in_strings_from_integer() throws Exception {
		assertThat(NumberInWords.from(999).get()).isEqualTo("NEUF CENT QUATRE VINGT DIX NEUF");
	}
}
