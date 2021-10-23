package hu.petrik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {

    public static List<Szuperhos> lista = new ArrayList<>();

    public static void szereplok(String fajl){
        try{
            FileReader fr = new FileReader(fajl);
            BufferedReader br = new BufferedReader(fr);

            String sor = br.readLine();
            while (sor != null){
                String[] adatok = sor.split(" ");
                Szuperhos szuperhos = new Szuperhos() {
                    @Override
                    public boolean legyoziE(Szuperhos szuperhos) {
                        return false;
                    }

                    @Override
                    public double mekkoraAzEreje() {
                        return 0;
                    }
                };
                int hanyszor = Integer.parseInt(adatok[1]);
                switch (adatok[0]){
                    case "Vasember":
                        szuperhos = new Vasember();
                        for (int i = 0; i < hanyszor; i++){
                            ((Vasember) szuperhos).kutyutKeszit();
                        }
                        break;

                    case "Batman":
                        szuperhos = new Batman();
                        for (int i = 0; i < hanyszor; i++){
                            ((Batman) szuperhos).kutyutKeszit();
                        }
                        break;
                }
                lista.add(szuperhos);
                sor = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void szuperhosok(){
        for (Szuperhos szuperhos : lista){
            System.out.println(szuperhos);
        }
    }

    public static void main(){
        szereplok("szereplok.txt");
        szuperhosok();
    }

}
