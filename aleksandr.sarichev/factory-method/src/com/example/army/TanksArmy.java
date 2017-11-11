package com.example.army;
import java.util.ArrayList;
import java.util.List;

import com.example.tanks.Tank;
import com.example.tanksfactory.TankCreator;

public abstract class TanksArmy {
     protected List<Tank> tanks;
     private int tankCount;
     
     public TanksArmy(int tankCount, TankCreator tankCreator){
    	 this.tankCount = tankCount;
    	 this.tanks = new ArrayList<>();
    	 for(int i = 0; i<this.tankCount;i++){
    		 tanks.add(tankCreator.getTank());
    	 }
     }
     public abstract void attack();
}
