package Computer;

public class Bilgisayar {
    private String isim;
    private int ram;
    private String islemci;
    public int ekranBuyuklugu;

    public Bilgisayar(String isim, int ram, String islemci, int ekranBuyuklugu) {
        this.isim = isim;
        this.ram = ram;
        this.islemci = islemci;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }

    public int getEkranBuyuklugu() {
        return ekranBuyuklugu;
    }

    public String getIsim() {
        return isim;
    }
}

