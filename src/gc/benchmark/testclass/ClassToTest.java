package gc.benchmark.testclass;

import java.util.ArrayList;

public class ClassToTest {

	public int i;
	public String s;
	
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
	}
}
