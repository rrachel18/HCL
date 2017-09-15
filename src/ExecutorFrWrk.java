import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrWrk {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 10 ; i++) {
			MyJob job = new MyJob(i);
			service.execute(job);
		}
		service.shutdown();
		while(!service.isTerminated()){
			//wait
		}
		
		System.out.println("Finished all jobs");
	}
}



class MyJob implements Runnable{
	int num;
	public MyJob(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		try {
			System.out.println(num +" "+ Thread.currentThread().getName());
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}