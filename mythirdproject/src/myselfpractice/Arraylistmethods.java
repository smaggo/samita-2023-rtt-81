package myselfpractice;

import java.util.ArrayList;
import java.util.List;

public class Arraylistmethods {

    public static void main(String[] args) {
//        // Creating an ArrayList of String
//        List<String> animals = new ArrayList<>();
//
//        // Adding new elements to the ArrayList
//        animals.add("Lion");
//        animals.add("Tiger");
//        animals.add("Cat");
//        animals.add("Dog");
//
//        System.out.println(animals);
//
//  // Adding an element at a particular index in an ArrayList
//        animals.add(2, "Elephant");
//        System.out.println(animals);
    	
////        Creating an ArrayList From Another Collection
    	
    	List<Integer>firstfiveprimenumber=new ArrayList<>();
    	firstfiveprimenumber.add(2);
    	firstfiveprimenumber.add(3);
    	firstfiveprimenumber.add(5);
    	firstfiveprimenumber.add(7);
    	firstfiveprimenumber.add(11);
    	System.out.println(firstfiveprimenumber);
    	List<Integer>firsttenprimenumber=new ArrayList<>(firstfiveprimenumber);
    	List<Integer>nextfiveprimenumber=new ArrayList<>();
    	nextfiveprimenumber.add(13);
    	nextfiveprimenumber.add(17);
    	nextfiveprimenumber.add(19);
    	nextfiveprimenumber.add(23);
    	nextfiveprimenumber.add(29);
    	firsttenprimenumber.addAll(nextfiveprimenumber);
    	System.out.println(firsttenprimenumber);
    	
        

           }
        



       
        }



   


