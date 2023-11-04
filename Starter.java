public class Starter {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        for(int i=0;i<5;i++){
            if(i%2==0){
                System.out.println(i+" is even");}
            else{System.out.println(i+" is odd");}}

        int result = x + y;

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);

        System.out.println("This is the main method with bad code practices.");
    }
}
