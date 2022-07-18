/*
 * ITrioBuilder.java
 */

/**
 * Constructeur de trio (IBuilder)
 */
public interface ITrioBuilder {
  // buildPart
  public void ajouterPlatPrincipal();
  public void ajouterAccompagnement();
  public void ajouterBoisson();
  
  // getObject
  public Trio getTrio();
}
