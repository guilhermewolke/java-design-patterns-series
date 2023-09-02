package adapter.solution.http;

import java.util.Map;

public class OkHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        System.out.println("Conectando via OkHttpClient à URL " + url + "...");
    }
}
