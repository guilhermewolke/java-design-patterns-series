package decorators.raw.http;

import adapter.solution.http.HttpAdapter;

import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        System.out.println("Conectando via HttpClient à URL " + url + "...");
    }
}
