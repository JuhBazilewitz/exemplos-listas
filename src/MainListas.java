import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Vector;

public class MainListas {

    public static void main(String[] args) {

//        LinkedList<String> nomes = new LinkedList<>();
//        Vector<String> nomes = new Vector<>();
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabriela");
        nomes.add("Juliane");
        nomes.add("Francieli");
        
        Collections.sort(nomes, new Comparator<String>() {
 
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        
        System.out.println("Total de itens: " + nomes.size());
        System.out.println("Nome na posiçao 1: " + nomes.get(1));
        
        for (String string : nomes) {
            System.out.println("Nome: " + string);
        }
        
    }

}
