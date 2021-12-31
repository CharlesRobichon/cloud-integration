package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("serviceActivator.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("routing.xml");

		/*
		ApplicationContext ctx = new ClassPathXmlApplicationContext("javaScriptService.xml");

		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
		myGateway.method("Salut !");
		*/


		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("webServiceCalling.xml");

		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
		myGateway.method("Salut !");*/



		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("database.xml");

		BookService bookService = ctx.getBean(BookService.class);
		
		Book book = new Book();
		book.setName("Tintin");
		book = bookService.createBook(book);

		System.out.println(book);*/


	}

}
 