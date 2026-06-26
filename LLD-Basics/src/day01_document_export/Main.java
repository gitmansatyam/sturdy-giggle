package day01_document_export;

public class Main {

    public static void main(String[] args) {

        Document document = new Document(
                "LLD Notes",
                "Strategy Pattern helps us make behavior interchangeable.",
                "Satyam"
        );

        ExportStrategy pdfStrategy = new PdfExportStrategy();

        DocumentExportService exportService =
                new DocumentExportService(pdfStrategy);

        exportService.export(document);
    }
}