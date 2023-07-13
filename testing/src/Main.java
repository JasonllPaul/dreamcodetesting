import category.Electronics;
import category.Furniture;
import category.HomeAppliances;
import category.sub.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner textIn = new Scanner(System.in);
        String category;

        System.out.println("Which category do you want to know the keywords?");
        category = textIn.nextLine().toLowerCase();

        switch (category) {
            case "home appliances":
                HomeAppliances ha = new HomeAppliances();
                ha.getKeywords();
                System.out.println("level: "+ha.getLevel());
                break;
            case "lawn & garden":
                LawnGarden lg = new LawnGarden();
                lg.getKeywords();
                System.out.println("level: "+lg.getLevel());
                break;
            case "minor appliances":
                MinorAppliances mia = new MinorAppliances();
                mia.getKeywords();
                System.out.println("level: "+mia.getLevel());
                break;
            case "major appliances":
                MajorAppliances ma = new MajorAppliances();
                ma.getKeywords();
                System.out.println("level: "+ma.getLevel());
                break;
            case "kitchen appliances":
                KitchenAppliances ka = new KitchenAppliances();
                ka.getKeywords();
                System.out.println("level: "+ka.getLevel());
                break;
            case "general appliances":
                GeneralAppliances ga = new GeneralAppliances();
                ga.getKeywords();
                System.out.println("level: "+ga.getLevel());
                break;
            case "furniture":
                Furniture f = new Furniture();
                f.getKeywords();
                System.out.println("level: "+f.getLevel());
                break;
            case "electronics":
                Electronics e = new Electronics();
                e.getKeywords();
                System.out.println("level: "+e.getLevel());
                break;
            default:
                break;
        }


    }
}