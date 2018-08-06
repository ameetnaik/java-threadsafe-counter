package io.github.ameetnaik;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeCounterSingleton {

	private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private static Lock readLock = lock.readLock();
	private static Lock writeLock = lock.writeLock();

	private static int count = 0;

	ThreadSafeCounterSingleton() {}

	public static void incrementCounter(){
		writeLock.lock();
		try {
			count++;
		} finally {
			writeLock.unlock();
		}
	}

	public static int getCounter(){
		readLock.lock();
		try {
			return count;
		} finally {
			readLock.unlock();
		}
	}

}
