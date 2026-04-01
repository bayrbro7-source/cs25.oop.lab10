import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> source = new ArrayList<>();
        source.add(new Animal("arslan"));
        source.add(new Animal("togoru"));

        List<Animal> destination = new ArrayList<>();

        Zoo<Animal> zoo = new Zoo<>();
        zoo.transferAnimals(source, destination);

        destination.forEach(System.out::println);
    }
}
