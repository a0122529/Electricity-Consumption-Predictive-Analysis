package com.bd.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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
public class OtherValueReaderController {

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws IOException
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * 
	 * @throws FileNotFoundException
	 */

	@RequestMapping(value = "/nextDayConsumption", method = RequestMethod.GET)
	public String nextDayConsumption(Model model, HttpServletRequest request)
			throws IOException, ClassNotFoundException, SQLException {

		DataCalls dc = new DataCalls();
		ArrayList<String> ndc = dc
				.getSingleValue("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/nextDayConsumptn");
		HttpSession session = request.getSession();
		session.setAttribute("ndc", ndc);
		return "nextDayConsumption";
	}

	@RequestMapping(value = "/revenueLoss", method = RequestMethod.GET)
	public String revenueLoss(Model model, HttpServletRequest request)
			throws IOException, ClassNotFoundException, SQLException {

		DataCalls dc = new DataCalls();
		ArrayList<String> rl = dc
				.getSingleValue("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/revenueLoss");
		HttpSession session = request.getSession();
		session.setAttribute("rl", rl);
		return "revenueLoss";
	}

	@RequestMapping(value = "/deviceUsagePattern", method = RequestMethod.GET)
	public String deviceUsagePattern(Model model, HttpServletRequest request)
			throws IOException, ClassNotFoundException, SQLException {

		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> dup = dc.getFullData(
				"/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/yearly_consumption.csv");
		HttpSession session = request.getSession();
		session.setAttribute("dup", dup);
		System.out.println(dup.size());
		return "deviceUsagePattern";
	}
}
