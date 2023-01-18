package com.example.proyectoFinal1;

import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.model.ZoneSupervisor;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import com.example.proyectoFinal1.repository.ZoneSupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoFinal1Application/* implements CommandLineRunner*/ {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinal1Application.class, args);
	}

	/*@Autowired
	private ZoneSupervisorRepository zoneSupervisorRepository;

	@Autowired
	private RecyclingZoneRepository recyclingZoneRepository;

	@Override
	public void run(String... args) throws Exception {
		ZoneSupervisor zoneSupervisor1 = new ZoneSupervisor();
		zoneSupervisor1.setName("asdsa");
		zoneSupervisor1.setCapacidadOcupacion("gjk");
		zoneSupervisor1.setCapacidadOcupacion("poi");
		zoneSupervisorRepository.save(zoneSupervisor1);

		RecyclingZone recyclingZone1 = new RecyclingZone();
		recyclingZone1.setName("fghf");
		recyclingZone1.setAdress("podoprqd");
		recyclingZone1.setLongitude("asd");
		recyclingZone1.setLatitude("aqz");
		recyclingZone1.setZoneSupervisor(zoneSupervisor1);
		recyclingZoneRepository.save(recyclingZone1);
	}*/
}
