class Ujang extends Manusia {
    public Ujang(String namaLengkap, int tahunLahir) {
        super(namaLengkap, tahunLahir);
    }

    @Override
    public void menyapa() {
        System.out.println("Selamat datang, nama lengkapku " + getNamaLengkap() +
                ", umurku " + getUmur() + " tahun.");
    }
}