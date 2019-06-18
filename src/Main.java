import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int [] tab = loadData("Liczby_losowe.txt");
        ZadaniaAlgorytm zad = new ZadaniaAlgorytm();
        System.out.println("Ilość liczb nieparzystych, niepodzielnych przez 3 i 5: " + zad.nieparzyste(tab));
    }


    public static void saveFile(int[] tab, String plik) {
        String dane = "";
        for(int e : tab) dane += e + "\n";
        try {
            Files.write(Paths.get(plik), dane.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] loadData(String plik) {
        int[] dane = new int[100];
        Scanner sc = null;
        try {
            sc = new Scanner(new File(plik));
            for (int i = 0; i < 100; i++) dane[i] = sc.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dane;
    }

}