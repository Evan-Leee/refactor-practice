package chapter01;

import java.util.HashMap;
import java.util.Map;

public class Movie {
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private Map<Integer, String> priceCodeMap = new HashMap();

	public Movie(String title, int priceCode) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		_title = title;
//		priceCodeMap.put(CHILDREN, "Children");
//		priceCodeMap.put(REGULAR, "Regular");
//		priceCodeMap.put(NEW_RELEASE, "NewRelease");
		setPriceCode(priceCode);
	}

	private Price _price;

	public int getPriceCode() { // 取得价格代号
		return _price.getPriceCode();
	}

	public void setPriceCode(int arg) throws ClassNotFoundException, IllegalAccessException, InstantiationException { // 设定价格代号
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDREN:
			_price = new ChildrenPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
//		System.out.println(">>>>>>>>>>>>>" + arg);
//		System.out.println(">>>>>>>>>>>>>" + priceCodeMap);
//		Class price = Class.forName(priceCodeMap.get(arg)+"Price");
//		_price = (Price) price.newInstance();
	}

	public String getTitle() {
		return _title;
	}

	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
}