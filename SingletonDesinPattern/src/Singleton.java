import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;


public class Singleton implements Cloneable{
	
	private static Singleton instance;
	
	public static Singleton getInstance(){
		if(instance==null)
		{
			synchronized(Singleton.class)  {
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		
		return instance;
	}
	public Singleton clone() throws CloneNotSupportedException{
		return(Singleton) super.clone();
	}

	int count=0;
	private Singleton(){
		System.out.println("count: "+count);
		count++;
	}
	
}
