package spring_hibernate_Item.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring_hibernate_Item.dto","spring_hibernate_Item.dao","spring_hibernate_Item.controller"})
public class CartConfig {
	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	@Bean
	public List getList() {
		return new ArrayList<Item>();
	}
}
