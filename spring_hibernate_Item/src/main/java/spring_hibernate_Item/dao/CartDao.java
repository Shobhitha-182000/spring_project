package spring_hibernate_Item.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import spring_hibernate_Item.dto.Cart;
import spring_hibernate_Item.dto.Item;

 
@Component
@Scope(value = "prototype")
public class CartDao {
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private
	List<Item> list;
	
	public void saveCart(Cart cart) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(cart);
 
		entityTransaction.commit();
	}
	public void updateCart(int id,Cart cart) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Cart cart1=entityManager.find(Cart.class, id);
		if(cart!=null) {
			cart1.setId(id);
			cart1.setItems(cart.getItems());
			entityTransaction.begin();
			entityManager.merge(cart);
			entityTransaction.commit();
			 
		}
		else 
		 System.out.println("null value");
	}
	
	public void updateItem(int id,	Item item) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1=entityManager.find(Item.class, id);
		if(item!=null) {
			item.setId(id);
		 
			entityTransaction.begin();
			entityManager.merge(item);
			entityTransaction.commit();
			 
		}
		else 
		 System.out.println("null value");
	}
	public void removeCart(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Cart cart=entityManager.find(Cart.class, id);
		cart.setId(id);
		if(cart!=null) {
			 
			entityTransaction.begin();
			entityManager.remove(cart);
			entityTransaction.commit();
			 
		}
		else 
		 System.out.println("null value");
	}
	public Cart getOne(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Cart cart=entityManager.find(Cart.class, id);
		return cart;
	}
	public List<Cart> getAll(){
		 
		Query query=entityManager.createQuery("select e from Employee e");
		List<Cart> list=query.getResultList();
		return list;
	}
	public List<Item> getList() {
		return list;
	}
	public void setList(List<Item> list) {
		this.list = list;
	}
}
