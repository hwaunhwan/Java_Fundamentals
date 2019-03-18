package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public abstract class PolyExample {


    public static void main(String[] args) {
        Instrument newInst = new Instrument();
        newInst.play();
        newInst.play("guitar");
        StringInst string1 = new StringInst();
        newInst = string1;
        newInst.play();
        newInst.test();
        newInst.learn();

    }
}

class Instrument implements PolyInterface {
    private boolean hasString;
    private String material;

    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void learn() {
        System.out.println("learn");
    }

    public void play(){
        System.out.println("play something");
    }

    public void play(String name){
        System.out.println("play " + name);
    }
}

class StringInst extends Instrument {
    @Override
    public void play() {
        System.out.println("play string instrument");
    }
}



