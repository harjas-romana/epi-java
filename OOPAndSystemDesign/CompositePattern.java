// COMPOSITE PATTERN
// Composes objects into tree structures

import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    void display(int indent);

    int getSize();
}

class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "📄 " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "📁 " + name);
        for (FileSystemComponent component : components) {
            component.display(indent + 2);
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory images = new Directory("Images");

        File file1 = new File("Resume.pdf", 500);
        File file2 = new File("CoverLetter.docx", 200);
        File file3 = new File("Photo1.jpg", 2000);
        File file4 = new File("Photo2.png", 1500);

        documents.add(file1);
        documents.add(file2);
        images.add(file3);
        images.add(file4);

        root.add(documents);
        root.add(images);

        root.display(0);
        System.out.println("\nTotal size: " + root.getSize() + " KB");
    }
}
