
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


  























