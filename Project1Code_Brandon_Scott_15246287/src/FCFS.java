
public class FCFS { //made by Brandon Scott

	
	public static String computeAvgWaitTime(Task T1, Task T2, Task T3, Task T4, Task T5){
		
		double avgWaitTime = (0.00 + T1.getBurst() + (T1.getBurst() + T2.getBurst()) + (T1.getBurst() + T2.getBurst() + T3.getBurst()) + (T1.getBurst() + T2.getBurst() + T3.getBurst() + T4.getBurst()))/5;
		return "Avg. waiting time: " + avgWaitTime;	
	} 
	
	public static String computeAvgTurnaround(Task T1, Task T2, Task T3, Task T4, Task T5){
		
		double avgTurnaroundTime = ((T1.getBurst() - 0.00) + (T2.getBurst()-T1.getBurst()) + (T3.getBurst() - T2.getBurst()) + (T4.getBurst() - T3.getBurst()) + (T5.getBurst() - T4.getBurst()))/5;
		return "Avg. turnaround time: " + avgTurnaroundTime;	
	} 

	public static void main(String args[]) {

		Task T1 = new Task("T1", 2, 20); //create 5 instances of the Task class in order to store the 5 things.
		Task T2 = new Task("T2", 4, 25);
		Task T3 = new Task("T3", 3, 25);
		Task T4 = new Task("T4", 3, 15);
		Task T5 = new Task("T5", 1, 10);
		Task[] taskArray = new Task[5]; //create an array of tasks, because in order to get the last element, you have to have a kind
	    taskArray[0]= T1; // of structure to do so, array is the quickest/easiest one. Also, populate the array with the task class.
	    taskArray[1]= T2; 
	    taskArray[2]= T3;
	    taskArray[3]= T4;
	    taskArray[4]= T5;
	    
		System.out.println("FCFS"); //Print out the name of the scheduling algorithm
		
		for(int i = 0; i<taskArray.length;i++) { //Checks if the first element is REALLY the first element, so it knows to place a zero at 
			double previousValue = 0.0;
			if(taskArray[i]==T1) {  //the beginning, else get the last term of the array, and use that as the beginning.
		System.out.println(taskArray[i].getName() + "[" + "0-" + taskArray[i].getBurst() + "]");
		previousValue = taskArray[i].getBurst();
			}
			else{
				previousValue = taskArray[i-1].getBurst()+ taskArray[i].getBurst();
			System.out.println(taskArray[i].getName() + "[" + taskArray[i-1].getBurst() + "-" + previousValue + "]");
		
			}
		}
		
        
		System.out.println(computeAvgWaitTime(T1, T2, T3, T4, T5));
		System.out.println(computeAvgTurnaround(T1, T2, T3, T4, T5));
        
	}
}
