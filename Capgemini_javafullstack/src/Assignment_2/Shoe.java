package Assignment_2;

import java.lang.Comparable;

public class Shoe implements Comparable<Shoe> {

    double price;
    String colour;
    int size;
    String brand;
    String type; 

    public Shoe(double price, String colour, int size, String brand, String type) {
        this.price = price;
        this.colour = colour;
        this.size = size;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public int compareTo(Shoe o) {
        return Double.compare(o.price, this.price);
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "price=" + price +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

     

