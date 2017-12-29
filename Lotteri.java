import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;

public class Lotteri{
	
	public static void main(String[]args){
			String answer;
		do{
			HashSet<Integer> entrySet=new HashSet<Integer>();
			while(entrySet.size()<6){
				Scanner entry=new Scanner(System.in);
				Integer numEntry=entry.nextInt();
				if (numEntry >=1 && numEntry<=49 && entrySet.add(numEntry)){
					System.out.println("Correct number");
				}
				else{}
			}
			System.out.println(entrySet);

			HashSet<Integer> randomNums= new HashSet<Integer>();

			for(int i=0;i<6;i++){
				Random typeRandom=new Random();
				Integer numRandom=typeRandom.nextInt(50);
				randomNums.add(numRandom);
			}
			System.out.println(randomNums);
		
			int hits=0;
			for(Integer num:entrySet){
			
				if(randomNums.contains(num)){
					hits++;
				}
			}
			System.out.println("You are sucessfull "+ hits +" number/s");
		
			System.out.println("Do you want to keep playing??, input yes or no");
			Scanner entry=new Scanner(System.in);
			answer=entry.nextLine();

		}
		while(answer.equals("yes")==true);
	
		System.out.println("Finished program");
	}
}
			
		
			
	
	
