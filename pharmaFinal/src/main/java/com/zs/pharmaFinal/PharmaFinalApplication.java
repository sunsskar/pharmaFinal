package com.zs.pharmaFinal;

import com.zs.pharmaFinal.model.SalesRep;
import com.zs.pharmaFinal.service.SalesRepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.*;


import javax.sql.DataSource;
import java.util.Random;

@Profile("web")
@SpringBootConfiguration
@SpringBootApplication
public class PharmaFinalApplication extends SpringBootServletInitializer {



	SalesRepService salesRepService;
	public static void main(String[] args) {
		SpringApplication.run(PharmaFinalApplication.class, args);
	}

	public void run(String... args) throws Exception {

		Random r = new Random();

		// SalesRep 1
		SalesRep salesRep_1 = new SalesRep();
		Long salesRepId_1 = r.nextLong();
		salesRep_1.setId(salesRepId_1);
		salesRep_1.setName("demoSalesRep_1");
		salesRep_1.setRegion("Datia");
		salesRep_1.setOpeningSales(100);
		salesRep_1.setClosingSales(100);

		// SalesRep 2
		SalesRep salesRep_2 = new SalesRep();
		Long salesRepId_2 = r.nextLong();
		salesRep_2.setId(salesRepId_2);
		salesRep_2.setName("demoSalesRep_2");
		salesRep_2.setRegion("Gwalior");
		salesRep_2.setOpeningSales(100);
		salesRep_2.setClosingSales(100);

		// SalesRep 3
		SalesRep salesRep_3 = new SalesRep();
		Long salesRepId_3 = r.nextLong();
		salesRep_3.setId(salesRepId_3);
		salesRep_3.setName("demoSalesRep_3");
		salesRep_3.setRegion("Jhansi");
		salesRep_3.setOpeningSales(100);
		salesRep_3.setClosingSales(100);


		salesRepService.createSalesRep(salesRep_1);
		salesRepService.getAllSalesRep();

	}
}
