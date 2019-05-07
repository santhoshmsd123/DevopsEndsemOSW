package com.kce.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kce.model.Product;
import com.kce.model.Signup;

@Repository

public class S_dao {
	@Autowired
	SessionFactory sf;
	@Autowired
	Product p;
	@Transactional
	public void adddata(String n,String p)
	{
		Session s=sf.getCurrentSession();
		Signup s1=new Signup(n,p);
		s.save(s1);
	}
	@Transactional
   public int check(String n ,String p)
   {
		Session s=sf.getCurrentSession();
		List<String> allname=s.createQuery("select d.name from Signup d").list();
		List<String> allpwd=s.createQuery("select d.pwd from Signup d").list();
		for(int i=0;i<allname.size();i++)
		{
			if(allname.get(i).equals(n)&&allpwd.get(i).equals(p))
			{
				return 1;
			}
		}
		return 0;
   }
	@Transactional
	public void addproducts(String m,String l,String b)
	{
		Session s=sf.getCurrentSession();
		Product s1=new Product(m,l,b);
		s.save(s1);
	}
	@Transactional
	public void delete(int n)
	{
		Session s=sf.getCurrentSession();
		p=(Product)s.get(Product.class,n);
		s.delete(p);
	}
	@Transactional
	public List<String> everymobile()
	{
		Session s=sf.getCurrentSession();
		List<String> mobile=s.createQuery("select d.name from Product d").list();
		return mobile;
		
	}
}
