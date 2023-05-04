class Adidas extends Sepatu {
    private int didirikan;

    public Adidas(String pendiri, int didirikan) {
        super(pendiri);
        this.didirikan = didirikan;
    }

    public void info() {
        System.out.println("Adidas " + pendiri + " didirikan " + didirikan);
    }
}
