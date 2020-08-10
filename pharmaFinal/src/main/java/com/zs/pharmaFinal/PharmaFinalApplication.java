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

@SpringBootApplication(scanBasePackages = "com.zs.pharmaFinal")
public class PharmaFinalApplication
{



	SalesRepService salesRepService;
	public static void main(String[] args) {
		SpringApplication.run(PharmaFinalApplication.class, args);
	}


}
