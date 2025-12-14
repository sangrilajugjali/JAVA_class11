package day_11;
public class Guess{
    double number;
    public Guess(double number){
        this.number = number;
    }
    public static void main(String[]args){
        int n;
        Guess g = new Guess(45);
        System.out.println("Enter the number");
        if (n<100){
            System.out.println("n is less than 100");
        }
        else if(n>100){
            System.out.println("n is greater than 100");
        }
        else(n==100){
            System.out.println("correct number");
        }
    }
    
    }
    
    
