package chapter01;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

	private String name;
	private String movieTitle;
	private Customer customer;
	private int _daysRented;
	@Before
	public void setup () {
		name = "John";
		movieTitle = "Titanic";
		customer = new Customer(name);
		_daysRented = 7;
	}

	@Test
	public void should_return_7_point_5_and_earn_one_frequent_renter_points_when_is_childrens_movie_rent_for_one_week() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
		int priceCode = 2;
		Movie movie = new Movie(movieTitle, priceCode);
		Rental rental = new Rental(movie, _daysRented);
		customer.addRental(rental);
		String result = customer.statement();
		String expectResult =
				"Rental Record for "+ name +"\n" +
						"\t" + movieTitle + "\t" + 7.5 + "\n" +
						"Amount owed is " + 7.5 + "\n" +
						"You earned " + 1 + " frequent renter points";
		assertEquals(result, expectResult);
	}

	@Test
	public void should_return_21_and_earn_2_frequent_renter_points_when_is_new_movie_rent_for_7_days() throws IllegalAccessException, ClassNotFoundException, InstantiationException {

		int priceCode = 1;
		Movie movie = new Movie(movieTitle, priceCode);
		Rental rental = new Rental(movie, _daysRented);
		customer.addRental(rental);
		String result = customer.statement();
		String expectResult =
				"Rental Record for "+ name +"\n" +
						"\t" + movieTitle + "\t" + 21.0 + "\n" +
						"Amount owed is " + 21.0 + "\n" +
						"You earned " + 2 + " frequent renter points";
		assertEquals(result, expectResult);
	}

	@Test
	public void should_return_9_point_5_and_earn_1_frequent_renter_points_when_is_regular_movie_rent_for_7_days() throws IllegalAccessException, ClassNotFoundException, InstantiationException {

		int priceCode = 0;
		Movie movie = new Movie(movieTitle, priceCode);
		Rental rental = new Rental(movie, _daysRented);
		customer.addRental(rental);
		String result = customer.statement();
		String expectResult =
				"Rental Record for "+ name +"\n" +
						"\t" + movieTitle + "\t" + 9.5 + "\n" +
						"Amount owed is " + 9.5 + "\n" +
						"You earned " + 1 + " frequent renter points";
		assertEquals(result, expectResult);
	}
}
