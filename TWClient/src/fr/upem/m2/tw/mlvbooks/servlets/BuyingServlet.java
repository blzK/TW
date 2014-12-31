package fr.upem.m2.tw.mlvbooks.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyingServlet
 */
@WebServlet("/BuyingServlet")
public class BuyingServlet extends HttpServlet {

  /**
   * Serial UID.
   */
  private static final long serialVersionUID = 5538769645664135031L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public BuyingServlet() {
    super();
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // unused
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String ids = request.getParameter("ids");
    String quantities = request.getParameter("quantities");
  }

}
