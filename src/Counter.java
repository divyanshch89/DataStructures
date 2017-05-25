
public class Counter {

	private String counterName;
	private int currentValue;
	public Counter(String str){
		this.counterName=str;
		this.currentValue=0;
	}
	public void increament(){
		this.currentValue+=1;
	}
	public int getCurrentValue(){
		return this.currentValue;
	}
	
	public String toString(){
		return this.counterName+":"+this.currentValue;
	}
}
