public class Sheep {

   enum Animal {sheep, goat};
   
   public static void main (String[] param) {

   }
   
   public static void reorder (Animal[] animals) {
      // Initializing the counter for goats
      int n_goats = 0;
      for (int x=0; x < animals.length; x++) {
         // We need to do something only when we detect goat
         if (animals[x] == Animal.goat) {
            // Assignment of default state -> sheep, that is not needed to be rearranged
            animals[x] = Animal.sheep;
            // Counter n_goats is the second iterator
            // Allowing to do swaps at the same time we count goats
            animals[n_goats] = Animal.goat;
            n_goats++;
         }
      }
   }
}

