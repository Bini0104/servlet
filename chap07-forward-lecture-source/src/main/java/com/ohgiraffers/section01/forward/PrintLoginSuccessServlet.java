package com.ohgiraffers.section01.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String userId = request.getParameter("userId");
//        String password = request.getParameter("password");
//
//        System.out.println("print servlet userId = " + userId);
//        System.out.println("print servlet password = " + password);

        String userId = (String) request.getAttribute("userId");
        System.out.println("print servlet password = " + userId);

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(userId)
                .append("님 환영합니다.<h3/>")
                .append("</body>\n")
                .append("</html>\n");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print(responseText.toString());

        out.flush();
        out.close();
    }
}
