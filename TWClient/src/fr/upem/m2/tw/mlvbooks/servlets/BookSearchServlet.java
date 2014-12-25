package fr.upem.m2.tw.mlvbooks.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import fr.upem.m2.tw.mlvbooks.objects.beans.BookList;
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
  private static final long serialVersionUID = 6202802310406217956L;
  private Mapper mapper;

  /**
   * Default constructor.
   */
  public BookSearchServlet() {
    super();
    mapper = new DozerBeanMapper();
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    SearchParametersDTO searchParameters = 
        SearchParametersFactory.createSearchParametersDTO(
            request.getParameterMap());
    // Search...
    BookList books = new BookList();
    // Add books
    // books.addAll(mapper.map(TheBookList<LightBookDTO>, List<LightBook>.class));
    request.setAttribute("books", books);
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
