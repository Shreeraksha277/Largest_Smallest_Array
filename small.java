public static int findSmallest(int[] arr) {
      int min = arr[0] ;   // assume first element is smallest
 
          for (int i = 1; i < arr.length; i++) {
          if (arr[i] < min) {
              min = arr[i];
         }
    }
     return min;
}
