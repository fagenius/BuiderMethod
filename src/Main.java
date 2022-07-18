/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    ITrioBuilder trioSalade = new TrioSaladeBuilder();
    ITrioBuilder trioCheese = new TrioCheeseBurgerBuilder();
    ITrioBuilder trioAtieke = new TrioAtieke();
    
    System.out.println("------------------------------");
    Caissier caissier = new Caissier(trioSalade);
    caissier.preparerCommande();
    Trio trio = caissier.getTrio();
    System.out.println(trio.getPlatPrincipal());
    System.out.println(trio.getAccompagnement());
    System.out.println(trio.getBoisson());
    
    System.out.println("------------------------------");
    caissier = new Caissier(trioCheese);
    caissier.preparerCommande();
    trio = caissier.getTrio();
    System.out.println(trio.getPlatPrincipal());
    System.out.println(trio.getAccompagnement());
    System.out.println(trio.getBoisson());

    System.out.println("------------------------------");
    caissier = new Caissier(trioAtieke);
    caissier.preparerCommande();
    trio = caissier.getTrio();
    System.out.println(trio.getPlatPrincipal());
    System.out.println(trio.getAccompagnement());
    System.out.println(trio.getBoisson());
  }
  
}
