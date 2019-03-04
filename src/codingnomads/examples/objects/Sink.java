package codingnomads.examples.objects;

public class Sink {

    private boolean dualSink;
    private String brand;
    private String basinTaype;

    public Sink(boolean dualSink, String brand, String basinTaype) {
        this.dualSink = dualSink;
        this.brand = brand;
        this.basinTaype = basinTaype;
    }

    public boolean isDualSink() {
        return dualSink;
    }

    public void setDualSink(boolean dualSink) {
        this.dualSink = dualSink;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBasinTaype() {
        return basinTaype;
    }

    public void setBasinTaype(String basinTaype) {
        this.basinTaype = basinTaype;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "dualSink=" + dualSink +
                ", brand='" + brand + '\'' +
                ", basinTaype='" + basinTaype + '\'' +
                '}';
    }
}
