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
public class rawSchedule 
{
    SQLiteDatabase dbTemp = new SQLiteDatabase();
    
    Connection myCon = null;
    
    public void sort()
    {
        
        dbTemp.connectDatabase();
        
        dbTemp.TableQuery("insert actual code to do this here once database is done");
        
        dbTemp.disconnect(dbTemp.getMyCon());
        
    }
    
    
    
}
