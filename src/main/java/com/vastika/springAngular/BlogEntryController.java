package com.vastika.springAngular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author sudarshan
 *
 */

@Controller
public class BlogEntryController {
	@RequestMapping("/test")
	public String test(){
		return "view";
	}

}
