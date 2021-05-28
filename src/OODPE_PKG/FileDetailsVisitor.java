package OODPE_PKG;

import OODPE_PKG.*;

/**
 * added by Shaul
 * May 24 2021
 * from slide 24 of OOPDE-W08Lec15 - Design patterns - Visitor.pptx, I understand that
 * I have to add a Visitor interface, thus FileDetail's accept would get a ref. to it as an argument,
 *      and call it's visit method.
 */
public interface FileDetailsVisitor {
    public void visit(DocxFileDetails docxFileDetails);
    public void visit(JpgFileDetails jpgFileDetails);
    public void visit(Mp3FileDetails mp3FileDetails);
    public void visit(PptxFileDetails pptxFileDetails);
    public void visit(TxtFileDetails txtFileDetails);
    public void visit(HtmlFileDetails htmlFileDetails);
    public void visit(DirectoryDetails directoryDetails);
}
