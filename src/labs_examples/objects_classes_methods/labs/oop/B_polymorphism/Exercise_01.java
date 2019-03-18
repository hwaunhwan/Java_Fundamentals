package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import labs_examples.packages.examples.package_01.Book;

public class Exercise_01 {
    public static void main(String[] args) {
        Store store1 = new Store(100, 100);
        Store store2 = new Store();
        System.out.println(store2.toString());
        store2 = store1;
        System.out.println(store2.toString());
        store2.open();
        store2.close();

        Bookstore bookstore = new Bookstore();
        bookstore.open();
        bookstore.close();

        RecordStore recordStore = new RecordStore();
        recordStore.openInterface();
        recordStore.closeInterface();
    }

}

class Store{
    private int area;
    private int capacity;

    public Store(int area, int capacity) {
        this.area = area;
        this.capacity = capacity;
    }
    // Overloading constructor
    public Store() {
    }

    public void open(){
        System.out.println("Store Opened");
    }

    public void close(){
        System.out.println("Store closed");
    }

    @Override
    public String toString() {
        return "Store{" +
                "area=" + area +
                ", capacity=" + capacity +
                '}';
    }
}

class Bookstore extends Store {
    public Bookstore(int area, int capacity) {
        super(area, capacity);
    }

    public Bookstore() {
        System.out.println("Default Constructor");
    }

    @Override
    public void open() {
//        super.open();
        System.out.println("Bookstore Opened");
    }

    @Override
    public void close() {
//        super.close();
        System.out.println("Bookstore closed");
    }
}

class RecordStore implements StoreInterface {
    @Override
    public void openInterface() {
        System.out.println("Record store Opened");
    }

    @Override
    public void closeInterface() {
        System.out.println("Record store Closed");
    }
}
