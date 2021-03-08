package zad_5;

public class dziedziczenie_5 {
    public static class telefon{
        public void uruchomSystem(){
            System.out.println("telefon uruchamia sie");
        }
    }
    public static class Samsung extends telefon {
        public void uruchomSystem2(){
            System.out.println("prosze odblokowac urzadzenie");
        }
    }
    public static class Xiaomi extends Samsung{
        public void uruchomSystem3(){
            System.out.println("podano nieprawidlowe haslo sprobuj ponownie");
        }
    }

    public static void main(String[] args) {
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.uruchomSystem();
        xiaomi.uruchomSystem2();
        xiaomi.uruchomSystem3();
    }
}
