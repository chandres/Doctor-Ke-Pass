import java.io.FileNotFoundException;


public class TestInstance implements Runnable{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws Exception {
		int i=0;
		try{
			if(i==0)
			{
				throw new Exception();
			}
			
		}
		
		catch (Exception e) {
           System.out.println("END");
		}
		finally{
			
		}
		
		
		System.out.println("NOT catched");
		
		
		
//		TestException exception=new TestException();
//		exception.getFileReader();
//		
//		for (int i = 0; i < 100; i++) {
//			(new Thread(new TestInstance())).start();
//		}
		        
	}

	@Override
	public void run(){
		Singleton singleton=Singleton.getInstance();
		try {
			singleton.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      System.out.println("i m kalam: "+Singleton.getInstance());		
	}

}
