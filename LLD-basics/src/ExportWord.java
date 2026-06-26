public class ExportWord implements ExportStrategy {

    public ExportWord() {
    }

    @Override
    public void exportDocument() {
        System.out.println("Word Document Exported");
        return;
    }
}