package object;

public class objektowanie {
    interface PiecPiekacz {
        void pieczenieChleba();
        void pieczenieCiastek();
    }

    interface PiecGrill {
        void grillowanieKurczaka();
    }


    public static class Piec implements PiecPiekacz, PiecGrill {

        private int czas;
        private int temperatura;

        @Override
        public void pieczenieChleba() {
            czas = 120;
            temperatura = 170;
            wlacz();
        }

        @Override
        public void pieczenieCiastek() {
            czas = 30;
            temperatura = 130;
            wlacz();
        }

        @Override
        public void grillowanieKurczaka() {
            czas = 150;
            temperatura = 120;
            wlacz();
        }

        private void wlacz() {
            System.out.println("Wlaczamy Piec " +
                    " ustawiamy temperature na: " + temperatura
                    + " stopni, a czas trwania na: " + czas + "minut");

        }

        public static void main(String[] args) {
            Piec Piec = new Piec();

            PiecPiekacz piecPiekacz = Piec;
            PiecGrill PiecGrill = Piec;

            PiecGrill.grillowanieKurczaka();
            piecPiekacz.pieczenieChleba();
            piecPiekacz.pieczenieCiastek();
        }
    }
}
