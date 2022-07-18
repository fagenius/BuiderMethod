public class TrioAtieke implements ITrioBuilder{

    private Trio trio;

    public  TrioAtieke(){
        this.trio = new Trio();
    }

    @Override
    public void ajouterPlatPrincipal() {
        this.trio.setPlatPrincipal("Atiéké");
    }

    @Override
    public void ajouterAccompagnement() {
        this.trio.setAccompagnement("Aloko");
    }

    @Override
    public void ajouterBoisson() {
        this.trio.setBoisson("Bouye");
    }

    @Override
    public Trio getTrio() {
        return this.trio;
    }
}
