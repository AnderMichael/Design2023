package ejercicio3;

import java.util.List;

public class AFewCellphones implements SortCellphonesStrategy {

	@Override
	public void searchByModel(CellphoneStore store, String model) {
		List<Cellphone> cellphones = store.getCellphones();
		System.out.println("Linear Search by model\n");
		boolean founded = false;
		int posCellphone = 0;
		for (int c = 0; c < cellphones.size() && !founded; c++) {
			if (cellphones.get(c).getModel().equals(model)) {
				founded = true;
				posCellphone = c;
			}
		}
		if (founded) {
			System.out.println(String.format("El modelo %s existe entre los articulos de la tienda", model));
			cellphones.get(posCellphone).showInfo();
		} else {
			System.out.println(String.format("El modelo %s no existe entre los articulos de la tienda", model));
		}
	}

	@Override
	public void searchByPrice(CellphoneStore store, double price) {
		List<Cellphone> cellphones = store.getCellphones();
		System.out.println("Linear Search by price\n");
		boolean founded = false;
		int posCellphone = 0;
		for (int c = 0; c < cellphones.size() && !founded; c++) {
			if (cellphones.get(c).getPrice() == price) {
				founded = true;
				posCellphone = c;
			}
		}
		if (founded) {
			System.out.println(String.format("Un modelo de %.2f existe entre los articulos de la tienda", price));
			cellphones.get(posCellphone).showInfo();
		} else {
			System.out.println(String.format("Un modelo de %.2f no existe entre los articulos de la tienda", price));
		}
	}

}
