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
    
    //creates database for course scheduling
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
    
    //connects to database
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
        }//catch SQLException
          
    }// connectDatabase
    
    // gotten from https://www.sqlitetutorial.net/sqlite-java/create-table/
    
    //table stuff
    
    //creates a table in the database
    public void createTable(String tableQuery)
    {
        String newTableQuery = tableQuery;
        
        try //(Connection myCon = DriverManager.getConnection(filePath))
        {
            Statement createTable = myCon.createStatement();
            createTable.execute(newTableQuery);
            System.out.println("A Table has been created");
        }//try to create Table
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }// catch SQLException
    }// createTable
    
    //drops a table from the database
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
    
    //returns table of database queries
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
    
    //sets user login info
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
    
    //validates user login info
    public void checkLoginInfo(String userName, String password) 
    {
        ResultSet rsCheck = loginInfo(userName,password);
        System.out.println(rsCheck);
             try
        {
            
        
            if(rsCheck == null)
                {
                JOptionPane.showMessageDialog(null, "the information you put is incorrect");
                
                }// rsCheck is null
            else if(rsCheck.getString(1).equals(userName)  && rsCheck.getString(2).equals(password))
                {
                       String info = rsCheck.getString(3);
       
                            //if user is a professor
                            if(info.equals("Professor"))
                            {
                                 InstructorFrame mFrame = new InstructorFrame();
                                 mFrame.setVisible(true);
                            }
           
                            //if user is a registrar
                             else
                            {
                                 RegistrarFrame mFrame = new RegistrarFrame();
                                 mFrame.setVisible(true);
                             }
       
                }// if username and password are valid
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
    
    //sets user preferences       
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
    
    //updates course preference
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
    
    //generates schedule
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
                       if(rsUserPref.getString(intLCV) != null)
                       {
                            UpdateCourse(rsUserPref.getString("UserID"), rsUserPref.getString(intLCV));
                       }
                       //System.out.println("PreferredClass = " + rsUserPref.getString(intLCV) );
                       
                       break;
                   case "PreferredDay":
                       
                       break;
                   case "PreferredTime":
                       
                       break;
                       
                   default:
               }// switch
               
               
           }// for loop
        
           }// while
           
        }// try
        
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            
        }// catch
        
        
    }//Generate schedule
    
    //sets course information
    public ResultSet CourseInfo()
    {
        ResultSet rsReturn= null;
        String query = "Select * from Course"
              
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
        
        
    }// CourseInfo
    
    //checks course information
    public String checkCourseInfo(ResultSet CourseInfo)
    {
         ResultSet rsCourseInfo = CourseInfo;
         StringBuilder sbReturn = new StringBuilder();
        
         try
        {
           ResultSetMetaData rsMeta = rsCourseInfo.getMetaData();
           
           int colNum = rsMeta.getColumnCount();
           while(rsCourseInfo.next())
           {
           for(int intLCV = 1; intLCV <= colNum; intLCV++)
           {
               if(rsMeta.getColumnLabel(intLCV).equals("CourseNum"))
               {
                   sbReturn.append("\n");
               }
               
               sbReturn.append(rsMeta.getColumnLabel(intLCV) +
               " = " + rsCourseInfo.getString(intLCV));
               sbReturn.append("\n");

           }// for loop
        
           }// while
           
        }// try
        
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            
        }// catch
        
         return sbReturn.toString();
    }// checkCourseInfo
    
    //updates instructor info
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

    //lists database drivers
    public void listDrivers()
   {
     
    Enumeration<Driver> myDrivers =  DriverManager.getDrivers();
    
   
   
      while (myDrivers.hasMoreElements())
      {
          System.out.println(myDrivers.nextElement().getClass().getName());
      }// while
              
   
 
   }// listDrivers
    
   //disconnects from database
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
