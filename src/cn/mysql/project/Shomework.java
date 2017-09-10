package cn.mysql.project;
import java.math.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

// mapping stu_homework
public class Shomework {
private int homework_no;
private int stu_id;
private boolean status;
private String opinion;
private double grade;
public int getHomework_no()
{
return homework_no;	
}
public void setHomework_no(int homework_no)
{
	this.homework_no=homework_no;
}
public int getStu_id()
{
return stu_id;	
}
public void setStu_id(int stu_id)
{
this.stu_id=stu_id;	
}
public boolean getStatus()
{
return this.status;	
}
public void setStatus(boolean status)
{
	this.status=status;
}
public String getOpinion()
{
	return this.opinion;
}
public void setOpinion(String opinion)
{
this.opinion	=opinion;
}
public double getGrade()
{
return this.grade;	
}
public void setGrade(double grade)
{
this.grade=grade;	
}

}
