package com.bd.analytics.DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

public class DataCalls {

	public TreeMap<Integer, List<String>> getFullData(String path) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(path));
		ArrayList<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}
		TreeMap<Integer, List<String>> finPredctn = new TreeMap<Integer, List<String>>();
		List<String> predctn = null;
		int count = lines.size();
		for (int i = 0; i < count; i++) {
			predctn = new ArrayList<String>(Arrays.asList(lines.get(i).split(",")));
			finPredctn.put(i, predctn);
		}
		// Database sql connection code
		// DBConnectionManager dBM = new
		// DBConnectionManager("jdbc:mysql://localhost:3306/EnergyAnalysis",
		// "root", "");
		// Connection conn = dBM.getConnection();
		// Statement stmt = conn.createStatement();
		// System.out.println(finPredctn.size());
		// System.out.println(finPredctn.get(10).get(3));
		// Insert data in database table
		// for(int k=0; k<finPredctn.size(); k++){
		// String sql = "INSERT INTO weekday" + "VALUES()";
		// stmt.executeQuery(sql);
		// }
		// request.getSession().setAttribute("finalPrediction", finPredctn);
		// HttpSession session = request.getSession();
		// session.setAttribute("finalPrediction", finPredctn);
		return finPredctn;
	}

	public ArrayList<String> getSingleValue(String path) throws IOException {

		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(path));
		ArrayList<String> weekday = new ArrayList<String>();
		String line = null;
		while ((line = reader.readLine()) != null) {
			weekday.add(line);
		}
		// request.getSession().setAttribute("weekday", weekday);
		// HttpSession session = request.getSession();
		// session.setAttribute("weekday", weekday);
		return weekday;

	}
}
