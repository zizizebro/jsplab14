

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package edu.mum.cs.cs472.controller;

import edu.mum.cs.cs472.model.BeerExpert;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet {
    public BeerSelect() {
    }

    public void doPost(HttpServletRequest var1, HttpServletResponse var2) throws IOException, ServletException {
        String var3 = var1.getParameter("color");
        BeerExpert var4 = new BeerExpert();
        List var5 = var4.getBrands(var3);
        var1.setAttribute("styles", var5);
        RequestDispatcher var6 = var1.getRequestDispatcher("result.jsp");
        var6.forward(var1, var2);
    }
}
