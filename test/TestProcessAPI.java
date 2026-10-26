package apis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TestProcessAPI {

	@Test
	public void smokeTestProcessAPI() {

	    ProcessAPIImpl impl =
	            new ProcessAPIImpl();

	    Assertions.assertNotNull(impl);
	}
