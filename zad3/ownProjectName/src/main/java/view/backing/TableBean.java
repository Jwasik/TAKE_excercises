/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package view.backing;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author J.Wasik
 */
@Named(value = "tableBean")
@RequestScoped
public class TableBean
{

    private List<Student> students;

    /**
     * Creates a new instance of TableBean
     */
    public TableBean()
    {
        students = new ArrayList<>();
        students.add(new Student("Wasik1", "Jędrzej", 3));
        students.add(new Student("Wasik2", "Jędrzej", 4));
        students.add(new Student("Wasik3", "Jędrzej", 5));
        students.add(new Student("Wasik4", "Jędrzej", 3.5));
        students.add(new Student("Wasik5", "Jędrzej", 4.5));
        students.add(new Student("Wasik6", "Jędrzej", 2.5));
        students.add(new Student("Wasik7", "Jędrzej", 2.99));
        students.add(new Student("Wasik8", "Jędrzej", 4.20));

    }

    /**
     * @return the students
     */
    public List<Student> getStudents()
    {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

}