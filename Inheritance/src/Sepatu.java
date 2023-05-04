class Sepatu {
  protected String pendiri;

  public Sepatu(String pendiri) {
    this.pendiri = pendiri;
  }

  public void info() {
    System.out.println("Pendiri: " + pendiri);
  }
}
