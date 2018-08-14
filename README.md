# Java Thread-Safe Counter Singleton


<p align="center">
  <a href="https://travis-ci.org/ameetnaik/java-threadsafe-counter">
    <img src="https://travis-ci.org/ameetnaik/java-threadsafe-counter.svg?branch=master">
  </a>
  <a href="https://github.com/ameetnaik/java-threadsafe-counter/blob/master/LICENSE">
    <img src="https://img.shields.io/github/license/ameetnaik/java-threadsafe-counter.svg">
  </a>
</p>


# Usage

## Incrementing Counter

```java

	synchronized (ThreadSafeCounterSingleton.class) {
		ThreadSafeCounterSingleton.incrementCounter();
	}

```

## Reading Counter Value

```java

	synchronized (ThreadSafeCounterSingleton.class) {
		System.out.println(ThreadSafeCounterSingleton.getCounter());
	}

```


## Contributor
Ameet Naik


## License
[MIT License](LICENSE)

