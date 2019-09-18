package my_calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String message = "";
        
        String link = "<a href=\"arithmetic\">Arithmetic Calculator</a>";
        
        String age = request.getParameter("inputAge");
        int intAge = Integer.parseInt(age);
       
        if (age.equals(""))
        {
            message = "You must enter a number.";
            request.setAttribute("whatever", message);
        }
        
        else if (intAge==0 || intAge <=0)
        {
            message = "Minimum age accepted is 1 year old.\nPlease review your input";
            request.setAttribute("whatever", message);
        }
        
        else if (intAge >=1 || intAge <=10000000)
        {
            intAge = intAge+1;
            request.setAttribute("whatever", "Your age next birthday will be " + intAge +"<br>"+link);
        }
        
        else 
        {
             message = "Please, review your input";
             request.setAttribute("whatever", message);
        }
         
        //request.setAttribute("whatever", intAge);
        //System.out.println(intAge);

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
