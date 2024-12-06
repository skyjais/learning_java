public class Hollow_Triangle {
    public static void main(String[] args) {
        // write your code here

for(int i=1;i<=5;i++){


// if(i==1 || i==5){
//     for(int j=1;j<=6;j++){
//         System.out.print("* ");
//     }

   
// }else{
//      for(int j=1;j<=6;j++){
//         if(j==1 || j==6){
//           System.out.print("* ");
//         }else{
//              System.out.print("  ");
//         }
        
//     }

//     // System.out.println();

// }

for(int j=1;j<=6;j++){

if(i==1 || j==1 || i==5 || j==6){
    System.out.print("* ");
}else{
     System.out.print("  ");
}

}

   System.out.println();

}

        
    }
}