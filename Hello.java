package hello;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Here ye : important announcement");
		System.out.println("Hello World.");
		System.out.println("See you later!");
		System.out.println("Hi Alice!");
		System.out.println("Hi Bob!");
		System.out.println("Hi Charlie!");
		System.out.println("Hi Denise!");
		System.out.println("Hi Ester!");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println("The current local date is: " + LocalDate.now().format(formatter));
	}
}
