package com.ohgiraffers.section01.xml;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {

    private int initCount = 1;
    private  int serviceCount = 1;
    private  int destroyCount = 1;

    public LifeCycleTestServlet(){}

    /* 최초 서블릿 요청 시에 동작하는 메소드 */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("xml 매핑 init() 메소드 호출 : " + initCount++);
    }

    /* 서블릿 컨테이너에 의해 호출되면 최초 요청 시에는 init() 이후에 동작하고,
    * 두 번째 요청부터는 init() 호출 없이 바로 service()를 호출한다. */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("xml 매핑 service() 메소드 호출 : " + serviceCount++);
    }

    /* 컨테이너가 종료될 때 호출되는 메소드이며 주로 자원을 반납하는 용도로 사용한다.*/
    @Override
    public void destroy() {
        System.out.println("xml 매핑 destroy() 메소드 호출 : " + destroyCount++);
    }
}
