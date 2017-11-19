package com.example.army;
import java.util.ArrayList;
import java.util.List;

import com.example.airplanes.Airplane;
import com.example.armyfactory.ArmyCreator;
import com.example.ships.Ship;
import com.example.tanks.Tank;


public abstract class Army {
     protected List<Tank> tanks;
     protected List<Airplane> airplanes;
     protected List<Ship> ships;
    
     
     public Army(int tankCount, int airplaneCount,int shipsCount,ArmyCreator armyCreator){
    	 this(tankCount,airplaneCount,armyCreator);
    	 this.ships = new ArrayList<>(); 
    	 for(int i = 0; i< shipsCount;i++){
    		 this.ships.add(armyCreator.getShip());
    	 }
     }
     
     public Army(int tankCount,ArmyCreator armyCreator){
    	 this.tanks = new ArrayList<>();
    	 for(int i = 0; i<tankCount;i++){
    		 this.tanks.add(armyCreator.getTank());
    	 }
     }
     
     public Army(int tankCount,int airplaneCount,ArmyCreator armyCreator){
    	 this(tankCount, armyCreator);
    	 this.airplanes = new ArrayList<>();
    	 for(int i = 0; i< airplaneCount;i++){
    		 this.airplanes.add(armyCreator.getAirplane());
    	 }
     }
     

     



     public abstract void attack();
}
