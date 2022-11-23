import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] classes = {"Mage", "Warlock", "Druid", "Priest", "Warrior"};

        System.out.println("\nUsing toList():");
        List<String> classesList = Main.getList(classes);
        classesList.forEach(System.out::println);

        System.out.println("\nUsing toMap():");
        Map<String, Integer> classesMap = Main.getMap(classesList);
        classesMap.forEach((key, value) -> {
            System.out.println(key + " has " + value + " letters");
        });

        System.out.println("\nUsing toSet():");
        Set<String> classesSet = Main.getSet(classes);
        classesSet.forEach(System.out::println);

        System.out.println("\nUsing counting():");
        System.out.println("The group has " + Main.getLength(classes) + " classes.");

        System.out.println("\nUsing joining():");
        System.out.println("All classes names joined:  " + Main.getJoinedString(classes));
    }

    //Métodos auxiliares
    public static List<String> getList(String[] classes) {
        return Stream.of(classes).collect(Collectors.toList());
    }

    public static Map<String, Integer> getMap(List<String> classesList) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        classesList.stream().forEach(
                (friend) -> map.put(friend, friend.length())
        );
        return map;
    }

    public static Set<String> getSet(String[] classes) {
        return Stream.of(classes).collect(Collectors.toSet());
    }

    public static Long getLength(String[] classes) {
        return Stream.of(classes).collect(Collectors.counting());
    }

    public static String getJoinedString(String[] classes) {
        return Stream.of(classes).collect(Collectors.joining());
    }

}
