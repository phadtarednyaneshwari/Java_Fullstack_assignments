import java.util.*;

public class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<Integer>();

        list1.add(6);
        list1.add(9);
        list1.add(84);

        System.out.println(list1);

        int a=list1.get(2);
        System.out.println(a);

        list1.add(0,64);
        System.out.println(list1);

        list1.set(1,92);
        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);

        int s=list1.size();
        System.out.println(s);
        
        Collections.sort(list1);
        System.out.println(list1);
    }
}
