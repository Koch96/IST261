/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST261;

import java.sql.*;
/**
 *
 * @author Jake_Gaming_PC
 */
public class SQLiteDatabase 
{
     private String filePath = "";

    public String getFilePath() 
    {
        return filePath;
    }//getFilePath

    public void setFilePath(String newFilePath) 
    {
        filePath = newFilePath;
    }//setFilePath
    
      public void createDatabase()
    {
        
        
        try(Connection myCon = DriverManager.getConnection(filePath))
        {
            
            if (myCon != null) 
            {
                DatabaseMetaData myMeta = myCon.getMetaData();
                System.out.println("The driver name is " + myMeta.getDriverName());
                System.out.println("A database has been created in " + filePath);
                
            }// Creates database if connection is not Null
        }
        
        catch(SQLException e)
        {
             System.out.println(e.getMessage());
        }//catches SQLException
        
        
    }// createDatabase with defultFilePath
      
      public void createDatabase(String newFilePath)
    {
        
        
        try(Connection myCon = DriverManager.getConnection(newFilePath))
        {
            
            if (myCon != null) 
            {
                DatabaseMetaData myMeta = myCon.getMetaData();
                System.out.println("The driver name is " + myMeta.getDriverName());
                System.out.println("A database has been created in " + newFilePath);
                
            }// Creates database if connection is not Null
        }
        
        catch(SQLException e)
        {
             System.out.println(e.getMessage());
        }//catches SQLException
        
        
    }// createDatabase with String newFilePath
      
       public void createTable(String tableSQL)
    {
        String newTableSQL = tableSQL;
        
        try(Connection myCon = DriverManager.getConnection(filePath))
        {
            Statement createTable = myCon.createStatement();
            createTable.execute(newTableSQL);
            System.out.println("A Table has been created");
        }//try to creat Table
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }// catch SQLException
    }// createTable
    
    public void DropTable(String tableSQL)
    {
        String newTableSQL = tableSQL;
        
        try(Connection myCon = DriverManager.getConnection(filePath))
        {
            Statement createTable = myCon.createStatement();
            createTable.execute(newTableSQL);
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
        try(Connection myCon = DriverManager.getConnection(filePath))
        {
            
        Connection cTemp = myCon;
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
    
    
    
    
}//SQLiteDatabase
