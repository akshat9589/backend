package FeignclintController;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feigndemo",url="http://localhost:8801/feign")
public interface FeignService {
	@GetMapping("/getdata")
	String getData();
	
	@GetMapping("/getaddress")
	String getAddress();

}
