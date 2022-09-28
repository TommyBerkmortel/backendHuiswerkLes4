public class ElectricPokemon extends PokemonSuperClass {

    private String lightningColor;
    private String habbit;


    public ElectricPokemon(String name, int level, int hp, String type, String sound, String food, String lightningColor, String habbit) {
        super(name, level, hp, type, sound, food);
        this.lightningColor = lightningColor;
        this.habbit = habbit;
    }

    public String getLightningColor() {
        return lightningColor;
    }

    public String getHabbit() {
        return habbit;
    }

    public void setLightningColor(String lightningColor) {
        this.lightningColor = lightningColor;
    }

    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " said " + getSound());
    }

    public void thunderPunch() {
        System.out.println(getName() + " Strikes with a Thunderpunch!!!");
    }

    public void elektroBall() {
        System.out.println(getName() + " Strikes with a Elektro ball!!!");
    }

    public void thunder() {
        System.out.println(getName() + " Strikes with a Thunder!!!");
    }

    public void voltTracker() {
        System.out.println(getName() + " Strikes with a Volt tracker!!!");
    }
}

