package com.example.compshop;
public record Product(
	Long id,
	String name,
	String description,
	int price,
	String imageUrl
) {}
