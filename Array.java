
//program to find the index of elements in an array that are less than 35
// import java.util.Scanner;
// public class Array {
//   public static void main(String[] args) {
   
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the size of the array: ");
//     int n = sc.nextInt();
//     int[] arr ;
//     arr = new int[n];
   
    
//     System.out.print("Enter the elements of the array: " );

//     for(int i=0; i<n; i++) {
//       arr[i] = sc.nextInt();
//     }

//     for(int i=0;i<n;i++){
//       if(arr[i] < 35){
//         System.out.print(i + " ");
//       }
//     }

//   }
  
// }


// Program to calculate the sum of elements in an array
// import java.util.Scanner;
// public class Array{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter the size of the array: ");
//     int n = sc.nextInt();
//     int[] arr = new int[n];

//     System.out.print("Enter the elements of the array: ");
//     // Input elements into the array
//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//     }

//     int sum = 0;

//     for (int i=0; i<n;i++){
//       sum += arr[i];
//     }


//     System.out.println("Sum of the elements in the array: " + sum);
    

//   }

// }


//built in methods in java
// import java.util.Arrays;
// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {45,87,23,56,12};

        //for each loop
        //for each element in array
          //no need to specify size of array
          //mostly used to print elements in different data structures
//         for (int ele : arr) {  
//             System.out.print(ele + " ");
//         }

//         // Print the array
//         System.out.println("Array: " + Arrays.toString(arr));

//         // Sort the array
//         Arrays.sort(arr);
//         System.out.println("Sorted Array: " + Arrays.toString(arr));

//         // Fill the array with a specific value
//         Arrays.fill(arr, 10);
//         System.out.println("Filled Array: " + Arrays.toString(arr));

//         // Check if two arrays are equal
//         int[] arr2 = {10, 10, 10, 10, 10};
//         boolean isEqual = Arrays.equals(arr, arr2);
//         System.out.println("Are arrays equal? " + isEqual);
       
//     }
// }



//shallow copy and deep copy of an array
//this deep copy works only for primitive data types(int,char,double) and not for strings and objects
// import java.util.Arrays;
// public class Array {  
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         // Shallow copy using assignment
//         int[] shallowCopy = arr;
//         System.out.println("Shallow Copy: " + Arrays.toString(shallowCopy));

//         // Deep copy using clone
//         int[] deepCopy = arr.clone();
//         System.out.println("Deep Copy: " + Arrays.toString(deepCopy));

//         // Modify the original array
//         arr[0] = 10;

//         // Print all arrays to see the effect of modification
//         System.out.println("Original Array after modification: " + Arrays.toString(arr));
//         System.out.println("Shallow Copy after original modification: " + Arrays.toString(shallowCopy));
//         System.out.println("Deep Copy remains unchanged: " + Arrays.toString(deepCopy));
//     }
// }


//program to find the index of words in an array that contain a specific character
// import java.util.*;
// class Solution {
//     public List<Integer> findWordsContaining(String[] words, char x) {

    
//         List<Integer> result = new ArrayList<>();

//         for (int i = 0; i < words.length; i++) {
//             String word = words[i];
//             if (word.indexOf(x) != -1) {  // Checks if character x is in the word
//                 result.add(i);            // Add index to result list
//             }
//         }

//         return result;
//     }
// }

        


//Basic operations on ArrayList


import java.util.ArrayList;

public class Array{
  public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<>(6);// Initializing ArrayList with initial capacity of 6
    arr.add(0,10);
    arr.add(1,20);
    arr.add(2,30);  
    arr.add(3,40);
    arr.add(4,50);
    arr.add(5,60);

    //Arraylist does not have default value like arrays(i.e. 0)
    //it can grow dynamically
    //so if we do not add any element at a specific index in between, it will throw an error
    System.out.println("ArrayList: " + arr);
   for (int i=0 ;i<arr.size();i++){
    System.out.print(arr.get(i) + " "); 
   }

   arr.set(2,300); // Modifying the value at index 2 to 300
    System.out.println("\nUpdated ArrayList after setting index 2 to 300: " + arr);


    arr.add(70); //push back operation
    //adding an element at the end of the ArrayList
    System.out.println("ArrayList after adding 70: " + arr);
    System.out.println("Size of ArrayList: " + arr.size());

    arr.remove(3); // Removing the element at index 3
    System.out.println("ArrayList after removing element at index 3: " + arr);
    System.out.println("Size of ArrayList after removal: " + arr.size());
  }
}























