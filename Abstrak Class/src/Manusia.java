import java.util.Calendar;

abstract class Manusia {
    private String namaLengkap;
    private int tahunLahir;

    public Manusia(String namaLengkap, int tahunLahir) {
        this.namaLengkap = namaLengkap;
        this.tahunLahir = tahunLahir;
    }

    protected String getNamaLengkap() {
        return namaLengkap;
    }

    protected int getUmur() {
        Calendar cal = Calendar.getInstance();

        int tahunSekarang = cal.get(Calendar.YEAR);

        return tahunSekarang - tahunLahir;
    }

    public abstract void menyapa();
}
