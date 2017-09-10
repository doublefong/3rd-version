package cn.mysql.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Scourse {
	private int course_no;
	private int stu_id;
	private double tea_score;
	private double stu_grade;
    private String title;
    private String tea_evaluation;
    public int getCourse_no() 
   {
	return course_no;
   }
    public void setCourse_no(int course_no) 
    {
    	this.course_no = course_no;
    }
    public int getStu_id() 
    {
    	return stu_id;
    }
    public void setStu_id(int stu_id) {
    	this.stu_id=stu_id;
    }
    public double getTea_score() 
    {
    	return tea_score;
    }
    public void setTea_score(double tea_score)
    {
    	this.tea_score=tea_score;
    	
    }
    public double getStu_grade() 
    {
    	return stu_grade;
    }
    public void setStu_grade(double stu_grade)
    {
    	this.stu_grade=stu_grade;
    	
    }
    public String getTitle()
    {
	return title;
    }
    public void setTitle(String title) 
    {
    	this.title = title;
    }
    public String getTea_evaluation()
{
	return tea_evaluation;
}

public void setTea_evaluation(String tea_evaluation)
{
	this.tea_evaluation= tea_evaluation;
}

}
