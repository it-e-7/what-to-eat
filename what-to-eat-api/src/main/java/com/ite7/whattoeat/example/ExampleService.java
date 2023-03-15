package com.ite7.whattoeat.example;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
//	ExampleRepository exampleRepository;
//	
//	public ExampleService(ExampleRepository exampleRepository) {
//		this.exampleRepository = exampleRepository;
//	}
	
	public Example getExample(String title) {
		return Example.builder()
				.title(title)
				.content("Example Content")
				.build();
		
//		return exampleRepository.findByTitle(title);
	}
	
}
