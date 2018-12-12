/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author hadin
 */
public class LibraryManagerDate {
    private Date date;
    
    public LibraryManagerDate(){
        date = new Date();
    }
    
    public Date getDate(){
        return date;
    }
    
    public String getTableModifiedDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return dateFormat.format(date);
    }
}
