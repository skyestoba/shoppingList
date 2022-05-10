package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> needs = new ArrayList<>();
        needs.add("melon");
        Cart cart = new Cart(needs);
        cart.addItem("eggs");
        cart.addItem("cheese");
        cart.printIt();
        System.out.println(cart.isNeeded("melon"));
        System.out.println(cart.isNeeded("socks"));

    }
}
