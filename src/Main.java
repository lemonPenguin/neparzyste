import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Main {

    public static void main(String[] args){
        Tablice tablicelosowe = new Tablice(100);
        tablicelosowe.znajdźMaxMin();
    }

    public static void saveFile(int[] tab, String plik) {
        String dane = "";
        for(int e : tab) dane += e + "\n";
        Files.write(Paths.get(plik), dane.getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }
}