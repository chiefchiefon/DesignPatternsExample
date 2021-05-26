package OODPE_PKG;

import java.util.HashSet;
import java.util.Set;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    public DirectoryDetails(String path, String name){
        super(path,name);
    }

//    public DirectoryDetails(String path, String name) {
//        this.name = name;
//        this.path = path + DELIMITER + name;
//    }

//    private static final char DELIMITER = '\\';
//    // consider generalizing path folders separator

    Set<FileDetails> itsFiles = null;

    @Override
    public void accept(FileDetailsVisitor fileDetailsVisitor) {
        for (FileDetails fileDetails : this.itsFiles) {
            fileDetails.accept(fileDetailsVisitor);
        }
        fileDetailsVisitor.visit(this);
    }

    public void addFile(FileDetails fileDetails){
        // completed
        if (itsFiles == null) {
            itsFiles = new HashSet<FileDetails>();
        }
        itsFiles.add(fileDetails);
    }
}