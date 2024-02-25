import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Animal{
    String getBreed();
}
/**
 * Innerdemo
 */
interface Bird {
    public static final String name = "bird";
    String getOrigin();
}
class Dog implements Animal, Bird{
    String name = "subclass";
    String breed;
    static String color;
    Dog(String name, String breed){
        this.breed = breed;
    }
    public String getBreed(){
        
        return this.breed;
    }
    public String getOrigin(){
       
        return "parrot";
    }
    public static String color(){
        color = "Black";
        return color;
    }
}
public class demo {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // Dog dog = new Dog("Leo", "shepherd");
        // System.out.println(dog.getBreed());
        // System.out.println(  Dog.color());
        // System.out.println(dog.getOrigin());
        ArrayList<String> listofnames = new ArrayList<>(Arrays.asList("a","b"));
        Stream<String> streamed = listofnames.stream();
        // ArrayList<String> filtered = streamed.filter(e->e.startsWith("a")).collect(Collectors.toCollection(ArrayList::new));
        List<String> filteredList = streamed.filter(e->e.startsWith("a")).collect(Collectors.toList());
        // filtered.add("b");
        filteredList.add("b");
        System.out.println(filteredList);
    }
}