package adapter.solution.http;

import java.util.Map;

public class SpringWebClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        System.out.println("Conectando via Spring WebClient à URL " + url + "...");
    }
}
