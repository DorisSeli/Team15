package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello") //function with parameters
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name); //"Hello " + name, %s - placeholder for a string value
	}

	@GetMapping("/sum")
	public int sum(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2) {
		return number1 + number2;
	}

	@GetMapping("/multiply")
	public int multiply(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2) {
		return number1 * number2;
	}

	@GetMapping("/flowers")
	public String[] flowers() {
		String[] flowers = {"Rose", "Lily", "Sunflower"};
		return flowers;
	}

	@GetMapping("/cheese")
	public List<Cheese> getCheeses() {
		List<Cheese> cheeses = new ArrayList<>();
		cheeses.add(new Cheese("Brie", "soft", 20.0));
		cheeses.add(new Cheese("Feta", "semi-soft", 15.0));
		cheeses.add(new Cheese("Parmesan", "hard", 25.0));
		return cheeses;
	}

	public class Cheese {
		private String name;
		private String type;
		private double price;

		public Cheese(String name, String type, double price) {
			this.name = name;
			this.type = type;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getPrice() {
			return price;
		}

		public void setWeight(double price) {
			this.price = price;
		}
	}
}