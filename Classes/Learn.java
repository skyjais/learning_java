public class Learn {
    public static void main(String[] args) {
        // write your code here

        Dog dog = new Dog(4,2,"black");
         dog.displayDetails();
        
    }

    public static class Dog{

        int legs;
        int eyes;
        String color;

        public Dog (int legs , int eyes , String color) {

        this.legs = legs;
        this.eyes = eyes;
        this.color = color;  

        }


        public void displayDetails() {
        System.out.println("legs: " + legs);
        System.out.println("eyes: " + eyes);
        System.out.println("color: " + color);
    }


    }
}