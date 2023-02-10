package exercises;

public class SIM {
    private String enterpise;
    private String cellphoneNumber;

    public SIM(String enterpise, String cellphoneNumber) {
        this.enterpise = enterpise;
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getEnterpise() {
        return enterpise;
    }

    public void setEnterpise(String enterpise) {
        this.enterpise = enterpise;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

}