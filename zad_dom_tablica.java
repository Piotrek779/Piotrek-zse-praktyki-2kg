package tabs;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class tablica_dzis {

    public static void main(String[] args) {
        //zad1
      char[] charArray={'b','c','a','d','g','e','f','i','j','m','k','n','h','l'};
      Arrays.sort(charArray);
        System.out.println("litery rosnaco: "+Arrays.toString(charArray));
        //zad2
        String[] stringArray={"Wyrewolwerowany","rewolwerowiec","wyrewolwerowal","wyrewolwerowanego","rewolwerowca","stol","z","powylamywanymi","nogami","."};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("sortowanie malejaco: "+Arrays.toString(stringArray));
        //zad3
        Integer[] intArray1={1,2,3};
        Random rand=new Random();
        int randInt1=rand.nextInt(2)+1;
        String[] stringArray21={"Chester","Max","Reksio"};
        System.out.println("imie twojego psa to: ");
        System.out.println(stringArray21[randInt1]);
        //zad4
        Integer[] intArray4={1,2,3};
        Integer[] intArray5={1,2,3};
        Integer[] intArray6={1,2,3};
        Random rand_1=new Random();
        int rand_int_2=rand_1.nextInt(2)+1;
        int rand_int_3=rand_1.nextInt(2)+1;
        int rand_int_4=rand_1.nextInt(2)+1;
        String[] stringArray_12={"omlet","musli","jajka i kielbache"};
        System.out.println("moje sniadanie to: ");
        System.out.println(stringArray_12[rand_int_2]);
        String[] stringArray_13={"hamburgery","stejki","kanapeczki"};
        System.out.println("moj obiad to: ");
        System.out.println(stringArray_13[rand_int_3]);
        String[] stringArray_14={"zapiekanke","plateczki","czekolade i inne przekaski"};
        System.out.println("moja kolacja to: ");
        System.out.println(stringArray_14[rand_int_4]);
        //zad5
        Integer[] intArray_lol={1,18,12,15,32,5,4,8,9,65,31,90,11,33,55,66,77,88,67,54};
        Arrays.sort(intArray_lol,0,10, Collections.reverseOrder());
        Arrays.sort(intArray_lol,9,20);
        System.out.println("TabArray: "+Arrays.toString(intArray_lol));
    }
}
