package fanfanf.tulipe;

public class Moto {

  private int prix;

  private String marque;

  private String model;

  public Moto(int prix, String marque, String model) {
    super();
    this.prix = prix;
    this.marque = marque;
    this.model = model;
  }

  public int getPrix() {
    return prix;
  }

  public void setPrix(int prix) {
    this.prix = prix;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

}
