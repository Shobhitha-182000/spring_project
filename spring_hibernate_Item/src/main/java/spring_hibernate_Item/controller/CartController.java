package spring_hibernate_Item.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import spring_hibernate_Item.dao.CartDao;
import spring_hibernate_Item.dto.Cart;
import spring_hibernate_Item.dto.CartConfig;
import spring_hibernate_Item.dto.Item;

 
@Component
public class CartController {
	@Autowired
	Scanner scanner;
	 
	 
	public static void main(String[] args) {
		
		 
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CartConfig.class);
		Cart cart=context.getBean("cart",Cart.class);
		CartDao cartDao=context.getBean("cartDao",CartDao.class);
		CartController c=context.getBean("cartController",CartController.class);
		List<Item>list=cartDao.getList();
		

		//Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		do {
			System.out.println("1.save \n 2.update \n 3.remove \n 4.get one \n 5.getall");
			int select = c.scanner.nextInt();
			switch (select) {
			case 1: {
				System.out.println("enter the email");
				String email =c.scanner.next();

				System.out.println("enter the password");
				String password=c.scanner.next();

				System.out.println("enter item  name");
				String name = c.scanner.next();

				System.out.println("enter the cost");
				Double cost=c.scanner.nextDouble();
				
				System.out.println("enter the manufacturer");
				String manufacturer=c.scanner.next();
				
				cart.setEmail(email);
				cart.setPassword(password);
				Item item=context.getBean("item",Item.class);
				item.setName(name);
				item.setManufacturer(manufacturer);
				item.setCost(cost);
				 
				list.add(item);
				cart.setItems(list);
				cartDao.saveCart(cart);
				 
					}break;
					
				case 2:{
					System.out.println("do you want to add more items \n 1.add \n 2.exit");
					int choose=c.scanner.nextInt();
					switch (choose) {
					case 1:{
						System.out.println("enter the id");
						int id=c.scanner.nextInt();
						
						System.out.println("enter item  name");
						String name1 = c.scanner.next();

						System.out.println("enter the cost");
						Double cost1=c.scanner.nextDouble();
						
						System.out.println("enter the manufacturer");
						String manufacturer1=c.scanner.next();
						
						 
//						cart.setId(id);
						Item item=context.getBean("item",Item.class);

						item.setName(name1);
						item.setManufacturer(manufacturer1);
						item.setCost(cost1);
						list.add(item);
						cart.setItems(list);
						cartDao.updateCart(id, cart);
						
					}break;
					case 6:{ 
						condition=false;
					}break;

					default:	{					 
					
						}
					}
					}
			}
					} while (condition);
					
			}
			}
			
//				 
//				
//				System.out.println("successfuly inserted");
//
//			}
//				break;
//			case 2: {
//				System.out.println("enter the id to be updated");
//				int id = scanner.nextInt();
//
//				employee.setId(id);
//				System.out.println("enter the name");
//				String name = scanner.next();
//
//				System.out.println("enter the address");
//				String address = scanner.next();
//
//				employee.setName(name);
//				employee.setAddress(address);
//				
//				 
//				System.out.println("enter the bank id to be updated");
//				int bid = scanner.nextInt();
//				bankaccount.setId(bid);
//				
//				System.out.println("enter bank  name");
//				String bname = scanner.next();
//				
//				bankaccount.setBank_name(bname);
//
//				employee.setAccount(bankaccount);
//				employeeDao.updateEmployee(id,employee);
//				System.out.println("successfuly updated");
//
//			}
//				break;
//			case 3:{
//				System.out.println("enter the id to be deleted  ");
//				int id = scanner.nextInt();
//				 
//				employeeDao.removeEmployee(id);
//				System.out.println("deleted successfully");
//			}break;
//			case 4:{
//				System.out.println("enter the id");
//				int id = scanner.nextInt();
//				 
//				System.out.println(employeeDao.getOne(id));
//	 
//			}break;
//			case 5:{
//				 System.out.println(employeeDao.getAll());
//				 
//			
//			}break;
			 
			 
			
	 
			
 

