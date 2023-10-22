import java.util.*;

class NegativeRadius extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
}

public class throw_throws{
    public static double area(int r)throws NegativeRadius{
        if(r<0){
            throw new NegativeRadius();
        }
        double res=Math.PI*r*r;
        return res;    
    }

    public static void main(String args[]){
        try{
            double Area1=area(5);
            System.out.println(Area1);
        }
        catch(Exception e){
            System.out.println("Exception");
        }

    }
}