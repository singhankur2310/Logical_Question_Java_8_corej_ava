package com.ankur.day8;

import java.util.stream.Stream;

public class parallelDemo {
	public static void main(String[] args) {
		System.out.println("====== Serial Stream =========");
			Stream<Integer> stream = Stream.of(1,2,3,4);
			stream.forEach(n->System.out.println(n +" :: "+Thread.currentThread()));
	System.out.println("======== Parallel Stream ==========");
	Stream<Integer> ps = Stream.of(1,2,3,4);
	Stream<Integer> parallel = ps.parallel();
	parallel.forEach(x->System.out.println(x+" :: "+Thread.currentThread()));
	
	}

}
