package com.embeddedtomcat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/* Servlet Container�� ������ ������ �� Ŭ�����н��� �ִ� Ŭ���� �� 
 * HttpServlet���� ����ϴ� Ŭ������ ã�� �� @WebServlet ������̼��� ���� �о�
 * ��û URL�� ������ �����ϴ� Map�� �����Ѵ�.
 * ��, ���� �����̳��� �ֿ� ���� �� �ϳ��� ���� Ŭ������ �ν��Ͻ� ����, ��û URL�� ���� �ν��Ͻ� ����
 * �׸��� ������ ã�� �� ������ �۾��� �����ϴ� ������ �Ѵ�.
 * ���� ���� �����̳ʴ� ������ ������ �ʱ�ȭ(Init) �� �Ҹ�(Destroy) �۾��� ����Ѵ�.
 */

@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.print("hello world");
    }
}
