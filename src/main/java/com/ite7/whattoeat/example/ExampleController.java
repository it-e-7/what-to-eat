package com.ite7.whattoeat.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
	ExampleService exampleService;
	
	public ExampleController(ExampleService exampleService) {
		this.exampleService = exampleService;
	}
	
	@GetMapping("")
	public ResponseEntity<Example> getTitle(@RequestParam("title") String title) {
		return ResponseEntity.ok().body(exampleService.getExample(title));	
	}
	
}
