package Arrayss;
import java.util.*;

public class One {
    
    public static void update (int marks[]){

        for(int i =0;i<marks.length;i++){
            marks[i] = marks[i] +1;
        }
    }

    public static void main(String[] args) {
        int marks [] = {13,14,15};
     //   Scanner sc = new Scanner(System.in);

System.out.println("math "+ marks[0]);
System.out.println("phy "+ marks[1]);
System.out.println("chem "+ marks[2]);

update(marks);

System.out.println("math "+ marks[0]);
System.out.println("phy "+ marks[1]);
System.out.println("chem "+ marks[2]);

    }

}
