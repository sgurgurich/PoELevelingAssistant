package concurrency;

public class DatabaseFinder implements Runnable{
	
	private boolean waiting;
	private boolean stopped;
	
	public DatabaseFinder(){
		this.waiting = true;
		this.stopped = false;
	}
	

	@Override
	public void run() {
		while(!stopped){
			if (!waiting){
				// TODO Query the database
				// store data in found data
				
				// if done reading data
					this.waiting = true;   // wait again
			}
		}
	}
	
	public void startProcess(){
		//TODO maybe make this take some data
		this.waiting = false;
	}


}
