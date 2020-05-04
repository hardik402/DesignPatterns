package com.dp.factory;

public class IcecreamFactory {

	public IceCream getInstance(String type) {
		if (type.equalsIgnoreCase("plain"))
			return new Vanilla();
		else if (type.equalsIgnoreCase("Chocolate"))
			return new Chocolate();
		else
			return new CookiesAndCream();
	}
}
