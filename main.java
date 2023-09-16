abstract class boxes{
    double length;
    double height;
    double width;
    double weight;
    abstract void add(boxes x);
    abstract void remove(boxes x);
}

abstract class container {
    double length;
    double height;
    double width;
    double weight;
    abstract void add(boxes x);
    abstract void remove(boxes x);
}

class boxTruck extends container{
    double length = 24;
    double height = 8;
    double width = 8;
    double weight = 26000;
    void add(boxes x){
        System.out.println("Cannot add to box truck");
    }
    void remove(boxes x){
        System.out.println("Cannot remove from box truck");
    }
}

class shippingContainer extends container{
    double length = 40;
    double height = 8.5;
    double width = 8;
    double weight = 59200;
    void add(boxes x){
        System.out.println("Cannot add to shipping container");
    }
    void remove(boxes x){
        System.out.println("Cannot remove from shipping container");
    }
}

class storageUnit extends container{
    double length = 20;
    double height = 8;
    double width = 10;
    double weight = 0;
    void add(boxes x){
        System.out.println("Cannot add to storage unit");
    }
    void remove(boxes x){
        System.out.println("Cannot remove from storage unit");
    }
}

class pallet extends container{
    double length = 4;
    double height = 5;
    double width = 3.33;
    double weight = 4600;
    void add(boxes x){
        System.out.println("Cannot add to pallet");
    }
    void remove(boxes x){
        System.out.println("Cannot remove from pallet");
    }
}



public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
}

