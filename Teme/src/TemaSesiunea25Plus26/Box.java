package TemaSesiunea25Plus26;

public class Box<T> {
    // Create a generic class Box<T> that can store a single item of any type. Implement methods to set and get
    // the item from the box.

    public T content;

    public T getContent() {
        return content;
    }

    public void setContent(T contentParam) {
        this.content = contentParam;
    }

    public Box(T contentParam) {
        this.content = contentParam;
    }
}
