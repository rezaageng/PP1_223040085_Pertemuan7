public class Node {
    private Matakuliah data;
    private Node next;

    // Constructor untuk Node
    public Node(Matakuliah data) {
        this.data = data;
    }

    // Getter dan Setter
    public Matakuliah getData() {
        return data;
    }

    public void setData(Matakuliah data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}