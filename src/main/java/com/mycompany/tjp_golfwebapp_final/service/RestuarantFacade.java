/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tjp_golfwebapp_final.service;

import com.mycompany.tjp_golfwebapp_final.model.Restuarant;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Travis
 */
@Stateless
public class RestuarantFacade extends AbstractFacade<Restuarant> {
    @PersistenceContext(unitName = "com.mycompany_TJP_GolfWebApp_Final_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RestuarantFacade() {
        super(Restuarant.class);
    }
    
}
