/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Cerebro
 */
public class ClientApi {

    public static void main(String[] args) {
        //client
        Client client = ClientBuilder.newClient();
        //target (URI)
        WebTarget target = client.target("http://localhost:8080/JavaAPIDemo/api/hello/name");

        //response
        System.out.println(target.request(MediaType.APPLICATION_JSON).get(String.class));
    }

}
