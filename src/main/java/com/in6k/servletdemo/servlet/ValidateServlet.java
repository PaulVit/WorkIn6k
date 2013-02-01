/*
package com.in6k.servletdemo.servlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ValidateServlet extends HttpServlet {
    protected final Log logger = LogFactory.getLog(getClass());

    private static final String NAME_VALID_REGEXP="[a-zA-Zа-яА-Я]{2,}";
    private static final String EMAIL_VALID_REGEXP="^[A-Za-z0-9](([_\\.\\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([\\.\\-]?[a-zA-Z0-9]+)*)\\.([A-Za-z]{2,})$";
    private static final String PASSWORD_VALID_REGEXP="[a-zA-Zа-яА-Я0-9]{6,}";
    private static final String BIRTHDAY_VALID_REGEXP="^[0-9]+-[0-9]+-[0-9]+$";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String confirmPass = request.getParameter("confirmPass");
        String bod = request.getParameter("bod");

        if (!isFullname(name,NAME_VALID_REGEXP) && !isFullname(surname,NAME_VALID_REGEXP)){
            name="Bad";
        }
        if (!isFullname(email,EMAIL_VALID_REGEXP)){
            email="Bad";
        }
        if (!isFullname(pass,PASSWORD_VALID_REGEXP)){
            if (pass==confirmPass){
                pass="Bad";
            }
        }
        if (!isFullname(name,BIRTHDAY_VALID_REGEXP)){
            bod="Bad";
        }

        request.setAttribute("name",name);
        request.setAttribute("bod",bod);
        request.setAttribute("email",email);
        request.setAttribute("surname",surname);


        FormServlet formServlet = new  FormServlet();
        formServlet.doGet(request,response);
    }

    public static boolean isFullname(String str, String REGEX) {
        String expression = REGEX;
        return str.matches(expression);
    }

}
*/
