package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* 서블릿이 하는 역할은 크게 3가지이다.
        * 1. 요청 받기 - HTTP method GET/POST 요청에 따라 parameter로 전달받은 데이터를 꺼내올 수 있다.
        * 2. 비지니스 로직 처리 - DB 접속과 CRUD에 대한 로직 처리 -> 서비스를 호출하는 쪽으로 해결(MVC)한다.
        * 3. 응답하기 - 문자열로 동적인 웹(HTML 태그) 페이지를 만들고 스트림을 이용해 내보낸다.
        * */

        /* 사용자 브라우저에 응답하기 위해서는 HttpServletResponse의  getWriter() method로
        * PrintWriter 인스터스를 반환받는다.
        * PrintWriter는 BufferedWriter와 형제격인 클래스이지만 더 많은 형태의 생성자를 제공하고 있는
        * 범용성으로 인해 더 많이 사용된다.*/

        // 데이터 타입
        PrintWriter out = response.getWriter();

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>안녕 servlet response<h1>\n")
                .append("</body>\n")
                .append("</html>\n");

        response.setContentType("text/html");

        out.print(responseBuilder.toString()); // toString은 안적어도 된다.

        out.flush();

        out.close();
    }
}
