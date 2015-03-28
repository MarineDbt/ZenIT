package ConnectionToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Elie Gallet
 *
 */
public class ConnectionToMySQL
{	
	
	/**
	 * Static attribute representing the database url
	 */
	private static final String url = "jdbc:mysql://zenitdatabase.cowyokdz4iwa.us-west-2.rds.amazonaws.com:3306/zenitdatabase";
	
	/**
	 * Static attribute representing the database user name
	 */
	private static final String login = "zenit";
	
	/**
	 * Static attribute representing the database password
	 */
    private static final String pwd = "zenitdatabase";
    
    /**
     * Static attribute representing the connection
     */
    private static Connection connection = null;
    
    public static void close() {
	    if (connection != null)
	        try {
	            connection.close();
	        } catch ( SQLException ignore ) {
	        	// TODO : error handling
	        }
    }
    
    /** 
     * Static method which opens a connection to the database 
     * 
     */
    public static void open() {
		
    	/* Driver Loading*/
		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
		} catch ( ClassNotFoundException e ) {
		    // TODO : error handling
		}
		
		/*Connection Opening*/
    	try {
   
		    connection = DriverManager.getConnection( url, login, pwd );
		
		} catch ( SQLException e ) {
			// TODO : error handling
		}
    }
    
    /**
     * Static method which requests the server to make a SELECT query on the database
     * 
     */
    public static ResultSet requestSelectQuery(String query) {
    	
    /* Requirements */
    	if (connection == null) // make sure the connection is opened
    		open();	
    	
    /*Declarations & Initializations */
    	ResultSet resultat = null;
    	Statement statement = null;
   
    /* Query Execution */
    	try {
			statement = connection.createStatement();
			resultat = statement.executeQuery(query);
		} catch (SQLException e1) {
			// TODO : error handling
		}
    	
    /* Return Value */
    	return resultat;
    }
    
    
    /**
     * Static method which requests the server to make a INSERT query on the database
     * 
     */
    public static int requestInsertQuery(String query) {
    	
    	
    	
    /* Requirements */
    	if (connection == null)
    		open();
    	
    /* Declarations & Initializations*/
    	int status = 0;
    	Statement statement = null;
    	
    /* Query Execution */	
    	try {
    		System.out.println("hi");
			statement = connection.createStatement();
			System.out.println("hi2");
			System.out.println(query);
			status = statement.executeUpdate(query);
			System.out.println("hi3");
		} catch (SQLException e1) {
			// TODO : error handling
		}

    /* Return Value */	
    	return status;
    }
}