    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tjp_golfwebapp_final.controller;

import com.mycompany.tjp_golfwebapp_final.model.Restuarant;
import com.mycompany.tjp_golfwebapp_final.service.RestuarantFacade;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;



 /**
 * @author Travis
 */
@Named("restuarantBean")
@SessionScoped
public class RestuarantBean implements Serializable {
    private List<Restuarant> restaurant;
    private BigDecimal drinkCharges;
    private BigDecimal foodCharges;
    private BigDecimal balance;
    private BigDecimal quarterlyMinimum;
    private Integer memberId;
    
    
    @Inject
    private RestuarantFacade restaurantDAO;

    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    public String processGetAllRestaurantData() {
        restaurant = restaurantDAO.findAll();
        // preferred way to go to a page
        return "view-records/restaurant-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    
    public String addRestaurantData(){
        Restuarant rs = new Restuarant();
        rs.setMemberId(memberId);
        rs.setBalance(balance);
        rs.setDrinkCharges(drinkCharges);
        rs.setFoodCharges(foodCharges);
        rs.setQuarterlyMinimum(quarterlyMinimum);
        restaurant.add(rs);
        return null;
    }
    
    public String deleteRestuarantData(Restuarant restuarant){
        restaurant.remove(restuarant);
        return null;
    }
    


    public List<Restuarant> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(List<Restuarant> restaurant) {
        this.restaurant = restaurant;
    }

    public RestuarantFacade getRestaurantDAO() {
        return restaurantDAO;
    }

    public void setRestaurantDAO(RestuarantFacade restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
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
    
}

