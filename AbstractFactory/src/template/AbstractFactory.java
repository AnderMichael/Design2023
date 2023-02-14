package template;

import java.util.HashMap;

public class AbstractFactory {

	private static HashMap<String, IProduct> mapProducts = createMapProducts();

	private static HashMap<String, IProduct> createMapProducts() {
		HashMap<String, IProduct> mapProducts = new HashMap<String, IProduct>();
		mapProducts.put("ConcreteProduct1", new ConcreteProduct1());
		mapProducts.put("ConcreteProduct2", new ConcreteProduct2());
		mapProducts.put("ConcreteProduct3", new ConcreteProduct3());
		return mapProducts;
	}

	public static IProduct make(String objectType) {
		IProduct product = mapProducts.get(objectType);
		return product;
	}
}
