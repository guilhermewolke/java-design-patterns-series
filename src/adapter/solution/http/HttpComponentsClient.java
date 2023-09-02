package adapter.solution.http;

import java.util.Map;

public class HttpComponentsClient implements HttpAdapter  {
    @Override
    public void post(String url, Map<String, Object> dados) {
        System.out.println("Conectando via Apache HttpComponents à URL " + url + "...");
    }
}
