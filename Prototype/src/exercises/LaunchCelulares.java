package exercises;

public class LaunchCelulares {
    public static void main(String[] args) {

        Accesorio accesorios[] = new Accesorio[3];
        accesorios[0] = new Accesorio("audifonos");
        accesorios[1] = new Accesorio("cargador");
        accesorios[2] = new Accesorio("estuche");
        
        SamsungR10 samsungR10 = new SamsungR10("629294", "ENTEL");
        samsungR10.setModelo(new Modelo(2, 3, 2, 4, 2));
        samsungR10.setSistema(new Sistema(1, 150));
        samsungR10.setAccesorios(accesorios);

        samsungR10.showInfo();
        SamsungR10 s1 = samsungR10.clone();
        s1.setSim(new SIM("VIVA", "71566500"));

        SamsungR10 s2 = samsungR10.clone();
        s2.setSim(new SIM("TIGO", "47564389"));

        SamsungR10 s3 = samsungR10.clone();
        s3.setSim(new SIM("VIVA", "46538909"));

        SamsungR10 s4 = samsungR10.clone();
        s4.setSim(new SIM("ENTEL", "65647383"));

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
    }
}
