package whileLoop;

public class WhileLoop {

    public static void main(String[] args) {

        int i = 10;


        while(i<20){
            if(i == 15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("poza pętlą");
    }
}
