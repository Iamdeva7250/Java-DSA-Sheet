import java.util.*;
import java.io.*;

public class ImplementUNDOREDO {
    
    // Your code here
     private StringBuilder doc;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public ImplementUNDOREDO() {
        doc = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // append x into document
    public void append(char x) {
        undoStack.push(doc.toString());
        redoStack.clear();
        doc.append(x);
    }

    // undo last change
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(doc.toString());
            doc = new StringBuilder(undoStack.pop());
        }
    }

    // redo changes
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(doc.toString());
            doc = new StringBuilder(redoStack.pop());
        }
    }

    // read the document
    public String read() {
        return doc.toString();
    }

    public static void main(String[] args) {
        ImplementUNDOREDO editor = new ImplementUNDOREDO();
        editor.append('a');
        editor.append('b');
        System.out.println(editor.read()); 
        editor.undo();
        System.out.println(editor.read()); 
        editor.redo();
        System.out.println(editor.read()); 
    }
    
}