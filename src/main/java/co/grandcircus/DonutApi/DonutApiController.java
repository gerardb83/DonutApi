package co.grandcircus.DonutApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonutApiController {
	
	@Autowired
	private ApiService api;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "results", api.getList());	
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(
			@RequestParam("id") Long id) {
		return new ModelAndView ("detail", "donut", api.getDonut(id));
	}
}
