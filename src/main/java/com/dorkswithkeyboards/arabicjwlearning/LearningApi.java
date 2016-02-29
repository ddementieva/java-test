package com.dorkswithkeyboards.arabicjwlearning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LearningApi extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /*public class testit {
        public String name = "test";

        public String getName() {
            return name;
        }

        public testit() {
        }

    };*/

    public ArabicLearningUser authenticateUser() {
        return new ArabicLearningUser();
    }
  
  public Foo authenticateUser11() {
        return new Foo();
    }

    /*
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      //PrintWriter out = resp.getWriter();
      //out.println("Hello, learner!");
    } */
}
