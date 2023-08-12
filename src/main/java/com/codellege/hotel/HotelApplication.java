package com.codellege.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(HotelApplication.class, args);
		Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "password");

		if (connection != null) {
			System.out.println("La conexión se ha realizado correctamente.");
		} else {
			System.out.println("La conexión no se ha realizado correctamente.");
		}

		SQLWarning warning = connection.getWarnings();

		if (warning != null){
			System.out.println("Hubo un error durante la conexión.");
			System.out.println(warning.getMessage());
		}else {
			System.out.println("La conexión se ha realizado sin errores.");
		}
	}

}
