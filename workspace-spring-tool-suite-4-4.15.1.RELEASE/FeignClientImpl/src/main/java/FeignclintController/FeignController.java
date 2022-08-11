package FeignclintController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignController {
	@Autowired
	FeignService feignservice;
	
	@GetMapping("/get-data")
	public String getData() {
		return feignservice.getData();
	}
	
	@GetMapping("/get-address")
	public String getAddress() {
		return feignservice.getAddress();
	}
	

}
