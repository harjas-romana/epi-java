// TEMPLATE METHOD PATTERN
// Defines the skeleton of an algorithm in a base class and lets subclasses fill in the details

public class TemplateMethodPattern {

    // Abstract base class that defines the algorithm skeleton
    abstract static class DataProcessor {

        // Template method - defines the algorithm structure
        public final void processData(String fileName) {
            openFile(fileName);
            readData();
            processData();
            closeFile();
            System.out.println("Processing complete!\n");
        }

        // Common steps (can be overridden)
        protected void openFile(String fileName) {
            System.out.println("Opening file: " + fileName);
        }

        protected void closeFile() {
            System.out.println("Closing file");
        }

        // Abstract methods that subclasses must implement
        protected abstract void readData();

        protected abstract void processData();
    }

    // Concrete subclass for CSV processing
    static class CSVDataProcessor extends DataProcessor {

        @Override
        protected void readData() {
            System.out.println("Reading CSV data...");
            System.out.println("Parsed rows: [header1, header2, header3]");
        }

        @Override
        protected void processData() {
            System.out.println("Processing CSV: Validating columns and data types");
            System.out.println("Data validation passed");
        }
    }

    // Concrete subclass for JSON processing
    static class JSONDataProcessor extends DataProcessor {

        @Override
        protected void readData() {
            System.out.println("Reading JSON data...");
            System.out.println("Parsed objects: [{ id: 1 }, { id: 2 }]");
        }

        @Override
        protected void processData() {
            System.out.println("Processing JSON: Validating schema and structure");
            System.out.println("Schema validation passed");
        }
    }

    // Concrete subclass for XML processing
    static class XMLDataProcessor extends DataProcessor {

        @Override
        protected void readData() {
            System.out.println("Reading XML data...");
            System.out.println("Parsed elements: [root > element1, element2]");
        }

        @Override
        protected void processData() {
            System.out.println("Processing XML: Validating DTD and tags");
            System.out.println("XML validation passed");
        }

        // Override to add custom behavior
        @Override
        protected void closeFile() {
            System.out.println("Closing XML file with cleanup");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Template Method Pattern Demo ===\n");

        // Process CSV
        System.out.println("--- Processing CSV ---");
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.processData("data.csv");

        // Process JSON
        System.out.println("--- Processing JSON ---");
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.processData("data.json");

        // Process XML
        System.out.println("--- Processing XML ---");
        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.processData("data.xml");
    }
}
