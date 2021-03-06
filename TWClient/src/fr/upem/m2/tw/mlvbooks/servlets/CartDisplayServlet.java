package fr.upem.m2.tw.mlvbooks.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import bank.BankAccount;
import bank.BankAccountServiceLocator;
import bank.BankAccountSoapBindingStub;
import fr.upem.m2.tw.mlvbooks.objects.beans.Cart;
import fr.upem.m2.tw.mlvbooks.utils.CartFactory;

/**
 * Servlet implementation class CartDisplayServlet
 */
@WebServlet("/CartDisplayServlet")
public class CartDisplayServlet extends HttpServlet {

  /**
   * Serial UID.
   */
  private static final long serialVersionUID = -5347590404936145221L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public CartDisplayServlet() {
    super();
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String ids = request.getParameter("ids");
    Cart cart = CartFactory.getCart(ids);
    request.setAttribute("cart", cart);
    BankAccount account = null;
    try {
      account = new BankAccountServiceLocator().getBankAccount();
      ((BankAccountSoapBindingStub) account).setMaintainSession(true); 
      request.setAttribute("accountBalance", account.getBalance());
    } catch (ServiceException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    RequestDispatcher requestDispatcher = 
        request.getRequestDispatcher("cart-display.jsp");
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
    // TODO Auto-generated method stub
  }

}
