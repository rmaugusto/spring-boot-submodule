package sub;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import main.Greeting;
import main.GreetingService;

@Service
@Primary
public class GreetingServiceCustom implements GreetingService {

	@Override
	public Greeting greeting(String arg0) {
		return new Greeting(1, "Custom");
	}

}
