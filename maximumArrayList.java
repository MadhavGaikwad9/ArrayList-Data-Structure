
    import java.util.ArrayList;

public class maximumArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(36);
        list.add(49);
        list.add(51);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("max element is = "+ max);

    }
}


