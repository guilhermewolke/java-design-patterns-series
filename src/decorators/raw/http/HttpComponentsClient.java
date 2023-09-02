package decorators.raw.http;

import adapter.solution.http.HttpAdapter;

import java.util.Map;

public class HttpComponentsClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        System.out.println("Conectando via Apache HttpComponents à URL " + url + "...");
    }
}
