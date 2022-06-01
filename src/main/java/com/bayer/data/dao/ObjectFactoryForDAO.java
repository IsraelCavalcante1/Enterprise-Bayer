package com.bayer.data.dao;

import com.bayer.business.model.Address;
import com.bayer.business.model.Disease;
import com.bayer.business.model.Region;
import com.bayer.business.model.UnionState;

public class ObjectFactoryForDAO {



    public static  Address address1(){
        Address address = new Address(8 ,"Embu das Artes","Jardim São francisco","Rua Jambeiro",170, 25);
        return address;
    }

    public static Address address2(){
        Address address = new Address("Macapá", "Km 2 Universidade","Rod. Josmar Chaves Pinto",2141, 3);
        return address;
    }

    public static Address address3(){
        Address address = new Address("Blumenau","Belchior Central","José Patrocínio Santos",2140, 24);
        return address;
    }
    public static Address address4(){
        Address address = new Address("São Luís", "Jacaraty", "Av. Prof. Carlos Cunha",1000, 10);
        return address;
    }
    public static Address address5(){
        Address address = new Address("Brasília", "Asa Norte","SCN Quadra 05 BL A",0, 7);
        return address;

    }



}
