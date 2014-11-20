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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "restuarant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restuarant.findAll", query = "SELECT r FROM Restuarant r"),
    @NamedQuery(name = "Restuarant.findById", query = "SELECT r FROM Restuarant r WHERE r.id = :id"),
    @NamedQuery(name = "Restuarant.findByDrinkCharges", query = "SELECT r FROM Restuarant r WHERE r.drinkCharges = :drinkCharges"),
    @NamedQuery(name = "Restuarant.findByFoodCharges", query = "SELECT r FROM Restuarant r WHERE r.foodCharges = :foodCharges"),
    @NamedQuery(name = "Restuarant.findByBalance", query = "SELECT r FROM Restuarant r WHERE r.balance = :balance"),
    @NamedQuery(name = "Restuarant.findByQuarterlyMinimum", query = "SELECT r FROM Restuarant r WHERE r.quarterlyMinimum = :quarterlyMinimum"),
    @NamedQuery(name = "Restuarant.findByMemberId", query = "SELECT r FROM Restuarant r WHERE r.memberId = :memberId")})
public class Restuarant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "drink_charges")
    private BigDecimal drinkCharges;
    @Column(name = "food_charges")
    private BigDecimal foodCharges;
    @Column(name = "balance")
    private BigDecimal balance;
    @Column(name = "quarterly_minimum")
    private BigDecimal quarterlyMinimum;
    @Column(name = "member_id")
    private Integer memberId;

    public Restuarant() {
    }

    public Restuarant(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getDrinkCharges() {
        return drinkCharges;
    }

    public void setDrinkCharges(BigDecimal drinkCharges) {
        this.drinkCharges = drinkCharges;
    }

    public BigDecimal getFoodCharges() {
        return foodCharges;
    }

    public void setFoodCharges(BigDecimal foodCharges) {
        this.foodCharges = foodCharges;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getQuarterlyMinimum() {
        return quarterlyMinimum;
    }

    public void setQuarterlyMinimum(BigDecimal quarterlyMinimum) {
        this.quarterlyMinimum = quarterlyMinimum;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
        if (!(object instanceof Restuarant)) {
            return false;
        }
        Restuarant other = (Restuarant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tjp_golfwebapp_final.model.Restuarant[ id=" + id + " ]";
    }
    
}
