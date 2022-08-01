package mediatheque;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.CharBuffer;
import java.util.ArrayList;


public abstract class Main {

    public static void main(String[] args) throws IOException  {
        // TODO Auto-generated method stub

 
    	
        String question = "Que voulez vous créer ?\n1- Livre\n2- DVD\n3- CD\n0- STOP";
        Integer sc = Scanou.scanInteger(question);
        
        
        FileReader reader = new FileReader("bdd.txt");
        CharBuffer texte = null;
		reader.read(texte);
        
        
        ArrayList<Support> s = new ArrayList<Support>();
        
        
        while (sc != 0) {
        	
            
            switch (sc) {
            case 1:
                s.add(new Livre());
                break;
            case 2:
                s.add(new Dvd());
                break;
            case 3:
                s.add(new CD());
                break;
            default:
                s.add(new Multimedia());
                break;
            }
            
            //System.out.println(s);
            
            PrintWriter writer = new PrintWriter("bdd.txt", "UTF-8");
            writer.println(s);
            writer.close();
            
            System.out.println(s);
            sc = Scanou.scanInteger(question);
            
        }

    }
}
