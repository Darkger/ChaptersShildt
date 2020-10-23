package com.eugene.javacore.practic3.bridge;

public class BuisnessCreator {
    public static void main(String[] args) {
        Buisness  buisness [] = {new FranchiseBuisness(new ProfessionalWorker()),new ShopBuisness(new UslessWroker())};
      for(Buisness b:buisness)
      {
          b.createBuisnes();
      }
    }
}
