/*
 * Trio.java
 */

/**
 * Trio (Product)
 */
public class Trio {
  private String platPrincipal;
  private String accompagnement;
  private String boisson;
  
  public String getPlatPrincipal() {
    return this.platPrincipal;
  }
  
  public String getAccompagnement() {
    return this.accompagnement;
  }
  
  public String getBoisson() {
    return this.boisson;
  }
  
  public void setPlatPrincipal(String plat) {
    this.platPrincipal = plat;
  }
  
  public void setAccompagnement(String acc) {
    this.accompagnement = acc;
  }
  
  public void setBoisson(String brevage) {
    this.boisson = brevage;
  }
}
