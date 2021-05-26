package OODPE_PKG;

// TODO: add visitor pattern (visitor classes and accept function to all class-hierarchy).
//  Do not add any functionality to the FileDetails hierarchy apart from the visitor pattern implementation.
public abstract class FileDetails {
    protected String name;
    private String path;
    public FileDetails(String path, String fileName) {
        this.path= path==null?"":path.substring(0, path.length()-1);
        this.name = fileName;
    }
    public String getName() {
        return name;
    }

    public String getFullName(){
        return (path.isEmpty()?"":path+"/")+name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPath() {
        return path;
    }

    /**
     * added by Shaul
     * May 24 2021
     * from slide 24 of OOPDE-W08Lec15 - Design patterns - Visitor.pptx, I understand that
     * 1) I have to declare accept method in FileDetails, and implement it in every extending class.
     * 2) I have to add a Visitor interface, thus accept would get a ref. to it as an argument,
     *      and call it's visit method.
     */

    public abstract void accept(FileDetailsVisitor fileDetailsVisitor);
}
