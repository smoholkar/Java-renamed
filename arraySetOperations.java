/**
 *@author sonalimoholkar
 *Array to set conversion
 *Intersection,Union,Difference
 *http://viralpatel.net/blogs/convert-array-to-set-java-arraylist/
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class arraySetOperations{
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Integer arr1[]= new Integer[5];
		Integer arr2[]= new Integer[7];
		
		System.out.println("Enter array elements");
		for(int i=0;i<5;i++){
		arr1[i]=Integer.parseInt(bf.readLine());
		}
		
		System.out.println("Enter array elements");
		for(int i=0;i<7;i++){
		arr2[i]=Integer.parseInt(bf.readLine());
		}
		
		/**
		 * Simplest way of converting arrays to sets.. use "Arrays.asList(arr)"
		 *  Set<T> mySet = new HashSet<T>(Arrays.asList(someArray));
		 *  */
		
		Set< Integer > set1 = new TreeSet< Integer >(Arrays.asList(arr1));
		System.out.println("set1 contains:" + set1);
		Set union = new TreeSet(set1); // copy of set1 in union
		Set diff1 = new TreeSet(set1); // for difference set1
		
		
		Set< Integer > set2 = new TreeSet< Integer >(Arrays.asList(arr2));
		System.out.println("set2 contains:" + set2);
		
		Set<Integer> intersection = new TreeSet<Integer>(set1);
		System.out.println(intersection.retainAll(set2));
		Set diff2 = new TreeSet(set2); // for difference set2
		
		// Retain all will give you the intersection of set1 and set2 in set1
			System.out.println("without for-each");
			set1.retainAll(set2);
			System.out.println(set1);
			
			System.out.println("with for-each");
			for(Integer i : set1){
                   System.out.println(i);
			}
			
		// For union of two sets 
			union.addAll(set2);
			System.out.println("Union is :" + union);
		
		// For difference
			/**
			 * removeAll will give you the dissimilar elements of set1 in diff1
			 */
			diff1.removeAll(set2);
		    System.out.println("Dissimilar elements in Set1:" + diff1);
	
		    diff2.removeAll(set1);
		    System.out.println("Dissimilar elements in Set2:" + diff2);
		    
	}
			}