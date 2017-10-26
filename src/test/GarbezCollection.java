package test;

public class GarbezCollection {
	public static void main (String[] args){
		Runtime rt = Runtime.getRuntime();
		System.out.println("Before GurbageCollection: "+rt.freeMemory());
		rt.gc();
		System.out.println("After Garbage Collection: "+rt.freeMemory());
	}
}
