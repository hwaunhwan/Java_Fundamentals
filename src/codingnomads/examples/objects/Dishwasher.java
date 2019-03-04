package codingnomads.examples.objects;

public class Dishwasher {

    private boolean isEngergyEfficient;
    private String brand;
    private int yearsOld;

    public Dishwasher(boolean isEngergyEfficient, String brand, int yearsOld) {
        this.isEngergyEfficient = isEngergyEfficient;
        this.brand = brand;
        this.yearsOld = yearsOld;
    }

    public boolean isEngergyEfficient() {
        return isEngergyEfficient;
    }

    public void setEngergyEfficient(boolean engergyEfficient) {
        isEngergyEfficient = engergyEfficient;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public String toString() {
        return "Dishwasher{" +
                "isEngergyEfficient=" + isEngergyEfficient +
                ", brand='" + brand + '\'' +
                ", yearsOld=" + yearsOld +
                '}';
    }
}
