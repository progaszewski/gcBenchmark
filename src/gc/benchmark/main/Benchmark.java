package gc.benchmark.main;

import gc.benchmark.testclass.ClassToTest;

import java.util.ArrayList;
import java.util.List;

public class Benchmark {
	public final static int N = 1000000;
	public final static int M = 10;

	public static void main(String[] args){

		String arg = "";
		long times = 0;	
		if(args.length != 0){
			arg = args[0] + "\n";
		}



		int count = M;
		for(int k = 0; k < M; k++){
			List<List<ClassToTest>> ctts = new ArrayList<List<ClassToTest>>();
			int check = 0;
			long startTime = System.currentTimeMillis();
			for(int i = 0; i < N; i++){
				if(check++ < 24000){
					ctts.add(new ArrayList<ClassToTest>(){{
						
						add(new ClassToTest(11, "dddddddddddddd"));
						add(new ClassToTest(11, "11111111111111"));
						add(new ClassToTest(11, "11111111111111"));
						add(new ClassToTest(11, "11111111111111"));
						add(new ClassToTest(11, "11111111111111"));
						add(new ClassToTest(11, "11111111111111"));
						add(new ClassToTest(11, "11111111111111"));
					}});
					//List<ClassToTest> s = ctts.get(check - 1);
				}else{
					check = 0;
					//System.out.println(ctts.size());
					//ctts.removeAll(ctts);
					ctts = new ArrayList<List<ClassToTest>>();
				}
				

			}
			System.out.println(count-- + ".");
			times += System.currentTimeMillis() - startTime;
		}

		System.out.println(arg + "Czas: " + (((double) times)/(double)M) / 1000.0);
	}
}
