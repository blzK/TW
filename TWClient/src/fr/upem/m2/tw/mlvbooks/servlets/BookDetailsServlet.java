package fr.upem.m2.tw.mlvbooks.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.upem.m2.tw.mlvbooks.objects.beans.HeavyBook;

/**
 * Servlet implementation class BookDetailsServlet
 */
@WebServlet("/BookDetailsServlet")
public class BookDetailsServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public BookDetailsServlet() {
    super();
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String id = request.getParameter("id");
    RequestDispatcher requestDispatcher = null;
    if (Integer.parseInt(id) >= 0) {
      // search by id
      // get it and convert it
      HeavyBook book = new HeavyBook();
      book.setId(Long.parseLong(id));
      book.setAuthor("Toto");
      book.setISBN("42-42-42-42");
      book.setNumberOfPages(42);
      book.setPrice(42.0);
      book.setSynopsis("Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
          + " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
          + " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris"
          + " nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
          + "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla"
          + " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in"
          + " culpa qui officia deserunt mollit anim id est laborum.");
      book.setTitle("Toto Ipsum");
      request.setAttribute("book", book);
      requestDispatcher = request.getRequestDispatcher("book-detail.jsp");
    } else {
      requestDispatcher = request.getRequestDispatcher("index.jsp");
    }
    if (requestDispatcher != null) {
      requestDispatcher.forward(request, response);
    }
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  }

}
