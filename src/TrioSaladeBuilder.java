/*
 * TrioSaladeBuilder.java
 */

/**
 * Constructeur de trio concret (Builder)
 */
public class TrioSaladeBuilder implements ITrioBuilder {
  private Trio trio;
  
  public TrioSaladeBuilder() {
    this.trio = new Trio();
  }
  
  public void ajouterPlatPrincipal() {
    this.trio.setPlatPrincipal("Salade");
  }
  
  public void ajouterAccompagnement() {
    this.trio.setAccompagnement("Yogourt");
  }
  
  public void ajouterBoisson() {
    this.trio.setBoisson("Jus de fruits");
  }
  
  public Trio getTrio() {
    return this.trio;
  }
  
}
