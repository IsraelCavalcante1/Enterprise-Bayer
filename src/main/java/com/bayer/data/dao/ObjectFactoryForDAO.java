package com.bayer.data.dao;

import com.bayer.business.model.Address;
import com.bayer.business.model.Disease;
import com.bayer.business.model.Region;
import com.bayer.business.model.UnionState;

public class ObjectFactoryForDAO {

    public static UnionState state1(){
        UnionState unionState = new UnionState(Region.SOUTH_EAST, "São Paulo", "SP");
        return unionState;
    }
    public static UnionState state2(){
        UnionState unionState = new UnionState(Region.NORTH, "Amapá", "AP");
        return unionState;
    }
    public static UnionState state3(){
        UnionState unionState = new UnionState(Region.SOUTH, "Santa Catarina", "SC");
        return unionState;
    }
    public static UnionState state4(){
        UnionState unionState = new UnionState(Region.NORTH_EAST, "Maranhão", "MA");
        return unionState;
    }
    public static UnionState state5(){
        UnionState unionState = new UnionState(Region.CENTER_WEST, "Distrito Federal", "DF");
        return unionState;
    }

    public static  Address address1(){
        Address address = new Address("Embu das Artes","Jardim São francisco","Rua Jambeiro",170, state1());
        return address;
    }

    public static Address address2(){
        Address address = new Address("Macapá", "Km 2 Universidade","Rod. Josmar Chaves Pinto",2141,state2());
        return address;
    }

    public static Address address3(){
        Address address = new Address("Blumenau","Belchior Central","José Patrocínio Santos",2140, state3());
        return address;
    }
    public static Address address4(){
        Address address = new Address("São Luís", "Jacaraty", "Av. Prof. Carlos Cunha",1000, state4());
        return address;
    }
    public static Address address5(){
        Address address = new Address("Brasília", "Asa Norte","SCN Quadra 05 BL A",0, state5());
        return address;

    }



}
