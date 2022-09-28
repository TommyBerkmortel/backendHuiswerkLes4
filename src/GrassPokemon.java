public class GrassPokemon extends PokemonSuperClass {

    private String hate;
    private int evolutionLevel;

    public GrassPokemon(String name, int level, int hp, String type, String sound, String food, String hate, int evolutionLevel) {
        super(name, level, hp, type, sound, food);
        this.hate = hate;
        this.evolutionLevel = evolutionLevel;
    }

    public String getHate() {
        return hate;
    }

    public int getEvolutionLevel() {
        return evolutionLevel;
    }

    public void setHate(String hate) {
        this.hate = hate;
    }

    public void setEvolutionLevel(int evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " said " + getSound());
    }

    public void leafStorm() {
        System.out.println(getName() + " Strikes with a Leaf storm!!!");
    }

    public void solarBeam() {
        System.out.println(getName() + " Strikes with a Solar beam!!!");
    }

    public void leechSeed() {
        System.out.println(getName() + " Strikes with a Leecj Seed!!!");
    }

    public void leaveBlade() {
        System.out.println(getName() + " Strikes with a Leave blade!!!");
    }
}

