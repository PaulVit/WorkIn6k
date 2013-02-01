package com.in6k.servletdemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FormServlet extends HttpServlet {
    protected final Log logger = LogFactory.getLog(getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.print("<h1><!DOCTYPE HTML>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>Тег INPUT</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<form name=\"test\" method=\"get\" action=\"/validate\">\n" +
                "    <p><b>Name:</b><br>\n" +
                "        <input type=\"text\" size=\"40\" NAME=\"name\"  value=" + testAtributeOnNull((String)request.getAttribute("name")) + ">\n" +
                "    </p>\n" +
                "\n" +
                "    <p><b>Surname:</b><br>\n" +
                "        <input type=\"text\" size=\"40\" NAME=\"surname\" value=" + testAtributeOnNull((String)request.getAttribute("surname")) + ">\n" +
                "    </p>\n" +
                "\n" +
                "    <p><b>E-mail:</b><br>\n" +
                "        <input type=\"text\" size=\"40\" NAME=\"email\" value=" + testAtributeOnNull((String)request.getAttribute("email")) +">\n" +
                "    </p>\n" +
                "\n" +
                "    <p><b>Password:</b><br>\n" +
                "        <input type=\"PASSWORD\" size=\"40\" NAME=\"pass\">\n"+
                "    </p>\n" +
                "\n" +
                "    <p><b>Confirm password:</b><br>\n" +
                "        <input type=\"PASSWORD\" size=\"40\" NAME=\"confirmPass\">\n" +
                "    </p>\n" +
                "\n" +
                "    <p><b>Birthday:</b><br>\n" +
                "        <input type=\"text\" size=\"40\" NAME=\"bod\" value=" + testAtributeOnNull((String)request.getAttribute("bod")) +">\n" +
                "    </p>\n" +
                "\n" +
                "    <p><input type=\"submit\" value=\"Send\" NAME=\"submit\"></p>\n" +
                "\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html></h1>");

        writer.close();

    }

    public String testAtributeOnNull(String testAtribute){
        if   (testAtribute == null || testAtribute == "Bad"){
            return "";
        } else{
            return testAtribute;
        }
    }
}
