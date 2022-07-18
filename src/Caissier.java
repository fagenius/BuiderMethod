/*
 * Caissier.java
 */

/**
 * Caissier (Director)
 */
public class Caissier {
  private ITrioBuilder builder;
  
  public Caissier(ITrioBuilder b) {
    this.builder = b;
  }
  
  // build
  public void preparerCommande() {
    this.builder.ajouterPlatPrincipal();
    this.builder.ajouterAccompagnement();
    this.builder.ajouterBoisson();
  }
  
  public Trio getTrio() {
    return this.builder.getTrio();
  }
  
}
