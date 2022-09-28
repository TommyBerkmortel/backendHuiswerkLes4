public class WaterPokemon extends PokemonSuperClass{

    private String favoriteWater;
    private int waterTemp;

    public WaterPokemon(String name, int level, int hp, String type, String sound, String food, String favoriteWater, int waterTemp) {
        super(name, level, hp, type, sound, food);
        this.favoriteWater = favoriteWater;
        this.waterTemp = waterTemp;
    }

    public String getFavoriteWater() {
        return favoriteWater;
    }

    public int getWaterTemp() {
        return waterTemp;
    }

    public void setFavoriteWater(String favoriteWater) {
        this.favoriteWater = favoriteWater;
    }

    public void setWaterTemp(int waterTemp) {
        this.waterTemp = waterTemp;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " said " + getSound());
    }

    public void surf() {
        System.out.println(getName() + " Strikes with a Surf!!!");
    }

    public void hydroPump() {
        System.out.println(getName() + " Strikes with a Hydro pump!!!");
    }

    public void hydroCanon() {
        System.out.println(getName() + " Strikes with a Hydro canon!!!");
    }

    public void rainDance() {
        System.out.println(getName() + " Strikes with a Raine dance!!!");
    }
}


