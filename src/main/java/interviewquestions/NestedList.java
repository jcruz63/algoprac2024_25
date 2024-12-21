package interviewquestions;

import java.util.List;

public class NestedList {

    //creating helping method to print the hyphens
    private static void hyphenPrinter(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print("-");
        }
    }


    //we need to pass the current level state to each recursive call to keep track of the depth
    private static void nestedListPrinter(List<Object> list, int currentLvl){
        //we need to loop over the main loop
        for (Object element: list){
            //we need to check for our base case where element is an integer
            if(element instanceof Integer){
                //forgot to call my hyphen helper
                hyphenPrinter(currentLvl);
                System.out.println(element);
            } else if (element instanceof List<?>) {
                //we make our recursive call incrementing our level
                //going to need to cast
                nestedListPrinter((List<Object>) element, currentLvl + 1);
            }
        }
    }

    public static void main(String[] args) {
        /*provided list [1, 3, 4, [2,56,3, [2,5,6]], [[23,56,3,6],[3,4],3]
        Challenge print each element with a prepended hyphen for each level of nesting
        sample:
        -1
        -3
        -4
        --2
        --56
        etc..
         */

        //we need to create the list

        //we have to use object because we have mixed types in our list between integers and list
        List<Object> nestedList = List.of(
                1, 3, 4,
                List.of(2,56,3, List.of(2,5,6)),
                List.of(List.of(23,56,3,6), List.of(3,4), 3)
        );

        //we need to create a recursive method a regular for loop wont work here because don't know the depth of the
        //nesting

        //you can't forget to call your method!!!!
        nestedListPrinter(nestedList, 1);

    }
}
