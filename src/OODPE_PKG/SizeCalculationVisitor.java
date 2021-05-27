package OODPE_PKG;

public class SizeCalculationVisitor implements FileDetailsVisitor {
    private int size = 0;
    public int getSize() { return this.size; }

    @Override
    public void visit(DocxFileDetails docxFileDetails) { this.size += docxFileDetails.getSize(); }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) { this.size += jpgFileDetails.getSize(); }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) { this.size += mp3FileDetails.getSize(); }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) { this.size += pptxFileDetails.getSize(); }

    @Override
    public void visit(TxtFileDetails txtFileDetails) { this.size += txtFileDetails.getSize(); }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        if (directoryDetails.itsFiles != null) {
            size += directoryDetails.itsFiles.size();
        }
    }
}
