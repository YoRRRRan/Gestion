package mediatheque;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public  class Menu {
    public ArrayList<Support> supports;

    public Menu() {
        // supports = new ArrayList<Support>();
        try {
            this.load();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Une erreur est survenue");
        }

    }

    public void start() {
        String question = "Que voulez faire ?\n1- Afficher les supports\n2- Créer un support\n3- Sauvegarder";
        Integer userChoice = Scanou.scanInteger(question);
        while (userChoice != 0) {
            switch (userChoice) {
                case 1:
                    listing();
                    break;
                case 2:
                    create();
                    break;
                default:
                    try {
                        save();
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Une erreur est survenue");
                    }
                    break;
            }
            userChoice = Scanou.scanInteger(question);
        }
    }

    public void listing() {
        for (Support support : supports) {
            System.out.println(support);
        }
    }

    public void create() {
        String question = "Que voulez créer ?\n1- Livre\n2- DVD\n3- CD\n0- STOP";
        Integer userChoice = Scanou.scanInteger(question);
        while (userChoice != 0) {
            switch (userChoice) {
                case 1:
                    supports.add(new Livre());
                    break;
                case 2:
                    supports.add(new Dvd());
                    break;
                case 3:
                    supports.add(new CD());
                    break;
                default:
                    supports.add(new Multimedia());
                    break;
            }
            userChoice = Scanou.scanInteger(question);
        }
    }
    @SuppressWarnings("unchecked")
    public void load() throws IOException {
        FileInputStream fis = new FileInputStream("bdd.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        supports = (ArrayList<Support>) decoder.readObject();
        decoder.close();
        fis.close();

    }

    public void save() throws IOException {
        FileOutputStream fos = new FileOutputStream("bdd.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(supports);
        encoder.close();
        fos.close();
        System.out.println("It's Ok");
    }
}