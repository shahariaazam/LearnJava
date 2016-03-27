package com.shaharia.java.learnjava;

import br.com.caelum.restfulie.Response;
import br.com.caelum.restfulie.Restfulie;

public class Rest {
    public static void main(String[] args){
        Response r = Restfulie.at("http://api.miteksoftware.com/v1/whmcs/client").get();
        System.out.println(r.getContent().toCharArray());
    }
}