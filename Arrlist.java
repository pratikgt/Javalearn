import java.util.ArrayList;
import java.util.Comparator;

class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.remove(2);
        numbers.remove(Integer.valueOf(3));
        numbers.set(2, Integer.valueOf(30));
        numbers.sort(Comparator.reverseOrder());

        {
            System.out.println(numbers.isEmpty());
            numbers.forEach(number -> {
                System.out.println(number * 2);
            });
        }

        System.out.println(numbers);

    }
}