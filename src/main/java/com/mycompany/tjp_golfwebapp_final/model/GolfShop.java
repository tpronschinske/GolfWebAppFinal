/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tjp_golfwebapp_final.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Travis
 */
@Entity
@Table(name = "golf_shop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GolfShop.findAll", query = "SELECT g FROM GolfShop g"),
    @NamedQuery(name = "GolfShop.findById", query = "SELECT g FROM GolfShop g WHERE g.id = :id"),
    @NamedQuery(name = "GolfShop.findByGolfShopId", query = "SELECT g FROM GolfShop g WHERE g.golfShopId = :golfShopId"),
    @NamedQuery(name = "GolfShop.findByTotalGreensFees", query = "SELECT g FROM GolfShop g WHERE g.totalGreensFees = :totalGreensFees"),
    @NamedQuery(name = "GolfShop.findByTotalCartFees", query = "SELECT g FROM GolfShop g WHERE g.totalCartFees = :totalCartFees"),
    @NamedQuery(name = "GolfShop.findByApparelSales", query = "SELECT g FROM GolfShop g WHERE g.apparelSales = :apparelSales"),
    @NamedQuery(name = "GolfShop.findByClubSales", query = "SELECT g FROM GolfShop g WHERE g.clubSales = :clubSales"),
    @NamedQuery(name = "GolfShop.findByBallSales", query = "SELECT g FROM GolfShop g WHERE g.ballSales = :ballSales"),
    @NamedQuery(name = "GolfShop.findByHatSales", query = "SELECT g FROM GolfShop g WHERE g.hatSales = :hatSales"),
    @NamedQuery(name = "GolfShop.findByAccessoriesSales", query = "SELECT g FROM GolfShop g WHERE g.accessoriesSales = :accessoriesSales"),
    @NamedQuery(name = "GolfShop.findByDate", query = "SELECT g FROM GolfShop g WHERE g.date = :date")})
public class GolfShop implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "golf_shop_id")
    private Integer golfShopId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_greens_fees")
    private BigDecimal totalGreensFees;
    @Column(name = "total_cart_fees")
    private BigDecimal totalCartFees;
    @Column(name = "apparel_sales")
    private BigDecimal apparelSales;
    @Column(name = "club_sales")
    private BigDecimal clubSales;
    @Column(name = "ball_sales")
    private BigDecimal ballSales;
    @Column(name = "hat_sales")
    private BigDecimal hatSales;
    @Column(name = "accessories_sales")
    private BigDecimal accessoriesSales;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public GolfShop() {
    }

    public GolfShop(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGolfShopId() {
        return golfShopId;
    }

    public void setGolfShopId(Integer golfShopId) {
        this.golfShopId = golfShopId;
    }

    public BigDecimal getTotalGreensFees() {
        return totalGreensFees;
    }

    public void setTotalGreensFees(BigDecimal totalGreensFees) {
        this.totalGreensFees = totalGreensFees;
    }

    public BigDecimal getTotalCartFees() {
        return totalCartFees;
    }

    public void setTotalCartFees(BigDecimal totalCartFees) {
        this.totalCartFees = totalCartFees;
    }

    public BigDecimal getApparelSales() {
        return apparelSales;
    }

    public void setApparelSales(BigDecimal apparelSales) {
        this.apparelSales = apparelSales;
    }

    public BigDecimal getClubSales() {
        return clubSales;
    }

    public void setClubSales(BigDecimal clubSales) {
        this.clubSales = clubSales;
    }

    public BigDecimal getBallSales() {
        return ballSales;
    }

    public void setBallSales(BigDecimal ballSales) {
        this.ballSales = ballSales;
    }

    public BigDecimal getHatSales() {
        return hatSales;
    }

    public void setHatSales(BigDecimal hatSales) {
        this.hatSales = hatSales;
    }

    public BigDecimal getAccessoriesSales() {
        return accessoriesSales;
    }

    public void setAccessoriesSales(BigDecimal accessoriesSales) {
        this.accessoriesSales = accessoriesSales;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        if (!(object instanceof GolfShop)) {
            return false;
        }
        GolfShop other = (GolfShop) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tjp_golfwebapp_final.model.GolfShop[ id=" + id + " ]";
    }
    
}
