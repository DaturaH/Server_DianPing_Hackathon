package com.vito.action;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class HelloWorldController {
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	@ResponseBody
	public Object printWelcome(String name) {
		ArrayList array = new ArrayList();
		array.add(1);
		array.add(2);
		array.add(3);
		int [] array1 = {1,2,3};
		return array;
	}
}
