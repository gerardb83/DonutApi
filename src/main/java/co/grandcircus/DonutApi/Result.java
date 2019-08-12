package co.grandcircus.DonutApi;

import java.util.List;

public class Result {

	private List<Donut> results;

	public List<Donut> getResults() {
		return results;
	}

	public void setResults(List<Donut> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Result [results=" + results + "]";
	}
	
}
