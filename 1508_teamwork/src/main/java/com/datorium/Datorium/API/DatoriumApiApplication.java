package com.datorium.Datorium.API;

import com.datorium.Datorium.API.DTOs.Book;
import com.datorium.Datorium.API.DTOs.Credentials;
import com.datorium.Datorium.API.DTOs.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
//@RestController - you can delete it, it is for software to understand which of the files are controllers
@CrossOrigin //CORS policy
public class DatoriumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatoriumApiApplication.class, args); //initializing spring
	}
}