/**
 * Created by alexandraqin on 4/14/15.
 */
import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {

  public static void main (String args[]) {
      ArrayList<Cat> myCatList = new ArrayList<Cat>();
      myCatList.add(new Cat("Cat1"));
      myCatList.add(new Cat("Cat2"));
      myCatList.add(new Cat("Cat2"));
      myCatList.add(new Cat("Cat2"));
      myCatList.add(new Cat("Cat2"));

      for(Cat cat : myCatList) {
          System.out.println(cat);
      }
      ArrayList<Integer> myArrayList = new ArrayList<Integer>();
      myArrayList.add(1);
      myArrayList.add(2);
      myArrayList.add(2);
      myArrayList.add(3);
      myArrayList.add(3);
      myArrayList.add(3);
      myArrayList.add(4);
      myArrayList.add(4);
      myArrayList.add(4);
      myArrayList.add(4);
      mostFrequentElement(myArrayList);

      ArrayList<String> myStringList = new ArrayList<String>();
      myStringList.add("a");
      myStringList.add("b");
      myStringList.add("b");
      myStringList.add("c");
      myStringList.add("c");
      myStringList.add("c");
      myStringList.add("d");
      myStringList.add("d");
      myStringList.add("d");
      myStringList.add("d");
      mostFrequentString(myStringList);

      System.out.println(canRentCar(podHashMap()));
  }

    public static void mostFrequentElement(ArrayList<Integer> thing) {
        //if tie => print any greatest value key
        HashMap<Integer, Integer> numOccurrences = new HashMap<Integer, Integer>();

        for (Integer num : thing) {
            if (numOccurrences.containsKey(num)) {
                numOccurrences.put(num, numOccurrences.get(num) + 1);
            } else {
                numOccurrences.put(num, 1);
            }
        }

        Integer mostFrequentKey = 1;
        Integer mostFrequentValue = 0;

        for (Integer key : numOccurrences.keySet()) {
            if (numOccurrences.get(key) > mostFrequentValue) {
                mostFrequentKey = key;
                mostFrequentValue = numOccurrences.get(key);
            }
        }

        System.out.println(mostFrequentKey + " shows " + numOccurrences.get(mostFrequentKey) + " times");
    }

    public static void mostFrequentString(ArrayList<String> thing) {
        //if tie => print any greatest value key
        HashMap<String, Integer> stringOccurrences = new HashMap<String, Integer>();

        for (String elem : thing) {
            if (stringOccurrences.containsKey(elem)) {
                stringOccurrences.put(elem, stringOccurrences.get(elem) + 1);
            } else {
                stringOccurrences.put(elem, 1);
            }
        }

        String mostFrequentKey = "a";
        int mostFrequentValue = 0;

        for (String key : stringOccurrences.keySet()) {
            if (stringOccurrences.get(key) > mostFrequentValue) {
                mostFrequentValue = stringOccurrences.get(key);
                mostFrequentKey = key;
            }
        }

        System.out.println(mostFrequentKey + " shows " + stringOccurrences.get(mostFrequentKey) + " times!");
    }

    public static HashMap podHashMap() {
        HashMap<String, Integer> gingerbread = new HashMap<String, Integer>();
        gingerbread.put("Pooja", 24);
        gingerbread.put("Janneisy", 26);
        gingerbread.put("Madelyn", 24);
        gingerbread.put("Rosmary", 22);
        gingerbread.put("Dison", 28);
        gingerbread.put("Abass", 25);

        for (String student : gingerbread.keySet()) {
            System.out.println(student + " is " + gingerbread.get(student) + " years old");
        }

        return gingerbread;
    }

    public static boolean canRentCar(HashMap<String, Integer> pod) {
        for (String student : pod.keySet()) {
            if (pod.get(student) >= 25) {
                return true;
            }
        } return false;
    }
}
