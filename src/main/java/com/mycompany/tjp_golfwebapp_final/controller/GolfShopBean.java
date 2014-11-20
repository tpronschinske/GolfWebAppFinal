/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tjp_golfwebapp_final.controller;



import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import com.mycompany.tjp_golfwebapp_final.model.GolfShop;
import com.mycompany.tjp_golfwebapp_final.service.GolfShopFacade;
import javax.inject.Named;

/**
 *
 * @author Travis
 */
@SessionScoped
@Named("golfShopBean")
public class GolfShopBean implements Serializable {
    private List<GolfShop> golfShopData;
    private int golfShopId;
    private int id;
    private double greensSales;
    private double cartSales;
    private double apparelSales;
    private double clubSales;
    private double ballSales;
    private double hatSales;
    private double accessores;
    private Date date;
    
    
    @Inject
    private GolfShopFacade golfshopService;
    
//    @PostConstruct
//    public void initShopData() {
//        golfShopData = golfshopService.findAll();
//    }

    /**
     * This is an example of a JSF action command method. It is always
     * public, usually has no parameters, and always return a String
     * indicating the page name that you will return to. If you want
     * to return to the same page, return null.
     * @return 
     */
    public String processGetAllGolfShopData() {
        golfShopData = golfshopService.findAll();
        // preferred way to go to a page
        return "view-records/golf-shop-data";
        // Option to redirect to page
//        return "admin-pages/golf-shop-data?faces-redirect=true";
    }
    
    public String addGolfShopData(){
        GolfShop gs = new GolfShop();
        gs.setGolfShopId(golfShopId);
        gs.setTotalGreensFees(new BigDecimal(greensSales));
        gs.setTotalCartFees(new BigDecimal(cartSales));
        gs.setApparelSales(new BigDecimal(apparelSales));
        gs.setClubSales(new BigDecimal(clubSales));
        gs.setBallSales(new BigDecimal(ballSales));
        gs.setHatSales(new BigDecimal(hatSales));
        gs.setDate(date);
        
        golfShopData.add(gs);
        return null;
    }
    
    public String deleteGolfShopRecord(GolfShop golfShop){
        golfShopData.remove(golfShop);
        return null;
    }

    public double getAccessores() {
        return accessores;
    }

    public void setAccessores(double accessores) {
        this.accessores = accessores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public GolfShopFacade getGolfshopService() {
        return golfshopService;
    }

    public void setGolfshopService(GolfShopFacade golfshopService) {
        this.golfshopService = golfshopService;
    }

    public List<GolfShop> getGolfShopData() {
        return golfShopData;
    }

    public void setGolfShopData(List<GolfShop> golfShopData) {
        this.golfShopData = golfShopData;
    }

    public int getGolfShopId() {
        return golfShopId;
    }

    public void setGolfShopId(int golfShopId) {
        this.golfShopId = golfShopId;
    }

    public double getGreensSales() {
        return greensSales;
    }

    public void setGreensSales(double greensSales) {
        this.greensSales = greensSales;
    }

    public double getCartSales() {
        return cartSales;
    }

    public void setCartSales(double cartSales) {
        this.cartSales = cartSales;
    }

    public double getApparelSales() {
        return apparelSales;
    }

    public void setApparelSales(double apparelSales) {
        this.apparelSales = apparelSales;
    }

    public double getClubSales() {
        return clubSales;
    }

    public void setClubSales(double clubSales) {
        this.clubSales = clubSales;
    }

    public double getBallSales() {
        return ballSales;
    }

    public void setBallSales(double ballSales) {
        this.ballSales = ballSales;
    }

    public double getHatSales() {
        return hatSales;
    }

    public void setHatSales(double hatSales) {
        this.hatSales = hatSales;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
