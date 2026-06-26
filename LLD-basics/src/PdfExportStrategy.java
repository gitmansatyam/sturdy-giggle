public class PdfExportStrategy implements ExportStrategy {

    @Override
    public void export(Document document) {
        System.out.println("Exporting document as PDF");
        System.out.println("Title: " + document.getTitle());
        System.out.println("Author: " + document.getAuthor());
        System.out.println("Content: " + document.getContent());
    }
}