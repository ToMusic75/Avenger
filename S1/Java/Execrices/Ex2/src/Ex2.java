import jdk.nashorn.api.tree.ArrayLiteralTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.lang.String;
import java.lang.*;

    public class Ex2 {
        public static void reader() {
            HashMap<String, Integer> notesParEtudiant
                    = new HashMap<String, Integer>();
            try {
                BufferedReader read;
                read = new BufferedReader(new FileReader("test.txt"));
                String line;
                //int j = 0;
                int[] notes = new int[10];
                int i = 0;
                while ((line = read.readLine()) != null) {
                    String[] key = line.split(":", 2);
                    int note = Integer.parseInt(key[1]);
                    notesParEtudiant.put(key[0], note);
                    notes[i] = note;
                    System.out.println("Affichage de la value " + i + " : " + notes[i]);
                    i++;
                }

                Collection<Integer> notesTest = notesParEtudiant.values();

                ArrayList<Integer> notesTest2 = new ArrayList<>();
                for (Integer myNote : notesParEtudiant.values()) {
                    notesTest2.add(myNote);
                }
                notesTest2.get(0);
                int total = 0;
                for (int j = 0; j <= i; j++) {
                    total += notes[j];
                }
                int moy = total / i;
                System.out.println("Affichage de la map : " + notesParEtudiant);
                System.out.println("Affichage de la moyenne : " + moy);
                System.out.println("La note de julien est : " + notesParEtudiant.get("julien@gmail.com"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            long start = System.currentTimeMillis();
            reader();
            long duration = System.currentTimeMillis() - start;
            System.out.println("Temps d'exécution en millisecondes: " + duration);
            //Hash();
        }
    }
//    public static void Hash(){
//            HashMap<String, Integer> map
//                    = new HashMap<>();
//
//            print(map);
//            map.put("vishal", 10);
//            map.put("sachin", 30);
//            map.put("vaibhav", 20);
//
//            System.out.println("Size of map is:- "
//                    + map.size());
//
//            print(map);
//            if (map.containsKey("vishal")) {
//                Integer a = map.get("vishal");
//                System.out.println("value for key"
//                        + " \"vishal\" is:- "
//                        + a);
//            }
//
//            map.clear();
//            print(map);
//        }
//        public static void print(Map<String, Integer> map)
//        {
//            if (map.isEmpty()) {
//                System.out.println("map is empty");
//            }
//
//            else {
//                System.out.println(map);
//            }
//        }
// }