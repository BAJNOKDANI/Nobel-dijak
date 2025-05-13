import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Feladatok {
    String[] nobelDijasok = {
            "2017;fizikai;Rainer;Weiss",
            "2017;fizikai;Barry C.;Barish",
            "2017;fizikai;Kip S.;Thorne",
            "2017;kémiai;Jacques;Dubochet",
            "2017;kémiai;Joachim;Frank",
            "2017;kémiai;Richard;Henderson",
            "2017;orvosi;Jeffrey C.;Hall",
            "2017;orvosi;Michael;Rosbash",
            "2017;orvosi;Michael W.;Young",
            "2017;irodalmi;Kazuo;Ishiguro",
            "2017;béke;International Campaign to Abolish Nuclear Weapons (ICAN);",
            "2017;közgazdaságtani;Richard H.;Thaler",
            "1901;béke;Jean Henry;Dunant",
            "1901;béke;Frédéric;Passy"
    };

    ArrayList<Nobel> lista=new ArrayList<>();

 //KONSTRUKTORBAN HIVUNK MINDENT
    public Feladatok() {
        fajlbairas(nobelDijasok);
    }

    public  void fajlbairas(String[] nobelDijasok) {
        try {
            FileWriter fw = new FileWriter("nobel.txt");
            for (String item : nobelDijasok) {
                fw.write(item);
                fw.write("\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  void fajlbaolvasas() {

    }


}
