package main;

import jdk.internal.util.xml.impl.Input;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by stoycho.petrov on 14/02/2017.
 */
@WebServlet("/numberN")
public class Main extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // code to process the form...
        int text  = Integer.parseInt(request.getParameter("n"));

        for(int i = 0;i < 5; i++)
        {

        }
    }

    public static String getMessage() {
        return "Hello, world";
    }

    private void createRow()
    {
    }
}
