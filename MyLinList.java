import java.util.*;

class MyLinList{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();

        list.add("Hello");
        list.add("I am Dnyaneshwari");
        System.out.println(list);
        list.addLast("This is Java");
        list.addFirst("Hello Program");

        System.out.println(list.get(1));
        System.out.println(list.size());

        list.remove(0);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
