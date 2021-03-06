package cn.mysql.project;
import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;






public class Student {
	private int id;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

public boolean valid(int Id,String password)
{
	boolean valid=false;
	Configuration cfg=new Configuration().configure();

	ServiceRegistry sr = new StandardServiceRegistryBuilder()
							.applySettings(cfg.getProperties())
							.build();
	SessionFactory sf = cfg.buildSessionFactory(sr);
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	Student user=(Student)session.get(Student.class,new Integer(Id));
	System.out.print(user.getPassword());
	if(password.equals(user.getPassword()))
	valid=true;
	else
		valid=false;
	tx.commit();
	session.close();
return valid;
}

public List<Student> stu_list()
{
		
		//open session
	Configuration cfg=new Configuration().configure();

	ServiceRegistry sr = new StandardServiceRegistryBuilder()
							.applySettings(cfg.getProperties())
							.build();
	SessionFactory sf = cfg.buildSessionFactory(sr);
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	
	/*String hql="select name from Student";
	Query query = session.createQuery(hql);

	//List<String> list = query.list();
	for(String bookname:list){
		System.out.println(bookname);
	}*/
	@SuppressWarnings("unchecked")
	List<Student> list = session.createQuery("from Student").list();
	tx.commit();

	session.close();
     return list;
}

}