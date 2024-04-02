package com.ohgiraffers.section01.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/headers")
public class RequestHeaderPrintServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 헤더의 종류는 전통적으로 4가지 카테고리로 구분된다.
        * 1. General header : 요청 및 응답 모두에 적용되지만 최종적으로는 body에 전송되는 것과 관련이 없는 헤더이다.
        * 2. Request header : Fetch될 리소스나 클라이언트 자체에 대한 상세 정보를 포함하는 헤더이다.
        * 3. Response header : 위치나 서버 자체와 같은 응답에 대한 부가적인 정보를 갖는 헤더이다.
        * 4. Entity header : 컨텐츠 길이나 MIME 타입과 같은 엔티티 body에 상세 정보를 포함하는 헤더이다.
        *                    (요청 응답 모두 사용되며, 메시지 바디의 컨텐츠를 나타내기에 GET요청은 해당하지 않는다.*/

        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }
        System.out.println(req.getHeader("accept"));
        System.out.println(req.getHeader("cookie"));
    }
}
