// Made by Rebecca Zhu on 10/19/19
// purpose is to make the task object

package chapter5;

public class Task implements Priority, Complexity, Comparable{ //implements the priority, complexity, and comparable interfaces
	private int priority; //represents the object's priority
	private String taskname; //represents the object's task name
	private int complexity; //represents the task's complexity
	
	//constructor that builds the task object
	public Task(String taskname, int priority, int complexity) {
		this.taskname = taskname;
		setPriority(priority); //calls the set priority method to set the priority to a passed in value
		setComplexity(complexity); //calls the setcomplexity method
	}
	
	//getter that returns the task's name
	public String getTaskName() {
		return taskname;
	}
	
	//uses method from priority interface that sets the priority
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}

	//uses method from priority interface that returns the priority
	@Override
	public int getPriority() {
		return priority;
	}

	//uses method from complexity interface that sets the complexity
	@Override
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}

	//uses method from the complexity interface that gets the complexity
	@Override
	public int getComplexity() {
		return complexity;
	}
	
	//uses method from the comparable interface that allows the object's priority levels to be compared
	@Override
	public int compareTo(Object arg0) {
		Task t = (Task) arg0; //casts the object parameter into a task object
		if(priority < t.getPriority()) //checks if the less than another object's priority level
			return 1;
		else if(priority > t.getPriority())
			return -1;
		else
			return 0;
	}

}
