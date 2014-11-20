/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tjp_golfwebapp_final.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "instructors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instructors.findAll", query = "SELECT i FROM Instructors i"),
    @NamedQuery(name = "Instructors.findById", query = "SELECT i FROM Instructors i WHERE i.id = :id"),
    @NamedQuery(name = "Instructors.findByInstructorId", query = "SELECT i FROM Instructors i WHERE i.instructorId = :instructorId"),
    @NamedQuery(name = "Instructors.findByFirstName", query = "SELECT i FROM Instructors i WHERE i.firstName = :firstName"),
    @NamedQuery(name = "Instructors.findByLastName", query = "SELECT i FROM Instructors i WHERE i.lastName = :lastName"),
    @NamedQuery(name = "Instructors.findByLessonRate", query = "SELECT i FROM Instructors i WHERE i.lessonRate = :lessonRate"),
    @NamedQuery(name = "Instructors.findByAvailability", query = "SELECT i FROM Instructors i WHERE i.availability = :availability"),
    @NamedQuery(name = "Instructors.findBySpecialty", query = "SELECT i FROM Instructors i WHERE i.specialty = :specialty")})
public class Instructors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "instructor_id")
    private Integer instructorId;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lesson_rate")
    private BigDecimal lessonRate;
    @Size(max = 45)
    @Column(name = "availability")
    private String availability;
    @Size(max = 45)
    @Column(name = "specialty")
    private String specialty;

    public Instructors() {
    }

    public Instructors(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
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

    public BigDecimal getLessonRate() {
        return lessonRate;
    }

    public void setLessonRate(BigDecimal lessonRate) {
        this.lessonRate = lessonRate;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructors)) {
            return false;
        }
        Instructors other = (Instructors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tjp_golfwebapp_final.model.Instructors[ id=" + id + " ]";
    }
    
}
