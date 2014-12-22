package fr.upem.m2.tw.mlvbooks.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.upem.m2.tw.mlvbooks.objects.beans.LightBook;
import fr.upem.m2.tw.mlvbooks.objects.dto.SearchParametersDTO;
import fr.upem.m2.tw.mlvbooks.utils.SearchParametersFactory;

/**
 * 
 * 
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
@WebServlet("/BookSearchServlet")
public class BookSearchServlet extends HttpServlet {

  /**
   * Serial UID.
   */
  private static final long serialVersionUID = 6432955793386727798L;

  /**
   * Default constructor.
   */
  public BookSearchServlet() {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    SearchParametersDTO searchParameters = 
        SearchParametersFactory.createSearchParametersDTO(
            request.getParameterMap());
    LightBook book = new LightBook();
    book.setAuthor(searchParameters.getAuthor());
    request.setAttribute("bookObject", book);
    RequestDispatcher requestDispatcher = 
        request.getRequestDispatcher("index.jsp");
    if (requestDispatcher != null) {
      requestDispatcher.forward(request, response);
    }
  }
  
  @Override
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
  }

}
