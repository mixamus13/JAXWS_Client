package com.mixamus.client;

import com.mixamus.client.ws.demo.Demo;
import com.mixamus.client.ws.demo.DemoImplService;
import com.mixamus.client.ws.demo.Product;
import com.mixamus.client.ws.demo.ProductWS;
import com.mixamus.client.ws.demo.ProductWSImplService;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    DemoImplService demoImplService = new DemoImplService();
    Demo demo = demoImplService.getDemoImplPort();

    ProductWSImplService productWSImplService = new ProductWSImplService();
    ProductWS productWS = productWSImplService.getProductWSImplPort();
    Product product = productWS.find();
    System.out.println("ID: " + product.getId());
    System.out.println("Name: " + product.getName());
    System.out.println("Price: " + product.getPrice());
    System.out.println("===================");

    List<Product> all = productWS.findAll();
    for (Product p : all) {
      System.out.println("ID: " + p.getId());
      System.out.println("Name: " + p.getName());
      System.out.println("Price: " + p.getPrice());
      System.out.println("===================");
    }

    System.out.println(demo.helloWorld());
    System.out.println(demo.hi("Max"));
  }
}
