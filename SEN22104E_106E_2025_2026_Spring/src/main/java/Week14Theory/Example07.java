/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example07 {
    public static void main(String[] args) {
        String pathDef1="c:\\files\\pasaj1"; 
        Path p1=Paths.get(pathDef1); 
        try {
            Files.delete(p1);
        } catch (NoSuchFileException e){
            System.out.println("File not found");
        } catch (DirectoryNotEmptyException e){
            System.out.println("Directory is not empty");
        }catch(FileSystemException e){
            System.out.println("File is used");
        } 
        catch (IOException ex) {
            System.getLogger(Example07.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
