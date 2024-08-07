package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public List<Fruit> fruits = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@PostMapping("/addFruit")
	public Fruit addFruit (@RequestBody Fruit fruit) {
		fruits.add(fruit);
		return fruit;
	}

	@GetMapping("/getFruit")
	public List<Fruit> getFruit () {
		return fruits;
	}

	@PostMapping("/createJuice")
	public Drink createJuice(@RequestBody Fruit fruit) {
		var drink = new Drink();
		drink.name = fruit.name + "juice";
		return drink;
	}
}
