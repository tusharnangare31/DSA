package A23_ArrayLists;

import java.util.ArrayList;

public class B7_Multi_Dimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            mainList.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mainList.get(i).add((int) Math.floor(Math.random()*100+1));
            }
        }

        // Printing the elements using for & .get( ) method
        System.out.println("Printing List using for & .get method");
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j < mainList.get(i).size(); j++) {
                System.out.print(mainList.get(i).get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainList);

        mainList.clear(); // we can delete all elements form it

        System.out.println("After removing all elements");
        System.out.println(mainList);

        for (int i = 0; i < 3; i++) {
            mainList.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                mainList.get(i).add((i+1)*(j+1));
            }
        }

        for (ArrayList<Integer> list : mainList) {
            System.out.println(list);
        }

        System.out.println(mainList);
    }
}
