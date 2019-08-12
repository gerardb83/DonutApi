package co.grandcircus.DonutApi;

import java.util.List;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {

	private RestTemplate restTemplate;

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Donut> getList() {
		Result results = restTemplate.getForObject("https://grandcircusco.github.io/demo-apis/donuts.json", Result.class);
		return results.getResults();
	}
	
	public Donut getDonut(Long id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		Donut donut = restTemplate.getForObject(url, Donut.class);
		return donut;
	}


}

