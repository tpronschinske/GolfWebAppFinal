/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tjp_golfwebapp_final.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Members.findAll", query = "SELECT m FROM Members m"),
    @NamedQuery(name = "Members.findById", query = "SELECT m FROM Members m WHERE m.id = :id"),
    @NamedQuery(name = "Members.findByMemberId", query = "SELECT m FROM Members m WHERE m.memberId = :memberId"),
    @NamedQuery(name = "Members.findByFirstName", query = "SELECT m FROM Members m WHERE m.firstName = :firstName"),
    @NamedQuery(name = "Members.findByLastName", query = "SELECT m FROM Members m WHERE m.lastName = :lastName"),
    @NamedQuery(name = "Members.findByAddress", query = "SELECT m FROM Members m WHERE m.address = :address"),
    @NamedQuery(name = "Members.findByCity", query = "SELECT m FROM Members m WHERE m.city = :city"),
    @NamedQuery(name = "Members.findByState", query = "SELECT m FROM Members m WHERE m.state = :state"),
    @NamedQuery(name = "Members.findByZip", query = "SELECT m FROM Members m WHERE m.zip = :zip"),
    @NamedQuery(name = "Members.findByPhone", query = "SELECT m FROM Members m WHERE m.phone = :phone"),
    @NamedQuery(name = "Members.findByCreditCardType", query = "SELECT m FROM Members m WHERE m.creditCardType = :creditCardType"),
    @NamedQuery(name = "Members.findByCreditCardNumber", query = "SELECT m FROM Members m WHERE m.creditCardNumber = :creditCardNumber"),
    @NamedQuery(name = "Members.findByCardCccNumber", query = "SELECT m FROM Members m WHERE m.cardCccNumber = :cardCccNumber"),
    @NamedQuery(name = "Members.findByCardExpDate", query = "SELECT m FROM Members m WHERE m.cardExpDate = :cardExpDate")})
public class Members implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "member_id")
    private Integer memberId;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 45)
    @Column(name = "address")
    private String address;
    @Size(max = 45)
    @Column(name = "city")
    private String city;
    @Size(max = 2)
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private Integer zip;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 13)
    @Column(name = "phone")
    private String phone;
    @Size(max = 45)
    @Column(name = "credit_card_type")
    private String creditCardType;
    @Size(max = 19)
    @Column(name = "credit_card_number")
    private String creditCardNumber;
    @Size(max = 3)
    @Column(name = "card_ccc_number")
    private String cardCccNumber;
    @Column(name = "card_exp_date")
    @Temporal(TemporalType.DATE)
    private Date cardExpDate;

    public Members() {
    }

    public Members(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCardCccNumber() {
        return cardCccNumber;
    }

    public void setCardCccNumber(String cardCccNumber) {
        this.cardCccNumber = cardCccNumber;
    }

    public Date getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(Date cardExpDate) {
        this.cardExpDate = cardExpDate;
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
        if (!(object instanceof Members)) {
            return false;
        }
        Members other = (Members) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tjp_golfwebapp_final.model.Members[ id=" + id + " ]";
    }
    
}
