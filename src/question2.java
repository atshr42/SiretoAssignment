//Importing the libraries for Arraylist,Collections and List that we would use in the following program.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question2 {
    private List<Integer> list = new ArrayList<Integer>(); //Defining an ArrayList with the variable name list.
    private Integer x; //The variable for which we have to find the rank of.
    private Integer s; //The variable for which we define the Start as defined in the question no.2  .
    private Integer e; //THe variable for which we define the End as defined in the question no.2.

    public static void main(String[] args) {
        question2 obj = new question2();//Creating an object of the class.

        //Demo Data to test the proper functionality of the required function.
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(5);
        list2.add(1);
        list2.add(4);
        obj.list.addAll(list2);
        obj.x = 3;
        obj.s = 2;
        obj.e = 5;
        //

        //Calling the function which would add item to the list then find the rank of it.
        obj.getRank(obj.list, obj.x, obj.s, obj.e);
    }

    void getRank(List c, Integer x, Integer s, Integer e) {
        String errorText; //we defined this variable for defining the Error in user understandable form.

        if (x >= s && x <= e && s <= e) {   //'x' must be in the inclusive interval of 's' and 'e'
                                            // and 's' must be less than or equals to 'e'.

            if (!c.contains(x)) //Here we happen to sort the elements of list in descending order
                                // so here we did not add the element if it already exists in List and add when not in the List.
                c.add(x);
            Collections.sort(c, Collections.reverseOrder()); // Collection.sort() sorts the List is sorted in Ascending order
            // and then reversed by Collections.reverse() to get the  list in Descending order.

            System.out.println(c.indexOf(x) + 1);   // indexof(x) gives the index of element in that List and
                                                    // since it starts from 0 so adding 1 for the rank.

        } else { //x' is not in the inclusive interval of 's' and 'e' and 's' is not less than or equals to 'e'.
            errorText = s > e ? "Start Cannot be greater than End" :
                    x < s ? "\'x\' cannot be less than start" :
                            x > e ? "\'x\' cannot be greater than end" :
                                    null; // Assigning appropriate Error messages for the User in understandable form.

            System.out.println(errorText);// Printing the Error Text int the console for the User.
        }
    }

}

