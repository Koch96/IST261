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
 * @version 0.1
 * @since Mar 5, 2020 1:08:19 PM
 * 
 */

/**           MODIFICATION LOG

    Mar 5, 2020 Initial File Creation at 1:08:19 PM

*/


public class Test 
{
    public static void main(String[] args) 
    {
        SQLiteDatabase dTemp = new SQLiteDatabase();
        dTemp.listDrivers();
        
        dTemp.connectDatabase();
        
        System.out.println(dTemp.getFilePath());
       
    }

}// class Test