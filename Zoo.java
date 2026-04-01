import java.util.List;

class Animal {
    String name;
    Animal(String name) { this.name = name; }
    @Override
    public String toString() { return name; }
}

public class Zoo<T extends Animal> {
    public void transferAnimals(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
        source.clear();
    }
}
