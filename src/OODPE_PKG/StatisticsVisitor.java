package OODPE_PKG;
// https://dzone.com/articles/java-string-format-examples

public class StatisticsVisitor implements FileDetailsVisitor {
//    private String fileStatisticsString = "";

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        System.out.printf("The file " + docxFileDetails.getName()
                + " has an average of " + 1.0 * docxFileDetails.getWords() / docxFileDetails.getPages()
                +  " words per page.");
//        this.fileStatisticsString = String.format("%s words: %s, %d bytes",
//                docxFileDetails.getName(),
//                docxFileDetails.getWords(),
//                docxFileDetails.getSize());
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
//        this.fileStatisticsString = String.format("%s %dX%d, %d bytes",
//                jpgFileDetails.getName(),
//                jpgFileDetails.getWidth(),
//                jpgFileDetails.getHeight(),
//                jpgFileDetails.getSize());
        System.out.println("The picture " + jpgFileDetails.getName()
                + " has an average of " +
                1.0 * jpgFileDetails.getSize() / (jpgFileDetails.getHeight() * jpgFileDetails.getWidth())
                + " bytes per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
//        this.fileStatisticsString =
//                "The bitrate of " + mp3FileDetails.getName()
//                + " is " + mp3FileDetails.getSize() / mp3FileDetails.getLengthSec() + ".";
        System.out.println("The bitrate of " + mp3FileDetails.getName()
                + " is " + 1.0 * mp3FileDetails.getSize() / mp3FileDetails.getLengthSec() + ".");
//        this.fileStatisticsString = String.format("%s length in seconds: %d, %d bytes",
//                mp3FileDetails.getName(),
//                mp3FileDetails.getLengthSec(),
//                mp3FileDetails.getSize());
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
//        this.fileStatisticsString = String.format("%s slides: %d, %d bytes",
//                pptxFileDetails.getName(),
//                pptxFileDetails.getSlides(),
//                pptxFileDetails.getSize());
        System.out.println("The average slide size in Presentation " + pptxFileDetails.getName()
                +" is " + 1.0 * pptxFileDetails.getSize() / pptxFileDetails.getSlides());
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
//        this.fileStatisticsString = String.format("%s words: %d, %d bytes",
//                txtFileDetails.getFullName(),
//                txtFileDetails.getWords(),
//                txtFileDetails.getSize());
        System.out.println("The file " + txtFileDetails.getName()
                + " contains " + txtFileDetails.getWords() + " words.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
//        this.fileStatisticsString = String.format("%s lines: %d, %d bytes",
//                htmlFileDetails.getName(),
//                htmlFileDetails.getLines(),
//                htmlFileDetails.getSize());
        System.out.println("The file " + htmlFileDetails.getName()
                + " contains " + htmlFileDetails.getLines() + " lines.");
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        System.out.println("Directory " + directoryDetails.getName()
                +" has " + directoryDetails.itsFiles.size() + " files.");
//        for (FileDetails file : directoryDetails.itsFiles) {
//            this.fileStatisticsString.concat("\n");
//            this.fileStatisticsString.concat(file.getName());
        }

//    @Override
//    public String toString() {
//        return fileStatisticsString;
////        return "StatisticsVisitor{" +
////                "fileStatisticsString='" + fileStatisticsString + '\'' +
////                '}';
//    }
}
