/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;

import java.io.File;

/**
 *
 * @author hadin
 */
public class TeyhuFileOperations {
    private File file;
    private final String rootPath = System.getProperty("user.home") + "/LibraryManager/";
    
    public TeyhuFileOperations(){
        
        //create directories
        file = new File(rootPath);
        try{
        if(!file.exists())
            file.mkdir();
        }catch(Exception e){
            e.getMessage();
        }
        
    }
}
