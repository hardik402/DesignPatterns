package com.dp.factory;

public class FactoryMain {

	public static void main(String[] args) {
        IcecreamFactory icecreamFactory = new IcecreamFactory();
		IceCream iceCream = icecreamFactory.getInstance("chocolate");
		iceCream.make();
	}

}
