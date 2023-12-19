package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
import in.co.rays.utill.DataUtility;

@WebServlet("/UserRegistrationCtl")

public class UserRegistrationCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("UserRagestration.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String username = req.getParameter("loginId");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(username);
		System.out.println(password);
		System.out.println(dob);
		System.out.println(address);

		UserBean bean = new UserBean();
		bean.setFirst_name(fname);
		bean.setLast_name(lname);
		bean.setLogin_id(username);
		bean.setPassword(password);
		bean.setDob(DataUtility.stringToDate(dob));
		bean.setAddress(address);

		UserModel model = new UserModel();

		try {

			model.add(bean);

		} catch (Exception e) {

			e.printStackTrace();
		}

		// resp.sendRedirect("UserRagestration.jsp");
		req.setAttribute("bean", bean);
		req.setAttribute("msg", "User Registered Successfully..!!");
		RequestDispatcher rd = req.getRequestDispatcher("UserRagestration.jsp");
		rd.forward(req, resp);

	}

}
