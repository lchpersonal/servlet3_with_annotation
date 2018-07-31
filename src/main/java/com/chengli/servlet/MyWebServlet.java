package com.chengli.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @WebServlet 相当于在web.xml中配置了<servlet></servlet>
 * @WebInitParam用于设置初始化参数
 */
@WebInitParam(name = "name", value = "chengli")
@WebServlet({"/hello"})
public class MyWebServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getServletContext().getInitParameter("name");
        resp.getWriter().print("hello @WebServlet: created by "+ name);
    }
}
