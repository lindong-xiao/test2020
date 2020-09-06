import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class myServlet extends HttpServlet {
    /*
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //未来实际开发中一个模块对应一个servlet
        System.out.println("myservlet 进入成功");

        PrintWriter pw = response.getWriter();
        pw.println("123");
        pw.flush();
        pw.close();

    }

     */
    protected void service (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        System.out.println("zhixin");
        String path = request.getServletPath();
        if ("/myServlet/save".equals(path)){
            save(request, response);
        }else if ("/myServlet/delete".equals(path)){
            delete(request,response);
        }else if ("/myServlet/change".equals(path)){
            change(request, response);
        }else if ("/myServlet/select".equals(path)){
            select(request, response);
        }
    }

    private void select(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("查询");
    }

    private void change(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("改变");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("删除");
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("保存");
    }
}
