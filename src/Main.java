import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String args[]){
        Tablice tablicelosowe = new Tablice(100);
        tablicelosowe.znajdźMaxMin();
        saveFile(tablicelosowe.pobierz(), " Liczby losowe.txt");
        System.out.println();
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

}