class Nike extends Sepatu {
  private String kantor;

  public Nike(String pendiri, String kantor) {
    super(pendiri);
    this.kantor = kantor;
  }

  public void info() {
    System.out.println("nike " + pendiri + " dibuat " + kantor);
  }
}
