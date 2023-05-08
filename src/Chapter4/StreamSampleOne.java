package Chapter4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamSampleOne {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        List<Integer> getNumbers = List.of(3, 5, 54, 4);
        System.out.println(mapMethod(getNumbers));

        List<String> persons = List.of("Samuel", "Tolulope", "Tayo");
        System.out.println(persons.stream().collect(Collectors.toMap(names -> names, String::length)));

        List<String> firstName = List.of("Gospel", "BossKb", "Jame", "Thelaw", "Blessing");
        List<Integer> age = List.of(2, 3, 4, 43, 4);
        firstName.stream().collect(Collectors.toMap(v -> v, String::length));
        age.stream().collect(Collectors.toMap(b -> b, Integer::bitCount));

        Map<String, Integer> getTheNumber = new HashMap<>();
        getTheNumber.put("gospel", 23);
        getTheNumber.put("Blessing", 40);
        getTheNumber.put("BossKb", 50);
        getTheNumber.put("SamTheLaw", 19);
        getTheNumber.put("Spencer", 39);
        System.out.println(getTheNumber.entrySet().stream().collect(Collectors.toMap(x -> x)));


        System.out.println(nums
                .stream()
                .map(x -> x + 5)
                .toList());
    }
    public static List<Integer> mapMethod(List<Integer> number){
        return number
                .stream()
                .map(num -> num * 2)
                .toList();

    }
    List<String> names = List.of(
            "Felix",
            "Prof",
            "Joshua"
    );
    private static List<Integer> mapFirst(List<String> name, List<Integer> age){
        return age;
    }



}
