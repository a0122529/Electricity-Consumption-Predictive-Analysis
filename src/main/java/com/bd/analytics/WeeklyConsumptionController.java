package com.bd.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bd.analytics.DAO.DataCalls;

/**
 * Handles requests for the application home page.
 */
@Controller
public class WeeklyConsumptionController {

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws IOException
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * 
	 * @throws FileNotFoundException
	 */

	@RequestMapping(value = "/weekday", method = RequestMethod.GET)
	public String weekday(Model model, HttpServletRequest request)
			throws IOException, ClassNotFoundException, SQLException {
		DataCalls dc = new DataCalls();
		ArrayList<String> weekday = dc
				.getSingleValue("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/weekday");
		HttpSession session = request.getSession();
		session.setAttribute("weekday", weekday);
		return "weekday";
	}

	@RequestMapping(value = "/weekend", method = RequestMethod.GET)
	public String weekend(Model model, HttpServletRequest request)
			throws IOException, ClassNotFoundException, SQLException {
		DataCalls dc = new DataCalls();
		ArrayList<String> weekend = dc
				.getSingleValue("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/weekend");
		HttpSession session = request.getSession();
		session.setAttribute("weekend", weekend);
		return "weekend";
	}
}
