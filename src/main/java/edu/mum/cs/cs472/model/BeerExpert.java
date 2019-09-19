

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package edu.mum.cs.cs472.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public BeerExpert() {
    }

    public List getBrands(String var1) {
        ArrayList var2 = new ArrayList();
        if (var1.equals("amber")) {
            var2.add("Jack Amber");
            var2.add("Red Moose");
        } else {
            var2.add("Jail Pale Ale");
            var2.add("Gout Stout");
        }

        return var2;
    }
}
