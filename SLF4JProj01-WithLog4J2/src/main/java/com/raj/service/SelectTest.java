package com.raj.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectTest {

	//Logger object
	private static Logger logger = LoggerFactory.getLogger(SelectTest.class);

	//Query
	private static final String GET_EMPS = "SELECT EMPNO, ENAME,JOB,SAL FROM EMP";

	public static void main(String[] args) {

		logger.debug("start of main(-) method, application");

		try(  //establish the connection
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","c##asha" ,"asha");){	

			logger.info("Connection with SB s/w is established");

			try(//create PreparedStatement object
					PreparedStatement pstmt = con.prepareStatement(GET_EMPS);){

				logger.debug("PreparedStatement object is created");
				try(//execute the query
						ResultSet rs = pstmt.executeQuery();){

					logger.debug("ResultSet object is created");

					//the process the ResultSet object

					while(rs.next()) {

						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
					}

					logger.warn("Its better to Process the ResultSet Data directly with getXxx() methods, not as String values");
					logger.debug("ResultSet object is processed");

				}//try3
			}//try2
		}//try1
		catch (SQLException se) { //To handle known exception

			logger.error("DB Problem:: "+se.getMessage());
			se.printStackTrace();
		}
		catch (Exception e) { //To handle Unknowns exception

			logger.error("Unknown DB Problem:: "+e.getMessage());
			e.printStackTrace();
		}
		
		logger.debug("end of main(-) method");
	}//main
}//class
