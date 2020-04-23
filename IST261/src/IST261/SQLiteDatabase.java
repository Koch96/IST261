/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST261;


import PJSTGUIs.*;

import java.sql.*;
import java.util.Enumeration;
import javax.swing.JOptionPane;
/**
 *
 * @author Jacob Mullan
 */
public class SQLiteDatabase 
{
     private String filePath = jpLogin.class.getResource("/Database/SchoolDatabase.db").getFile();
    private Connection  myCon = null;
    private ResultSet rsUserdata= null;
    
    
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
           myCon = DriverManager.getConnection("JDBC:sqlite:" + filePath.substring(1));// connects to the database using the filepath
           
           
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
            
    public ResultSet loginInfo(String userName, String password)
    {
        ResultSet rsReturn = null;
        String query = "Select UserID, Password, Type From PERSONAL_USER"
              + " WHERE UserID = '" + userName + "' AND Password = '" + password + "'"
                ;
             try
        {
            
        Connection cTemp = getMyCon();
        if(cTemp!= null)
        {
            Statement QueryStmt = cTemp.createStatement();
            rsReturn = QueryStmt.executeQuery(query);
            
            rsUserdata = rsReturn;
        }// if
        
        }// try
        
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            
        }// catch
        
        return rsReturn;
    }// loginInfo
    
    public void checkLoginInfo(String userName, String password) 
    {
        ResultSet rsCheck = loginInfo(userName,password);
        System.out.println(rsCheck);
             try
        {
            
        
            if(rsCheck == null)
                {
                JOptionPane.showMessageDialog(null, "the information you put is incorrect");
                
                }
            else if(rsCheck.getString(1).equals(userName)  && rsCheck.getString(2).equals(password))
                {
                       String info = rsCheck.getString(3);
       
                            if(info.equals("Professor"))
                            {
                                 InstructorFrame mFrame = new InstructorFrame();
                                 mFrame.setVisible(true);
                            }
           
                             else
                            {
                                 ResistrarFrame mFrame = new ResistrarFrame();
                                 mFrame.setVisible(true);
                             }
       
                }
            else
                {
                JOptionPane.showMessageDialog(null, "the information you put is not working");
                
                }
            
        
        
        }// try
        
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            
        }// catch
            
    }//checkLoginInfo
    
    
   
    //prepared Statements 
           
    public ResultSet UserPref()
    {
        ResultSet rsReturn= null;
        String query = "Select UserID, PreferredClass, PreferredDay, PreferredTime  From PERSONAL_USER"
              
                ;
             try
        {
            
        Connection cTemp = getMyCon();
        if(cTemp!= null)
        {
            Statement QueryStmt = cTemp.createStatement();
            rsReturn = QueryStmt.executeQuery(query);
            
            
        }// if
        
        }// try
        
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            
        }// catch
        
        return rsReturn;
        
        
    }// userPref
    
    public void UpdateCourse(String Prof, String Course)
    {
        try
        {
            String stmt = "UPDATE Course "
                + "Set Prof = '" + Prof + "' "
                    + "Where CourseName = '" + Course + "'";
                
            
             Connection cTemp = getMyCon();
        if(cTemp!= null)
        {
            Statement QueryStmt = cTemp.createStatement();
              QueryStmt.executeUpdate(stmt);
            
            
        }// if
        
             }// try block
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }// catch SQLException
    }
    public void GenerateSchedule()
    {  
        
        ResultSet rsUserPref = UserPref();
        
        
         try
        {
           ResultSetMetaData rsMeta = rsUserPref.getMetaData();
           
           int colNum = rsMeta.getColumnCount();
           while(rsUserPref.next())
           {
           for(int intLCV = 1; intLCV <= colNum; intLCV++)
           {
               System.out.println(rsUserPref.getString("UserID"));
               
               switch(rsMeta.getColumnName(intLCV))
               {
                   case "PreferredClass":
                       UpdateCourse(rsUserPref.getString("UserID"), rsUserPref.getString(intLCV));
                       //System.out.println("PreferredClass = " + rsUserPref.getString(intLCV) );
                       
                       break;
                   case "PreferredDay":
                       System.out.println("PreferredDay = " + rsUserPref.getString(intLCV) );
                       break;
                   case "PreferredTime":
                       System.out.println("PreferredTime = " + rsUserPref.getString(intLCV) );
                       break;
                       
                   default:
               }
               
               
           }// for loop
        
           }// while
           
        }// try
        
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            
        }// catch
        
        
    }
    
    
    public void inputInstructorUpdate( String prefClass, String prefDay, String prefTime)
    {
        
        
        try
        {
            String stmt = "UPDATE PERSONAL_USER "
                + "Set PreferredClass = '" + prefClass 
                + "', PreferredDay = '" + prefDay 
                + "', PreferredTime = '" + prefTime + "' "
                + "WHERE UserID = '" + rsUserdata.getString(1) + "'";
            
             Connection cTemp = getMyCon();
        if(cTemp!= null)
        {
            Statement QueryStmt = cTemp.createStatement();
              QueryStmt.executeUpdate(stmt);
            
            
        }// if
            
        }// try block
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }// catch SQLException
        
    }// inputInstructorInfo Prepared statement    

    
             public void listDrivers()
   {
     
    Enumeration<Driver> myDrivers =  DriverManager.getDrivers();
    
   
   
      while (myDrivers.hasMoreElements())
      {
          System.out.println(myDrivers.nextElement().getClass().getName());
      }// while
              
   
 
   }// listDrivers
             
    public void disconnect()
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
