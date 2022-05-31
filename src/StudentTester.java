import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.*;


public class StudentTester

{
      static ArrayList<Student> students = new ArrayList<>();
      static int[] nums = {5,8,3,2,4,5346,7,9,6,4,3,2,434,5,6,4,2432};
      public static void main(String[] args) throws FileNotFoundException
      {
            Student a = new Student("Karl", 100009);
            Student b = new Student("Henery", 100004);
            Student c = new Student("Erin", 100007);
            Student d = new Student("Levi", 100006);
        List<Student> list = new ArrayList<>(); list.add(a); list.add(b); list.add(c); list.add(d); Collections.sort(list);
        	System.out.println(list);
        	Scanner names = new Scanner(new File("names.csv"));
        	while(names.hasNext())
        	{
        		students.add(new Student(names.nextLine(), (int) (Math.random() * 10)));
        	}
        		System.out.println(list.indexOf(c)); System.out.println();
        		System.out.println(students); System.out.println();
        		selectionSort(true);
        		insertionSort(true);
        		System.out.println(students);
        		System.out.println();
        		
        		Student s = new Student("Hiyaa", 0); 
        		Student st = students.get(69);
        		System.out.println(students.indexOf(st)); 
        		} 
        		private static void swap(int i, int j) 
        		{ 
        		Student store = students.get(i); 
        		students.set(i, students.get(j)); 
        		students.set(j, store); 
        		} 
        		public static void selectionSort(boolean print)  
        		{ 
        		print = false; 
        		for(int i = 0; i < students.size()-1; i++) 
        		{ 
        		int low = i; 
        		for(int j = i + 1; j < students.size(); j++) 
        		{ 
        		if(students.get(low).getID() > students.get(j).getID()) 
        		{ 
        		low = j; 
        		} 
        		} 
        		swap(low, i); 
        		print = true; 
        		} 
        		} 
        	// HEllooo Mr. KOHL :0 00
        		public static void insertionSort(boolean print)  
        		{ 
        		for(int i = 0; i < students.size(); i++) 
        		{ 
        		Student now = students.get(i); 
        		int j = i ; 
        		while(j > 0 && students.get(j).getID() < students.get(j- 1).getID()) 
        		{ 
        		swap(j-1, j); 
        		j--; 
        		}
        		students.set(j, now); 
        		print = true; 
        		} 
        	} 
        		public static int indexOf(Student s)
        		{
        		
        		int low = 0;
        		int high = students.size() - 1;
        		int mid = (low + high)/2;
        		while(low <= high)
        		{
        		if(students.get(mid).getID() == s.getID())
        		{
        		return mid;
        		}
        		else if(students.get(mid).getID() < s.getID())
        		{
        		low = mid;
        		}
        		else if (students.get(mid).getID() > s.getID())
        		{
        		high = mid;
        		} }
        		return -1;
        		}
        		public int binarySearch(int key)
        		{
        		int low = 0;
        		int high = nums.length - 1;
        		      int mid = (low + high)/2;
        		      while(low <= high)
        		      {
        		            if(nums[mid] == key)
        		{

        		            	  return nums[mid];
                }
                else if(nums[mid] < key)
                {
                	low = mid; }
                else if (nums[mid] > key)
                {
                	high = mid; }
        		      }
        		      return -1; }
	}
		
        		
        		
        		
        		
        		