package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class Food {
    private boolean isDrinkalble;
    private boolean hasSeed;

    public Food(boolean isDrinkalble, boolean hasSeed) {
        this.isDrinkalble = isDrinkalble;
        this.hasSeed = hasSeed;
    }

    public boolean isDrinkalble() {
        return isDrinkalble;
    }

    public void setDrinkalble(boolean drinkalble) {
        isDrinkalble = drinkalble;
    }

    public boolean isHasSeed() {
        return hasSeed;
    }

    public void setHasSeed(boolean hasSeed) {
        this.hasSeed = hasSeed;
    }

    public void eat(){
        System.out.println("Eat Food");
    }


    public String toString() {
        return "Food{" +
                "isDrinkalble=" + isDrinkalble +
                ", hasSeed=" + hasSeed +
                '}';
    }
}

class Fruit extends Food {
    private String season;

    public Fruit(boolean isDrinkalble, boolean hasSeed, String season) {
        super(isDrinkalble, hasSeed);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    @Override
    public void eat(){
        System.out.println("Eat Fruit");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Fruit{" +
                "season='" + season + '\'' +
                '}';
    }
}

class Apple extends Fruit {
    private String color;
    private String flavor;

    public Apple(boolean isDrinkalble, boolean hasSeed, String season, String color, String flavor) {
        super(isDrinkalble, hasSeed, season);
        this.color = color;
        this.flavor = flavor;
    }

    public Apple(boolean isDrinkalble, boolean hasSeed, String season) {
        super(isDrinkalble, hasSeed, season);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void eat() {
        System.out.println("Eat Apple");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Apple{" +
                "color='" + color + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}


class GrannySmith extends Apple {
    public GrannySmith(boolean isDrinkalble, boolean hasSeed, String season, String color, String flavor) {
        super(isDrinkalble, hasSeed, season, color, flavor);
    }

    public GrannySmith(boolean isDrinkalble, boolean hasSeed, String season) {
        super(isDrinkalble, hasSeed, season);
    }

    public String getColor(){
        return "Green";
    }

    @Override
    public void eat() {
        System.out.println("Eat GrannySmith Apple");
    }

}

class Fuji extends Apple {
    public Fuji(boolean isDrinkalble, boolean hasSeed, String season, String color, String flavor) {
        super(isDrinkalble, hasSeed, season, color, flavor);
    }

    public String getColor(){
        return "Red";
    }

    @Override
    public void eat() {
        System.out.println("Eat Fuji Apple");
    }

}



public class Excercise_01 {
    public static void main(String[] args) {
        Fuji fuji = new Fuji(false, true, "All Seasons", "red", "sweet");
        System.out.println(fuji.toString());
        System.out.println(fuji.getColor());

        GrannySmith granny = new GrannySmith(false, true, "Winter");
        System.out.println(granny.toString());
        System.out.println(granny.getColor());
    }
}
