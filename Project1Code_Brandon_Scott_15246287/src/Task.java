
public class Task {

	private String name;
	private int priority, cpuBurst;
	
	
	public Task (String n, int p, int c){
		name = n;
		priority= p;
	    cpuBurst = c;
	}
	

	
	
	
    public String getName() {
		    return name;
		  }

		  // Setter
    public void setName(String newName) {
		    this.name = newName;
		  }
    public int getPriority() {
	    return priority;
	  }

	  // Setter
	  public void setPriority(int newPriority) {
	    this.priority = newPriority;
	  }
	  
	    public int getBurst() {
		    return cpuBurst;
		  }

		  // Setter
		  public void setBurst(int newcpuBurst) {
		    this.cpuBurst = newcpuBurst;
		  }	  
			  
		
		}
		  

