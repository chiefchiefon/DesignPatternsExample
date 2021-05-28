package OODPE_PKG;

public class FileCountVisitor implements FileDetailsVisitor{
    private int filesCounter = 0;
    public int getFilesCounter() { return this.filesCounter; }

    @Override
    public void visit(DocxFileDetails docxFileDetails) { this.filesCounter++; }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) { this.filesCounter++; }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) { this.filesCounter++; }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) { this.filesCounter++; }

    @Override
    public void visit(TxtFileDetails txtFileDetails) { this.filesCounter++; }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) { this.filesCounter++; }

    @Override
    public void visit(DirectoryDetails directoryDetails) { }
}
