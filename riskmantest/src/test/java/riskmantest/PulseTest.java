package riskmantest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import org.junit.*;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.NullPayload;

public class PulseTest extends FunctionalTestCase {
	
	@Override
	protected String getConfigResources() {
		return "riskmantest.xml";
	}


	@Test
	public void testPulseSpanish() throws Exception {
		MuleClient client = muleContext.getClient();
		Map<String, Object> properties = new HashMap<String, Object>();
		
		properties.put("http.method", "GET");
		MuleMessage message = new DefaultMuleMessage(getTestMuleMessage());
		
		MuleMessage response = client.send("http://localhost:8081/pulse", message);
		assertNotNull(response);
		assertFalse(response.getPayload() instanceof NullPayload);
		assertEquals("hola", response.getPayloadAsString()); 
		
	}
	
	
}
