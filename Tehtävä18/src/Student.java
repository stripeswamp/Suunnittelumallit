/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Student implements Cloneable {
    
    private Subject subj;
    private String name;

    public Student(String s, String sub) 
    {
        this.name = s;
        this.subj = new Subject(sub);
    }
   
    public Subject getSubj()
    {
        return this.subj;
    }

    public String getName() 
    {
        return this.name;
    }
    
    public void setName(String s) 
    {
        this.name = s;
    }

    public Student clone() 
    {
        Student student = null;
        
        try 
        {
            student = (Student) super.clone();
            student.subj = (Subject) subj.clone();
        }
        catch (CloneNotSupportedException poikkeus) 
        {
              poikkeus.printStackTrace();
        }
        
        return student;
    }
}
