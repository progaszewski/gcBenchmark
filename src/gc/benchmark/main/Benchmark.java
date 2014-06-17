package gc.benchmark.main;

import gc.benchmark.testclass.ClassToTest;

import java.util.ArrayList;
import java.util.List;

public class Benchmark {
	public final static int N = 3000000;
	public final static int M = 100;

	public static void main(String[] args){

		String arg = "";
		long times = 0;	
		if(args.length != 0){
			arg = args[0] + "\n";
		}

		int count = M;
		for(int k = 0; k < M; k++){
			ClassToTest[] ctts = new ClassToTest[10000];
			int check = 0;
			long startTime = System.currentTimeMillis();
			for(int i = 0; i < N; i++){
			
				if(check++ < 10000){
					ctts[check - 1] = new ClassToTest(i, String.valueOf(i));
				}else{
					check = 0;
					ctts = new ClassToTest[10000];
				}

			}
			//System.out.println(count-- + ".");
			times += System.currentTimeMillis() - startTime;
		}

		System.out.println(arg + "Sredni czas dla " + N +" alokacji: " + (((double) times)/(double)M) / 1000.0);
	}
}
