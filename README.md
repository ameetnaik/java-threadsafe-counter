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

	synchronized (ThreadSafeCounter.class) {
		ThreadSafeCounter.incrementCounter();
	}

```

## Reading Counter Value

```java

	synchronized (ThreadSafeCounter.class) {
		System.out.println(ThreadSafeCounter.getCounter());
	}

```


## Contributor
Ameet Naik


## License
[MIT License](LICENSE)

