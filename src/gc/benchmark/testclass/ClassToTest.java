package gc.benchmark.testclass;

import java.util.ArrayList;

public class ClassToTest {

	public int i;
	public String s;
	public Double[] d;
	
	ArrayList<String> arrayS;
	
	public void fun(int x){
		x *= x;
	}
	
	public ClassToTest(){
		
	}
	
	public ClassToTest(int i, String s){
		this.i = i;
		this.s = s;
		
		this.arrayS = new ArrayList<String>() {{
			add("Test1");
			add("Test1");
			add("Test1");
			add("Test1");
			add("Test1");
			add("Test1");
			add("Test1");
			add("Test1");
		}};
		this.d = new Double[100];
		for(int j = 0; i < 100; i++){
			this.d[j] = new Double(j);
		}
	}
}
