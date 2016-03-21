package com.bd.analytics;

import java.io.IOException;
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
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> finalPrediction2012 = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/total2012data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("finalPrediction2012", finalPrediction2012);

		// DataCalls dc1 = new DataCalls();
		// ArrayList<String> year2012Prev = dc1.getSingleValue(
		// "/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction
		// Files/prevyear2011data.csv");
		// session.setAttribute("year2012Prev", year2012Prev);
		return "index";

	}

	@RequestMapping(value = "/predctn2013", method = RequestMethod.GET)
	public String Predctn2013(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> finalPrediction2013 = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/total2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("finalPrediction2013", finalPrediction2013);

		// DataCalls dc1 = new DataCalls();
		// ArrayList<String> year2012Prev = dc1.getSingleValue(
		// "/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction
		// Files/prevyear2011data.csv");
		// session.setAttribute("year2012Prev", year2012Prev);
		return "predictionYear2013";
	}

	@RequestMapping(value = "/january", method = RequestMethod.GET)
	public String january(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> jan = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/jan2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("jan", jan);
		return "january";
	}

	@RequestMapping(value = "/feburary", method = RequestMethod.GET)
	public String feburary(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> feb = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/feb2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("feb", feb);
		return "feburary";
	}

	@RequestMapping(value = "/march", method = RequestMethod.GET)
	public String march(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> mar = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/mar2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("mar", mar);
		return "march";
	}

	@RequestMapping(value = "/april", method = RequestMethod.GET)
	public String april(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> apr = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/apr2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("apr", apr);
		return "april";
	}

	@RequestMapping(value = "/may", method = RequestMethod.GET)
	public String may(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> may = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/may2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("may", may);
		return "may";
	}

	@RequestMapping(value = "/june", method = RequestMethod.GET)
	public String june(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> june = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/june2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("june", june);
		return "june";
	}

	@RequestMapping(value = "/july", method = RequestMethod.GET)
	public String july(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> july = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/july2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("july", july);
		return "july";
	}

	@RequestMapping(value = "/august", method = RequestMethod.GET)
	public String august(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> aug = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/aug2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("aug", aug);
		return "august";
	}

	@RequestMapping(value = "/september", method = RequestMethod.GET)
	public String september(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> sep = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/sep2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("sep", sep);
		return "september";
	}

	@RequestMapping(value = "/october", method = RequestMethod.GET)
	public String october(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> oct = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/oct2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("oct", oct);
		return "october";
	}

	@RequestMapping(value = "/november2013", method = RequestMethod.GET)
	public String november2013(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> nov13 = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/nov2013data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("nov13", nov13);
		return "november2013";
	}

	@RequestMapping(value = "/november2012", method = RequestMethod.GET)
	public String november2012(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> nov12 = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/nov2012data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("nov12", nov12);
		return "november2012";
	}

	@RequestMapping(value = "/december2012", method = RequestMethod.GET)
	public String december(Model model, HttpServletRequest request) throws IOException {
		DataCalls dc = new DataCalls();
		TreeMap<Integer, List<String>> dec = dc
				.getFullData("/Users/kshitijkaushik/Documents/BigDataAnalytics/Prediction Files/dec2012data.csv");
		HttpSession session = request.getSession();
		session.setAttribute("dec", dec);
		return "december";
	}

}
