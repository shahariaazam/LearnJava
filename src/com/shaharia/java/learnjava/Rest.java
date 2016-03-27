package com.shaharia.java.learnjava;

import br.com.caelum.restfulie.Response;
import br.com.caelum.restfulie.Restfulie;

public class Rest {
    public static void main(String[] args){
        Response r = Restfulie.at("http://ip.jsontest.com/").get();
        System.out.println(r.getContent().toCharArray());
    }
}