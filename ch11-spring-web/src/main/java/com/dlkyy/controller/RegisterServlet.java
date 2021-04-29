package com.dlkyy.controller;
/**
 * Created by dlkyy on 2021/4/28 20:41
 */

import com.dlkyy.entity.Student;
import com.dlkyy.service.StudentService;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //String strId = request.getParameter("id");
      String strName = request.getParameter("name");
      String strEmail = request.getParameter("email");
      String strAge = request.getParameter("age");

      // 创建spring容器对象
      //String config = "spring.xml";
      //ApplicationContext ac = new ClassPathXmlApplicationContext(config);
      // 一次只创建一个容器对象
      //System.out.println("容器对象===" + ac);
      WebApplicationContext ctx = null;
      String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
      Object attr = getServletContext().getAttribute(key);
      if(attr != null){
        ctx = (WebApplicationContext) attr;
      }

      StudentService service = (StudentService) ctx.getBean("studentService");
      Student student = new Student(null, strName, strEmail, Integer.parseInt(strAge));
      service.addStudent(student);

      //结果页面
      request.getRequestDispatcher("/res.jsp").forward(request, response);
  }
}
