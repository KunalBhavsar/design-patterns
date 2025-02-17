# Introduction

The Factory Method Pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created. This pattern is used when a class cannot anticipate the type of objects it needs to create or when the object creation process is complex. It is particularly useful for managing and maintaining a large codebase by encapsulating object creation in a single method, promoting loose coupling, and making the system more extensible.

## Key Characteristics:

- **Delegates Object Creation**: The responsibility for object creation is delegated to a method, allowing the creation process to be deferred to subclasses or other classes that implement the method.
- **Decouples Object Creation**: It decouples the class instantiation process from the code that uses the objects, promoting flexibility and reducing dependencies.
- **Extensibility**: New object types can be added without modifying the existing code by creating new subclasses that implement the factory method.

## Structure:

- **Creator (Abstract Class or Interface)**: Declares the factory method, which returns an object of type Product. This method may or may not have a default implementation.
- **ConcreteCreator (Subclass)**: Implements the factory method to create specific instances of the Product.
- **Product (Interface or Abstract Class)**: Defines the structure and behavior of objects that the factory method creates.
- **ConcreteProduct (Subclass)**: Implements the Product interface, representing the specific type of object the creator produces.

## Advantages:

- **Separation of Concerns**: The pattern separates the creation of objects from their usage, which makes the code easier to maintain and extend.
- **Flexibility**: Subclasses can alter the type of object that will be created by overriding the factory method, providing a high level of flexibility.
- **Open/Closed Principle**: The Factory Method adheres to the Open/Closed principle, allowing the system to be extended with new types of objects without modifying existing code.
- **Code Reusability**: The factory method centralizes object creation, making it easier to reuse the logic for creating similar objects.

## Usage/Examples

Consider a Document Generator system that generates different types of documents such as PDF, Word, and HTML. The Document interface defines the common structure for all document types, and the concrete classes like PdfDocument, WordDocument, and HtmlDocument implement the Document interface.

The Factory Method is implemented in DocumentCreator classes like PdfDocumentCreator, WordDocumentCreator, and HtmlDocumentCreator that produce the corresponding document types based on user input.

```java
// Product
public interface Document {
    void create();
}

// ConcreteProduct
public class PdfDocument implements Document {
    @Override
    public void create() {
        System.out.println("PDF Document Created");
    }
}

public class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Word Document Created");
    }
}

public class HtmlDocument implements Document {
    @Override
    public void create() {
        System.out.println("HTML Document Created");
    }
}

// Creator
public abstract class DocumentCreator {
    public abstract Document createDocument();
}

// ConcreteCreator
public class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

public class HtmlDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new HtmlDocument();
    }
}

public class Client {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PdfDocumentCreator();
        Document pdf = pdfCreator.createDocument();
        pdf.create();  // Output: PDF Document Created

        DocumentCreator wordCreator = new WordDocumentCreator();
        Document word = wordCreator.createDocument();
        word.create();  // Output: Word Document Created
    }
}
```

## Explanation:

- **Product Interface**: The Document interface defines the common method create(), which will be implemented by all concrete document types (PDF, Word, HTML).
- **ConcreteProduct Classes**: These classes (PdfDocument, WordDocument, HtmlDocument) implement the Document interface, each providing their own create() implementation.
- **Creator Class**: The DocumentCreator abstract class defines the factory method createDocument(), which will be implemented by concrete creator classes to instantiate different types of documents.
- **ConcreteCreator Classes**: The PdfDocumentCreator, WordDocumentCreator, and HtmlDocumentCreator classes override the createDocument() method to return instances of their respective document types.

In the client code, we use the concrete creator (PdfDocumentCreator, WordDocumentCreator, etc.) to create specific document types without knowing the exact class that will be instantiated. This allows flexibility in adding new document types in the future without changing the client code.

## Real-World Example:

- GUI Frameworks: In GUI frameworks, the Factory Method can be used to create different types of UI components (like buttons, checkboxes) depending on the platform (Windows, Mac, Linux) without altering the core application logic.
- Vehicle Manufacturing: A vehicle manufacturing system could use a Factory Method to create different types of vehicles (car, truck, motorcycle) based on user specifications.

## Conclusion:

The Factory Method Pattern provides a flexible and efficient way to create objects without specifying the exact class of object that will be created. By delegating object creation to subclasses, it promotes extensibility, flexibility, and maintainability. It’s particularly useful in scenarios where the exact type of object to be created can vary based on some external condition, and allows for easier code management as the system evolves.
