public class DocumentService {
    private ExportStrategy strategy;
    DocumentService(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    public void exportDocument() {
       strategy.exportDocument();
       return;
    }

}
