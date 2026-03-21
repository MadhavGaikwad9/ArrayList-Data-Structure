//operation on ArrayList

import java.util.ArrayList;

public class OperationsinArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //Get Operation -0(1)
        int element = list.get(2);
        System.out.println(element);  
        
        //Delete operation
        list.remove(2);
        System.out.println(list);

        //Set operation
        list.set(2, 10);
        System.out.println(list);


        //Contains operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));



        }
}