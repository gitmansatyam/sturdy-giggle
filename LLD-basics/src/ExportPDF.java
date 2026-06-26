public class ExportPDF implements ExportStrategy {

    public ExportPDF() {
    }
    @Override
    public void exportDocument() {
        System.out.println("PDF document exported");
        return;
    }
}
