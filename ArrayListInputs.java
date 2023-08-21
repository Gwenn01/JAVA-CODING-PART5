import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		System.out.print("Enter Group: ");
		int group = s.nextInt();
		for(int i = 0; i < group; i++){
		    list.add(new ArrayList<>());
		}
		
		for(int i = 0; i < group; i++){
		    System.out.println("===Group" + (i+1) + "===");
		    System.out.print("Enter length: ");
		    int length = s.nextInt();
		    for(int j = 0; j < length; j++){
		       System.out.print("Value" + (j+1) + ": ");
		       list.get(i).add(s.nextInt());
		    }
		}
		
		System.out.println(list);
		
	}
}