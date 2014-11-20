/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tjp_golfwebapp_final.controller;

import com.mycompany.tjp_golfwebapp_final.model.Instructors;
import com.mycompany.tjp_golfwebapp_final.service.InstructorsFacade;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


 /**
 * @author Travis
 */
@Named("instructorsBean")
@SessionScoped
public class InstructorsBean implements Serializable {
    private List<Instructors> instructors;
    private int instructorId;
    private String firstName;
    private String lastName;
    private double rate;
    private String availability;
    private String specialty;
    
    @Inject
    private InstructorsFacade instructorsDAO;

    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    public String processGetAllInstructors() {
        instructors = instructorsDAO.findAll();
        // preferred way to go to a page
        return "view-records/instructor-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }

    public String addInstructor(){
       Instructors instructor = new Instructors();
       instructor.setInstructorId(instructorId);
       instructor.setFirstName(firstName);
       instructor.setLastName(lastName);
       instructor.setLessonRate(new BigDecimal(rate));
       instructor.setAvailability(availability);
       instructor.setSpecialty(specialty);
       
       instructors.add(instructor);
       return null;    
    }
    
    public String deleteInstructor(Instructors instructor){
        instructors.remove(instructor);
        return null;
    }
    
    
    public List<Instructors> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructors> instructors) {
        this.instructors = instructors;
    }

    public InstructorsFacade getInstructorsDAO() {
        return instructorsDAO;
    }

    public void setInstructorsDAO(InstructorsFacade instructorsDAO) {
        this.instructorsDAO = instructorsDAO;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    


}
