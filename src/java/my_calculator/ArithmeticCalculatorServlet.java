/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }
//WORKING
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //working here
        request.setAttribute ("whatever2", "---"); 
        
        String message = "Result: ";
        
        String link = "<a href=\"age\">Age Calculator</a>";
        
        String firstNumber = request.getParameter("inputOne");
        String secondNumber = request.getParameter("inputTwo");
        //int intFirst = Integer.parseInt (firstNumber);
        //int intSecond = Integer.parseInt (secondNumber);
        
        
        double result = 0;
        
        String action = request.getParameter("actionButton");
        
        try
        {
            int intFirst = Integer.parseInt (firstNumber);
            int intSecond = Integer.parseInt (secondNumber);
            
            if (action.equals("+"))
            {
                result = intFirst + intSecond;
                request.setAttribute("whatever2", message+result+"<br>"+link);         
            }
        
            if (action.equals("-"))
            {
                result = intFirst - intSecond;
                request.setAttribute("whatever2", message+result+"<br>"+link);
            }
        
            if (action.equals("*"))
            {
                result = intFirst * intSecond;
                request.setAttribute("whatever2", message+result+"<br>"+link);
            }
        
            if(action.equals("%"))
            {
                result = intFirst / intSecond;
                request.setAttribute("whatever2", message+result+"<br>"+link);
            }
        }
        
        catch (NumberFormatException e)
        {
            request.setAttribute ("whatever2", "Result: invalid");    
        }
        
                
        request.setAttribute ("one", firstNumber );
        request.setAttribute ("two", secondNumber );
              
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}