import java.io.*;
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
        fajlbaolvasas();
        dij();
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
        try {
            BufferedReader br = new BufferedReader(new FileReader("nobel.csv"));
            br.readLine();
            String sor = br.readLine();
            while (sor!=null){
                lista.add(new Nobel(sor));
                sor = br.readLine();

            }
            for (Nobel item : lista){
                System.out.println(item);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void dij(){
        for (Nobel item : lista){
            if (item.getTeljesNev().equals("Arthur B. McDonald")){
                System.out.println("3. feladat: " + item.getTipus());
            }
        }
    }




}
