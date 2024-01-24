package Array;

import java.util.ArrayList;
import java.util.List;

public class RepeatNumberProblem {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(3);

        System.out.println(repeatedNumber(list));
    }

    static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>(A);

        int index = 0;
        while (index < list.size()) {
            int currentPosition = list.get(index);

            if (currentPosition != index + 1) {
                int temp = list.get(index);
                list.set(index, list.get(currentPosition - 1));
                list.set(currentPosition - 1, temp);
            } else {
                index++;
            }
        }

        ArrayList<Integer> newList = new ArrayList<>();

        index = 0;
        while (index < list.size()) {
            int currentPosition = index + 1;

            if (currentPosition != list.get(index)) {
                newList.add(list.get(index));
                newList.add(currentPosition);
            } else {
                index++;
            }
        }

        return newList;
    }
}
