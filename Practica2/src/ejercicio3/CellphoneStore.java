package ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CellphoneStore {
	private List<Cellphone> cellphones = new ArrayList<>();
	private HashMap<String, Cellphone> modelsMap = new HashMap<String, Cellphone>();
	private HashMap<Double, Cellphone> pricesMap = new HashMap<Double, Cellphone>();

	private SortCellphonesStrategy sortCellphonesStrategy;

	public List<Cellphone> getCellphones() {
		return cellphones;
	}

	public void setCellphones(List<Cellphone> cellphones) {
		this.cellphones = cellphones;
	}

	public SortCellphonesStrategy getSortCellphonesStrategy() {
		return sortCellphonesStrategy;
	}

	public void setSortCellphonesStrategy(SortCellphonesStrategy sortCellphonesStrategy) {
		this.sortCellphonesStrategy = sortCellphonesStrategy;
	}

	public void addCellphone(Cellphone cellphone) {
		cellphones.add(cellphone);
		modelsMap.put(cellphone.getModel(), cellphone);
		pricesMap.put(cellphone.getPrice(), cellphone);
	}

	public HashMap<String, Cellphone> getModelsMap() {
		return modelsMap;
	}

	public void setModelsMap(HashMap<String, Cellphone> modelsMap) {
		this.modelsMap = modelsMap;
	}

	public HashMap<Double, Cellphone> getPricesMap() {
		return pricesMap;
	}

	public void setPricesMap(HashMap<Double, Cellphone> pricesMap) {
		this.pricesMap = pricesMap;
	}

	public void searchByPrice(double price) {
		sortCellphonesStrategy.searchByPrice(this, price);
	}

	public void searchByModel(String model) {
		sortCellphonesStrategy.searchByModel(this, model);
	}
}
