package ejercicio3;

public class ALotOfCellphones implements SortCellphonesStrategy {

	@Override
	public void searchByModel(CellphoneStore store, String model) {
		if (store.getModelsMap().containsKey(model)) {
			System.out.println(String.format("El modelo %s existe entre los articulos de la tienda", model));
			store.getModelsMap().get(model).showInfo();
		} else {
			System.out.println(String.format("El modelo %s no existe entre los articulos de la tienda", model));
		}

	}

	@Override
	public void searchByPrice(CellphoneStore store, double price) {
		if (store.getPricesMap().containsKey(price)) {
			System.out.println(String.format("El modelo %.2f existe entre los articulos de la tienda", price));
			store.getPricesMap().get(price).showInfo();
		} else {
			System.out.println(String.format("Un modelo de %.2f no existe entre los articulos de la tienda", price));
		}
	}

}
