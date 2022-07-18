/*
 * TrioCheeseBurger.java
 */

/**
 * Constructeur de trio concret (Builder)
 */
public class TrioCheeseBurgerBuilder implements ITrioBuilder {
  private Trio trio;
  
  public TrioCheeseBurgerBuilder() {
    this.trio = new Trio();
  }
  
  public void ajouterPlatPrincipal() {
    this.trio.setPlatPrincipal("Cheeseburger");
  }
  
  public void ajouterAccompagnement() {
    this.trio.setAccompagnement("Frites");
  }
  
  public void ajouterBoisson() {
    this.trio.setBoisson("Boisson gazeuse");
  }
  
  public Trio getTrio() {
    return this.trio;
  }
  
}
