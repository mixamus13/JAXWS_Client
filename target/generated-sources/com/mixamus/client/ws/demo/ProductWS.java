
package com.mixamus.client.ws.demo;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductWS", targetNamespace = "http://ws.servers.mixamus.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.mixamus.client.ws.demo.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ws.servers.mixamus.com/", className = "com.mixamus.client.ws.demo.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ws.servers.mixamus.com/", className = "com.mixamus.client.ws.demo.FindAllResponse")
    @Action(input = "http://ws.servers.mixamus.com/ProductWS/findAllRequest", output = "http://ws.servers.mixamus.com/ProductWS/findAllResponse")
    public List<Product> findAll();

    /**
     * 
     * @return
     *     returns com.mixamus.client.ws.demo.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://ws.servers.mixamus.com/", className = "com.mixamus.client.ws.demo.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://ws.servers.mixamus.com/", className = "com.mixamus.client.ws.demo.FindResponse")
    @Action(input = "http://ws.servers.mixamus.com/ProductWS/findRequest", output = "http://ws.servers.mixamus.com/ProductWS/findResponse")
    public Product find();

}