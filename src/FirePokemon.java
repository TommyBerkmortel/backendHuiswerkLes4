public class FirePokemon  extends PokemonSuperClass {

    private String fireColor;
    private int internalFireTemp;

    public FirePokemon(String name, int level, int hp, String type, String sound, String food, String fireColor, int internalFireTemp) {
        super(name, level, hp, type, sound, food);
        this.fireColor = fireColor;
        this.internalFireTemp = internalFireTemp;
    }

    public String getFireColor() {
        return fireColor;
    }

    public int getInternalFireTemp() {
        return internalFireTemp;
    }

    public void setFireColor(String fireColor) {
        this.fireColor = fireColor;
    }

    public void setInternalFireTemp(int internalFireTemp) {
        this.internalFireTemp = internalFireTemp;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " said " + getSound());
    }

    public void inferno() {
        System.out.println(getName() + " Strikes with a Inferno!!!");
    }

    public void pyroBall() {
        System.out.println(getName() + " Strikes with a Pyro ball!!!");
    }

    public void fireFlash() {
        System.out.println(getName() + " Strikes with a Fire flash!!!");
    }

    public void flameThrower() {
        System.out.println(getName() + " Strikes with a Flame thrower!!!");
    }
}

