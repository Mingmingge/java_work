package thread;

public class Cake {
	int size;
	public void setSize(int n){
		size=n;
	}
	public int getSize(){
		return size;
		
	}
	public void lost(int m){
		if (size-m>0)
			size=size-m;
		
	}
	

}
