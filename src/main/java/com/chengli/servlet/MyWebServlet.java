package com.chengli.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 这里 @WebServlet 相当于在web.xml中配置了<servlet></servlet>
 * 此处@WebInitParam用于设置初始化参数
 */
@WebServlet(urlPatterns = {"/hello"},
        initParams = {@WebInitParam(name = "names", value = "chengli")})
public class MyWebServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = getServletConfig().getInitParameter("names");
        resp.getWriter().print("hello @WebServlet: created by " + name);
    }
}
