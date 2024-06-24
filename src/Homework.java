import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            String string = scanner.nextLine();
//            for (int i = 0; i < string.length(); i++) {
//
//            }
//            String repeated = string.repeat(10);


            Integer count = map.get(string);

            if (count == null) {
                map.put(string, 1);

            } else if (count >= 100) {
                break;

            } else {
                map.put(string, count + 1);
            }
//            map.put(string, count);


//            if (count == null) {
//                map.put(string, count);
//
//            } else if (count >= 100) {
//                break;
//
//            } else {
//                map.put(string, count * 10);
//            }
            System.out.println(map);

//                map.put(string, count );
//                System.out.println(map);

        }
    }
}


