public class App {
    public static <Tabung, Kubus, Balok> void main(String[] args) throws Exception {
        Tabung tabung = new Tabung("tabung");
        Kubus kubus = new Kubus("kubus");
        Balok balok = new Balok("balok");

        Tabung.inputNilai = "sepuluh";
        Balok.luasPermukaan = 20;
        Balok.volume();

        Kubus.inputNilai();
        Kubus.luasPermukaan();
        Kubus.volume();

        Tabung.inputNilai();
        Tabung.luasPermukaan();
        Tabung.volume();
    }
}