package com.humanbooster.examenRestGotRemy;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.humanbooster.examenRestGotRemy.model.Car;
import com.humanbooster.examenRestGotRemy.model.Color;
import com.humanbooster.examenRestGotRemy.repository.CarRepository;
import com.humanbooster.examenRestGotRemy.repository.ColorRepository;


@Configuration
public class LoadData {

	private static final Logger log = LoggerFactory.getLogger(LoadData.class);
	
	@Bean
	CommandLineRunner initDatabase(CarRepository carRepository, ColorRepository colorRepository) throws ParseException{
		if(carRepository.count() == 0 || colorRepository.count() == 0) {

			Car car1 = new Car("Peugeot", "208", "essence", 1990, 1000, 5000, "voiture 1");
			Car car2 = new Car("Renault", "Clio", "diesel", 1991, 2000, 6000, "voiture 2");
			
			Color color1 = new Color("rgb(255,0,0)", "red");
			Color color2 = new Color("rgb(0,0,255)", "blue");
			
			return args ->{
				log.info("Preloading" + carRepository.save(car1));
				log.info("Preloading" + carRepository.save(car2));
				log.info("Preloading" + colorRepository.save(color1));
				log.info("Preloading" + colorRepository.save(color2));
			};
		}
		else {
			return args ->{
				log.info("Il y a déjà des voitures et des couleurs");
			};
		}

	}
}
