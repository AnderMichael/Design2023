package ejercicio3;

public interface SortCellphonesStrategy {
	public void searchByModel(CellphoneStore store, String model);

	public void searchByPrice(CellphoneStore store, double price);
}
