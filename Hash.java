// HashSet in Java
//size,insert,remove,search all in O(1) time complexity
import java.util.HashSet;

public class Hash {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    //insert : O(1)
  set.add(20);
  set.add(30);  
  set.add(40);
  set.add(-1); 
  System.out.println(set); //TC : O(n)
   //set does not print in any fixed order

  set.remove(20); //removes 20 from the set
  //TC : O(1)
  System.out.println(set); 

  //search(in-built function) true or false : TC = O(1)
  System.out.println(set.contains(20)); //false
  System.out.println(set.contains(100)); //false
  System.out.println(set.size()); //gives the size of the set

  Object[] arr = set.toArray(); //convert set to array
  //this is case sensitive, so use capital O

  for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
  }

  System.out.println(" ");
  
}
}