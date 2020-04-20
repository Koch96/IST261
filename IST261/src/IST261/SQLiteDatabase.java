/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST261;

import java.sql.*;
/**
 *
 * @author Jacob Mullan
 */
public class SQLiteDatabase 
{
     private String filePath = SQLiteDatabase.class.getResource("/Database/SchoolDatabase.db").getFile();
    private Connection  myCon = null;

    
    
    public Connection getMyCon() 
    {
        return myCon;
    }// getMyCon

    
    
    public void setMyCon(Connection newMyCon)
    {
        myCon = newMyCon;
    }// setMyCon
    
    
    
    public String getFilePath() {
        return filePath;
    }// getFilePath

    
    
    public void setFilePath(String newFilePath) {
        filePath = newFilePath;
    }// setfilePath
    
    
    
    public void createDatabase()
    {
        
        
        try(Connection createCon = DriverManager.getConnection(filePath))
        {
            
            if (createCon != null) 
            {
                DatabaseMetaData meta = createCon.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A database has been created in " + filePath);
                
            }// Creates database if connection is not Null
            
        }
        
        catch(SQLException e)
        {
             System.out.println(e.getMessage());
        }//catches SQLException
        
        
    }// createDatabase
    
    
    
    public void connectDatabase()
    {
     // code followed  from  https://www.sqlitetutorial.net/sqlite-java/sqlite-jdbc-driver/
    
       
        try
        {
           myCon = DriverManager.getConnection("jbdc:sqlite:" + filePath.substring(1));// connects to the database using the filepath
           setMyCon(myCon);
           
           System.out.println("Connection has been established."); 
           
        }// try
        
        catch(SQLException myException)
        {
             System.out.println(myException.getMessage());
        }//
          
    }// connectDatabase
    
    
    
    // gotten from https://www.sqlitetutorial.net/sqlite-java/create-table/
    
    //table stuff
    
    public void createTable(String tableQuery)
    {
        String newTableQuery = tableQuery;
        
        try //(Connection myCon = DriverManager.getConnection(filePath))
        {
            Statement createTable = myCon.createStatement();
            createTable.execute(newTableQuery);
            System.out.println("A Table has been created");
        }//try to creat Table
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }// catch SQLException
    }// createTable
    
    
    
    public void DropTable(String tableQuery)
    {
        String newTableQuery = tableQuery;
        
        try //( myCon )
        {
            Statement createTable = myCon.createStatement();
            createTable.execute(newTableQuery);
            System.out.println("The table has been Dropped");
        }//try to Drop the Table
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }// catch SQLException
    }// DropTable
    
    
    
    public ResultSet TableQuery (String Query) 
    {
        ResultSet rsReturn = null;
        try
        {
            
        Connection cTemp = getMyCon();
        if(cTemp!= null)
        {
            Statement QueryStmt = cTemp.createStatement();
            rsReturn = QueryStmt.executeQuery(Query);
            
        }// if
        
        }// try
        
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            
        }// catch
        
        return rsReturn;
    }// TableQuery
            
    
    //prepared Statements 
           
    public void inputInstructorInfo( String prefClass, String prefDay, String prefTime)
    {
        String stmt = "INSERT INTO PERSONAL_USER ( PreferredClass, PreferredDay, PreferredTime) VALUES( ?, ?, ?)";
        
        try
        {
            PreparedStatement preStmt = myCon.prepareStatement(stmt);
            
            preStmt.setString(1, prefClass);
            preStmt.setString(2,prefDay);
            preStmt.setString(3,  prefTime);
            preStmt.executeUpdate();
            
        }// try block
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }// catch SQLException
        
    }// inputInstructorInfo Prepared statement    

    
            
    public void disconnect(Connection myCon)
    {
        
        
         try {
                if (myCon != null) 
                {
                    myCon.close();// closes the connection
                    System.out.println("Connection has been closed.");
                }// if (myCon != null)
            } // try
            
            catch (SQLException ex) 
            {
                System.out.println(ex.getMessage());
            }//catch
    }//disconnect
    
    
}//SQLiteDatabase
