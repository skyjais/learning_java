import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        // write your code here

// for( int i=4;i>=1;i--){

//   for(int j=1;j<=i;j++){

//     System.out.print("*");
    
//   }

//    System.out.println(); 

// }
int col = 0;
for( int i=65;i<=80;i=i+col){
 col++;

  for(int j=i;j<(i+col);j++){

    System.out.print((char)j+" ");
    
  }

   System.out.println(); 
  

}

        
    }
}