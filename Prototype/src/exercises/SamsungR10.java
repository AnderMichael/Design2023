package exercises;

public class SamsungR10 implements ISamsumgR10 {
    private Modelo modelo;
    private SIM sim;
    private Sistema sistema;
    private Accesorio accesorios[] = new Accesorio[3];

    public SamsungR10(String cellphoneNumber, String enterpise) {
        this.sim = new SIM(enterpise, cellphoneNumber);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Accesorio[] getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorio[] accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public SamsungR10 clone() {
        SamsungR10 clone = new SamsungR10(sim.getCellphoneNumber(), sim.getEnterpise());
        clone.setAccesorios(this.accesorios);
        clone.setSistema(this.sistema);
        clone.setModelo(this.modelo);
        return clone;
    }

    public void showInfo() {
        System.out.println("--------------");
        System.out.println("SIM: " + sim.getCellphoneNumber() + " " + sim.getEnterpise());
        System.out.print("Accesorios: ");
        for (int i = 0; i < accesorios.length; i++) {
            System.out.print(" " + accesorios[i].getName());
        }
        System.out.println();
        System.out
                .println("Modelo: " + "\nmemoria " + modelo.getMemory() + "\nbluetooth version " + modelo.getBluetooth()
                        + "\ncamaras " + modelo.getCameras() + "\nCPU version " + modelo.getCpu());
    }

}
