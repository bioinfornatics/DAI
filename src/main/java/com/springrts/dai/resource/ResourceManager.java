package com.springrts.dai.resource;

import com.springrts.dai.fact.ResourcesFact;
import com.springrts.ai.oo.clb.OOAICallback;
import com.springrts.ai.oo.clb.Resource;

import java.util.List;

public final class ResourceManager {
    private final OOAICallback    aicallback;
    private final List<Resource>  resources;

    private Resource    metalResource;
    private Resource    energyResource;

    private final int skirmishAIId;


    public ResourceManager(  final int skirmishAIId, OOAICallback aicallback ){
        this.skirmishAIId   = skirmishAIId;
        this.aicallback     = aicallback;
        this.resources      = aicallback.getResources();
        for( Resource resource : resources ) {
            if( resource.getName().toLowerCase().contains("metal")){
                metalResource = resource;
            }
            if( resource.getName().toLowerCase().contains("energy")){
                energyResource = resource;
            }
        }
    }


    public ResourcesFact getResources(){
        return new ResourcesFact(   aicallback.getGame().getMyTeam(),
                getMetal(),     getMetalIncome(),   getMetalUsage(),    getMetalStorage(),
                getEnergy(),    getEnergyIncome(),  getEnergyUsage(),   getEnergyStorage() );
    }


    public float getMetalIncome(){ return aicallback.getEconomy().getIncome(metalResource); }


    public float getMetalUsage(){ return aicallback.getEconomy().getUsage(metalResource); }


    public float getMetal(){ return aicallback.getEconomy().getCurrent(metalResource); }


    public float getMetalStorage(){
        return aicallback.getEconomy().getStorage(metalResource);
    }


    public float getEnergyIncome(){ return aicallback.getEconomy().getIncome(energyResource); }


    public float getEnergy(){ return aicallback.getEconomy().getCurrent(energyResource); }


    public float getEnergyUsage(){ return aicallback.getEconomy().getUsage(energyResource); }


    public float getEnergyStorage(){
        return aicallback.getEconomy().getStorage(energyResource);
    }


    public Resource getMetalResource() {
        return metalResource;
    }


    public Resource getEnergyResource() {
        return energyResource;
    }
}
