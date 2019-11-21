/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hostws;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author root
 */
@WebService(serviceName = "hostWebService")
public class hostWebService {

    /**
     * This is a sample web service operation
     * @param host
     * @return 
     * @throws java.net.UnknownHostException
     */
    @WebMethod(operationName = "host")
    public String host(String host) throws UnknownHostException{
		InetAddress address = InetAddress.getByName(host);
		return(address.toString()); 
    }
    @WebMethod(operationName = "hashcode")
    public Integer hashcode(String host) throws UnknownHostException{
		InetSocketAddress isa1 = new InetSocketAddress(5500);
                return(isa1.hashCode());
    }
    @WebMethod(operationName = "portno")
    public Integer portno(String host) throws UnknownHostException{
		InetSocketAddress isa1 = new InetSocketAddress(5500);
                return(isa1.getPort());
    }
    
}
