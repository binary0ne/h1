import java.util.Arrays;
import java.util.function.Predicate;

public class Sheep {

   enum Animal {sheep, goat};
   
   public static void main (String[] param) {

   }
   
   public static void reorder (Animal[] animals) {
      int n_goats = 0;
      int n_sheeps = 0;
      for (int x=0; x < animals.length; x++) {
         if (animals[x] == Animal.goat) {
            n_goats++;
         } else {
            n_sheeps++;
         }
      }
      int y = 0;
      while (y < n_goats) {
         animals[y] = Animal.goat;
         y++;
      }
      while (y < (n_sheeps + n_goats)) {
         animals[y] = Animal.sheep;
         y++;
      }
   }
}

