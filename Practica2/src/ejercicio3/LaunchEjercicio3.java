package ejercicio3;

public class LaunchEjercicio3 {
	public static void main(String[] args) {

		CellphoneStore store = new CellphoneStore();

		store.addCellphone(new Cellphone("SamsungS10", "Samsung", "Alta", 2150));
		store.addCellphone(new Cellphone("SamsungS9", "Samsung", "Media", 1750));
		store.addCellphone(new Cellphone("LG31", "LG", "Media", 1850));
		store.addCellphone(new Cellphone("SonyXpedia", "Sony", "Baja", 1650));

		setStrategy(store.getCellphones().size(), store);
		store.searchByModel("SamsungS9");
		store.searchByPrice(1850);

		store.addCellphone(new Cellphone("NoteOne", "Samsung", "Alta", 2650));
		store.addCellphone(new Cellphone("Nothing10", "Nothing", "Media", 1750));
		store.addCellphone(new Cellphone("HONOR4", "Honor", "Media", 1250));
		store.addCellphone(new Cellphone("Nothing7", "Nothing", "Baja", 1110));
		store.addCellphone(new Cellphone("Yummy9", "Yummy", "Baja", 1050));
		store.addCellphone(new Cellphone("AlcatelPopC1", "Alcatel", "Baja", 650));

		setStrategy(store.getCellphones().size(), store);
		store.searchByModel("LG31");
		store.searchByPrice(650);

		store.searchByModel("NotePlus");
		store.searchByPrice(1000);
	}

	public static void setStrategy(int sizeList, CellphoneStore store) {
		if (sizeList < 5) {
			store.setSortCellphonesStrategy(new AFewCellphones());
		} else {
			store.setSortCellphonesStrategy(new ALotOfCellphones());
		}
	}
}
