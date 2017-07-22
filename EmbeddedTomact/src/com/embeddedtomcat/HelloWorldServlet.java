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

/* Servlet �����̳ʴ� ��Ƽ������ �������� �����Ͽ� ���ÿ� ���� Ŭ���̾�Ʈ�� ������ �� �ִ�.
 * ���� �ν��Ͻ��� �� �ѹ��� ������ �� ����ȴ�.
 * RequestMapping�� Map�� Static���� ������ �Ǿ� �־� ������ ������ �� �ѹ� �ʱ�ȭ �ϸ�
 * �� �ķδ� ��� ������ �ϴ� �����̴�.
 * ��� �����尡 ���� �ν��Ͻ��� ����Ѵ�.
 * ��Ƽ�����尡 �ϳ��� �ν��Ͻ��� ����ϸ鼭 ����� �������� ���Ŀ� �ľ��ϵ��� �Ѵ�.
 */
@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException
    {
        // TODO Auto-generated method stub
        super.init();
        System.out.println("Servlet Start : init()");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.print("hello world");
    }
    
    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub
        super.destroy();
        System.out.println("Servlet Finish : Destroy()");
    }
}
