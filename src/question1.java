//Importing the libraries for Arraylist,Collections and List that we would use in the following program
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question1 {
    private  List<Integer> list = new ArrayList<>(); //Defining an ArrayList with the variable name list
    private Integer x; //The variable for which we have to find the rank of

    public static void main(String[] args) {
        question1 obj = new question1(); //Creating an object of the class

        //Demo Data to test the proper functionality of the required function
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(4);
        list2.add(1);
        obj.list.addAll(list2);
        obj.x = 5;
        //

        //Calling the function which would add item to the list then find the rank of it
        obj.getRank(obj.list, obj.x);
    }

    void getRank(List<Integer> c, Integer x) {
        if (!c.contains(x)) //Here we happen to sort the elements of list in descending order
            c.add(x);       // so here we did not add the element if it already exists in List and add when not in the List.

        Collections.sort(c,Collections.reverseOrder()); // Collection.sort() sorts the List is sorted in Ascending order
                                                        // and then reversed by Collections.reverse() to get the  list in Descending order.

        System.out.println(c.indexOf(x) + 1);// indexof(x) gives the index of element in that List and since it starts from 0 so adding 1 for the rank.
    }

}
