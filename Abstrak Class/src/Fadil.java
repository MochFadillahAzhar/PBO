class Fadil extends Manusia {// Turunan dari class Manusia

    public Fadil(String namaLengkap, int tahunLahir) {

        super(namaLengkap, tahunLahir);
    }

    @Override
    public void menyapa() {
        System.out.println("Sampurasun barudakk, nama lengkapku " + getNamaLengkap() +
                ", umurku " + getUmur() + " tahun.");
    }

}
