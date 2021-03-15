package statki;

import java.util.*;

public class statki_gra {
    public static int numRows = 10;
    public static int numCols = 10;
    public static int playerShips;
    public static int Player2Ships;
    public static String[][] grid = new String[numRows][numCols];

    public static void main(String[] args){
        System.out.println("****\t Witaj w grze statki **** \n");
         System.out.println("\t    _~  \n" +
                     "    _~ )_)_~ \n" +
                     "    )_))_))_)  \n" +
                     "    _!__!__!_  \n" +
                     "    \\______t/  \n" +
                     "  ~~~~~~~~~~~~~");
        System.out.println("****\t ocean jest pusty **** \n");

        createOceanMap();
        deployPlayerShips();
        deployPlayer2Ships();

        do {
            Battle();
        }while(statki_gra.playerShips != 0 && statki_gra.Player2Ships != 0);

        gameOver();
    }

    public static void createOceanMap(){

        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
                if (j == 0)
                    System.out.print(i + "|" + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }

    public static void deployPlayer2Ships(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nUstaw statki graczu 2:");

        statki_gra.playerShips = 5;
        for (int i = 1; i <= statki_gra.playerShips; ) {
            System.out.print("Wprowadź liczbę na osi X dla " + i + " statku: ");
            int x = input.nextInt();
            System.out.print("Wprowadź liczbę na osi Y dla " + i + " statku: ");
            int y = input.nextInt();

            if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && (grid[x][y] == " "))
            {
                grid[x][y] =   "%";
                i++;
            }
            else if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && grid[x][y] == "@")
                System.out.println("Nie można stawiać 2 statków w tej samej lokalizacji ");
            else if((x < 0 || x >= numRows) || (y < 0 || y >= numCols))
                System.out.println("nie możesz kłaść statków o " + numRows + " X za dużo i o " + numCols + " Y za dużo");
        }
        printOceanMap();
    }

    public static void deployPlayerShips(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nUstaw statki graczu 1:");

        statki_gra.playerShips = 5;
        for (int i = 1; i <= statki_gra.playerShips; ) {
            System.out.print("Wprowadź liczbę na osi X dla " + i + " statku: ");
            int x = input.nextInt();
            System.out.print("Wprowadź liczbę na osi Y dla " + i + " statku: ");
            int y = input.nextInt();

            if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && (grid[x][y] == " "))
            {
                grid[x][y] =   "@";
                i++;
            }
            else if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && grid[x][y] == "@")
                System.out.println("Nie możesz postawić statku w tym samym miejscu");
            else if((x < 0 || x >= numRows) || (y < 0 || y >= numCols))
                System.out.println("nie możesz kłaść statków o " + numRows + " X za dużo i o" + numCols + " Y za dużo");
        }
        printOceanMap();
    }

    public static void Battle(){
        playerTurn();
        player2Turn();

        printOceanMap();

        System.out.println();
        System.out.println("Statki gracza 1: " + statki_gra.playerShips + " | Statki gracza 2: " + statki_gra.Player2Ships);
        System.out.println();
    }

    public static void player2Turn(){
        System.out.println("\nGracz numer 2 strzela");
        int x = -1, y = -1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Wprowadź liczbę dla X: ");
            x = input.nextInt();
            System.out.print("Wprowadź liczbę dla Y: ");
            y = input.nextInt();

            if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols))
            {
                if (grid[x][y] == "x")
                {
                    System.out.println("Brawo! Rozwaliłeś statek przeciwnika");
                    grid[x][y] = "!"; //Hit mark
                    --statki_gra.Player2Ships;
                }
                else if (grid[x][y] == "@") {
                    System.out.println("Co za pajac, swój statek zatopił :(");
                    grid[x][y] = "x";
                    --statki_gra.playerShips;
                    ++statki_gra.Player2Ships;
                }
                else if (grid[x][y] == " ") {
                    System.out.println("nie trafiłeś");
                    grid[x][y] = "-";
                }
            }
            else if ((x < 0 || x >= numRows) || (y < 0 || y >= numCols))
                System.out.println("nie możesz kłaść statków o " + numRows + " X za dużo i o " + numCols + " Y za dużo");
        }while((x < 0 || x >= numRows) || (y < 0 || y >= numCols));
    }

    public static void playerTurn(){
            System.out.println("\nGracz numer 1 strzela ");
        int x = -1, y = -1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Wprowadź liczbę dla X: ");
            x = input.nextInt();
            System.out.print("Wprowadź liczbę dla Y: ");
            y = input.nextInt();

            if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols))
            {
                if (grid[x][y] == "x")
                {
                    System.out.println("Brawo! Rozwaliłeś statek przeciwnika");
                    grid[x][y] = "!";
                    --statki_gra.Player2Ships;
                }
                else if (grid[x][y] == "@") {
                    System.out.println("Co za pajac, swój statek zatopił :(");
                    grid[x][y] = "x";
                    --statki_gra.playerShips;
                    ++statki_gra.Player2Ships;
                }
                else if (grid[x][y] == " ") {
                    System.out.println("nie trafiłeś");
                    grid[x][y] = "-";
                }
            }
            else if ((x < 0 || x >= numRows) || (y < 0 || y >= numCols))
                System.out.println("nie możesz kłaść statków o " + numRows + " X za dużo i o " + numCols + " Y za dużo");
        }while((x < 0 || x >= numRows) || (y < 0 || y >= numCols));
    }

    public static void gameOver(){
        System.out.println("Statki gracza numer 1: " + statki_gra.playerShips + " | statki gracza numer 2: " + statki_gra.Player2Ships);
        if(statki_gra.playerShips > 0 && statki_gra.Player2Ships <= 0)
            System.out.println("Brawo gracz 1 wygrał");
        else
            System.out.println("Brawo gracz 2 wygrał");
        System.out.println();
    }

    public static void printOceanMap(){
        System.out.println();

        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

        for(int x = 0; x < grid.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < grid[x].length; y++){
                System.out.print(grid[x][y]);
            }

            System.out.println("|" + x);
        }

        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }
}
