/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giu;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dávid
 */
public class dir {
    public static void main(String[] args) {
     
        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);
            
        
    }
}
