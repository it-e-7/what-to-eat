package com.ite7.whattoeat.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "example")
@Getter

public class Example {
	@Id
	private String _id;
	private String title;
	private String content;

	@Builder
	public Example(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	
}
