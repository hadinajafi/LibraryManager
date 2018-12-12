/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;

import java.util.ArrayList;

/**
 *
 * @author hadin
 */
public class FileObject {
    private String name;
    private LibraryManagerDate modDate;
    private Types type;
    private int size;
    private LibraryManagerDate accessedDate;
    private Category category;
    private ArrayList<String> tags;
}
