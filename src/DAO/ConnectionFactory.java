/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author l_dsb
 */
public class ConnectionFactory {
    
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String HOST = null;
    private static String PORTA = null;
    private static String BD = null;
    private static String USER = null;
    private static String PASS = null;

    public static Connection getConnection() {
        try {
            
            Class.forName(DRIVER);
            
            return DriverManager.getConnection("jdbc:mysql://" + getHOST() + ":" + getPORTA() + "/" + getBD() + "?serverTimezone=UTC", getUSER(), getPASS());
            
        } catch (Exception e) {
            
            throw new RuntimeException(e.getMessage());
            
        }
        
    }

    /**
     * @param aDRIVER the DRIVER to set
     */
    public static void setDRIVER(String aDRIVER) {
        DRIVER = aDRIVER;
    }

    /**
     * @param aHOST the HOST to set
     */
    public static void setHOST(String aHOST) {
        HOST = aHOST;
    }

    /**
     * @param aPORTA the PORTA to set
     */
    public static void setPORTA(String aPORTA) {
        PORTA = aPORTA;
    }

    /**
     * @param aBD the BD to set
     */
    public static void setBD(String aBD) {
        BD = aBD;
    }

    /**
     * @param aUSER the USER to set
     */
    public static void setUSER(String aUSER) {
        USER = aUSER;
    }

    /**
     * @param aPASS the PASS to set
     */
    public static void setPASS(String aPASS) {
        PASS = aPASS;
    }

    /**
     * @return the DRIVER
     */
    public static String getDRIVER() {
        return DRIVER;
    }

    /**
     * @return the HOST
     */
    public static String getHOST() {
        return HOST;
    }

    /**
     * @return the PORTA
     */
    public static String getPORTA() {
        return PORTA;
    }

    /**
     * @return the BD
     */
    public static String getBD() {
        return BD;
    }

    /**
     * @return the USER
     */
    public static String getUSER() {
        return USER;
    }

    /**
     * @return the PASS
     */
    public static String getPASS() {
        return PASS;
    }
    
}
