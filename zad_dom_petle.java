package zadanka;

public class main {

    public static void main(String[] args) {
        //zad1
        for(int k=0;k<=20;k+=2){

            System.out.println("rosnace liczby "+k);
        }
        //zad2
        for(int i=30;i>=0;i-=3){
            System.out.println("malejace liczby"+i);
        }
        //zad3
        for (int h = 1; h <= 10; h++) {
            for (int g = 1; g <= 10; g++) {
                if(h*g%2==1){
                    System.out.println("\t");
                }
                else{
                    System.out.println(h + " * " + g + " = " + h * g);
                }
            }
        }
        //zad4
            for (int j = -40; j <= 40; j++) {
                if (j % 4 == 0) {
                    System.out.println("liczba podzielna przez 4 to: " + j);
                } else{
                    System.out.println("\t");
                }
            }
        //zad5

        //czesc1
        int x=0;
        while(x<=20){
            System.out.println(x);
            x+=2;
        }
        int z=30;
        //czesc2
        do{
            System.out.println(z);
            z-=3;
        } while(z>=0);
    }
}
