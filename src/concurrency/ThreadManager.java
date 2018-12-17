package concurrency;

public class ThreadManager {
	
	private static ThreadManager instance;
	
	private Thread[] thread_pool;
	
	public static ThreadManager getInstance(){
		if (instance == null){
			instance = new ThreadManager();
		}
		return instance;
	}
	
	private ThreadManager(){
		thread_pool = new Thread[8];
		initializeThreadPool();
	}
	
	private void initializeThreadPool(){
		for (int i = 0; i < thread_pool.length; i++){
			thread_pool[i] = new Thread(new DatabaseFinder());
		}
	}
	
	

}
