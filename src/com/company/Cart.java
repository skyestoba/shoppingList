package com.company;
import java.util.*;

public class Cart {

    boolean isBought;
    ArrayList<String> isNeeded;
    //String[] shoppingList = {"bread", "eggs", "tomatoes", "bananas", "tofu", "cheese", "salt", "ice cream"};
    ArrayList<String> shoppingList = new ArrayList<>();

    public Cart(ArrayList<String> isNeeded) {
        this.isNeeded = isNeeded;
    }

    public void addItem(String item){
        shoppingList.add(item);
    }

    public void printIt(){
        System.out.println(shoppingList);
    }

    public boolean isNeeded(String stuff){
        if (isNeeded.contains(stuff)) {
            return true;
        }
        return false;
    }
}
