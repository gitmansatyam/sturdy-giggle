package day01_document_export;

public class DocumentExportService {

    private final ExportStrategy exportStrategy;

    public DocumentExportService(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    public void export(Document document) {
        exportStrategy.export(document);
    }
}