import java.util.*;

public class AppConvertNumToZeroAndOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> integerList = new ArrayList<>();
        int count = 1;
        int maximum = 0;
        System.out.println("plz enter your num");
        Integer num = input.nextInt();
        Integer length = num.toString().length();
        System.out.println(length);
        while (num > 0) {
            int over = num % 10;
            integerList.add(over);
            if (over > maximum)
                maximum = over;
            map.put(count, over);
            num /= 10;
            count++;
        }
        while (maximum > 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = length; i > 0; i--) {
                Integer integer = map.get(i);
                if (integer <= 0)
                    temp.add(0);
                else
                    temp.add(1);
                map.replace(i, integer - 1);

            }
            System.out.println(temp);
            maximum--;
        }
    }
}
