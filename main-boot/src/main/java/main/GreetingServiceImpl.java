package main;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	public Greeting greeting(String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }	
}
