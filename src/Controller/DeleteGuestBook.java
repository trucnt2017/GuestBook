package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.DeleteCommentDAO;

@WebServlet("/DeleteGuestBook")
public class DeleteGuestBook extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    
    public DeleteGuestBook() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int index = Integer.parseInt(request.getParameter("id"));
		DeleteCommentDAO a = new DeleteCommentDAO();
		try {
			a.XoaComment(index);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("GuestBook.jsp"); 
	}

}
