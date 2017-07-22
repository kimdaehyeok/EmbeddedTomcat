package com.embeddedtomcat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/* Servlet Container는 서버를 시작할 때 클래스패스에 있는 클래스 중 
 * HttpServlet을ㅇ 상속하는 클래스를 찾은 후 @WebServlet 어노테이션의 값을 읽어
 * 요청 URL과 서블릿을 연결하는 Map을 생성한다.
 * 즉, 서블릿 컨테이너의 주요 역할 중 하나는 서블릿 클래스의 인스턴스 생성, 요청 URL과 서블릿 인스턴스 메핑
 * 그리고 서블릿을 찾은 후 서블릿에 작업을 위임하는 역할을 한다.
 * 또한 서블릿 컨테이너는 서블릿과 관련한 초기화(Init) 및 소멸(Destroy) 작업도 담당한다.
 */

/* Servlet 컨테이너는 멀티스레드 형식으로 동작하여 동시에 여러 클라이언트가 접속할 수 있다.
 * 서블릿 인스턴스는 단 한번만 생성된 뒤 재사용된다.
 * RequestMapping의 Map은 Static으로 구현이 되어 있어 서버가 시작할 때 한번 초기화 하면
 * 그 후로는 계속 재사용을 하는 형태이다.
 * 모든 스레드가 같은 인스턴스를 사용한다.
 * 멀티스레드가 하나의 인스턴스를 사용하면서 생기는 문제점은 추후에 파악하도록 한다.
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
