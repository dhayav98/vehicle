package Vehicle_package;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Displayvehicle
 */
@WebServlet("/Displayvehicle")
public class Displayvehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Displayvehicle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		ArrayList<Vehicle> list=new ArrayList<Vehicle>();
		Vehicle p=new Vehicle();
		list=VehicleDAO.SearchVehicleDetails();
		out.print("<table width='100%'");
		out.print("<tr><th>Vehicle No</th><th>Vehicle Type</th><th>Branch</th><th>Insurance Expiry Date</th><th>Last Serviced Date</th><th>Service Due Date</th><th>Update</th></tr>");
		for(Vehicle vv:list)
		{
			out.print("<tr><td>"+vv.getVehicleno()+"</td><td>"+vv.getVehicletype()+"</td><td>"+vv.getBranch()+"</td><td>"+vv.getInsurance_expiry()+"</td><td>"+vv.getLast_serviced_date()+"</td><td>"+vv.getService_due_date()+"</td><td><a href='Updatevehicle.jsp?vno="+vv.getVehicleno()+"'>Update</a></td></tr>");
		}
		out.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
