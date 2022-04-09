package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeclaringArrayList {
    public static ArrayList<Integer> test(){
        //write code here

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        return list;
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
/*
Write code in the test method that will declare and initialize an ArrayList of Integers, then return it as is - empty.

An ArrayList is a collection of objects, similar to an array. However, a few notable differences in how they work:

The size of an ArrayList can be changed
You can add, insert, and delete elements easily with ArrayLists
You can only have ArrayLists of objects! (int/double/boolean are primitive datatypes)
IMPORTANT: Please note that we will be working with new objects that represent primitive datatypes:

Integer is an object that represent an int
Double is an object that represents a double
Boolean is an object that represents a boolean
(Note the capital letters for the objects!)

However, unlike arrays, ArrayLists need to be imported before they can be used. The line that we use to do this is the following (written outside the class header on line 3):

import java.util.ArrayList;
import java.util.ArrayList;
This allows us to create the ArrayList object.

To declare and initialize an ArrayList, we use the same code as we did to declare objects, except this time, our datatype is ArrayList<type></type>:

create an Arraylist of Strings

    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
  |<------------------->|   |<-------------------->|
     declaration                 initialization
  |<------------------->|   |<-------------------->|
     declaration                 initialization
create an Arraylist of Integers

    ArrayList<Integer> nums = new ArrayList<>();
 */