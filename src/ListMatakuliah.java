public class ListMatakuliah {
    private Node head;

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Method untuk menambahkan elemen di akhir list
    void addTail(Matakuliah data) {
        Node curNode;
        Node posNode = null;
        Node newNode = new Node(data);

        // jika elemen pertama belum ada maka elemen baru menjadi elemen pertama, jika tidak maka elemen baru ditambahkan di akhir list
        if (head == null) {
            head = newNode;
        } else {
            // iterasi untuk mencari elemen terakhir
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }

    }

    // Method untuk menambahkan elemen di posisi tertentu
    public void addMid(Matakuliah data, int position) {
        Node curNode = null;
        Node posNode = null;
        int i;

        Node newNode = new Node(data);

        // jika elemen pertama belum ada maka elemen baru menjadi elemen pertama, jika tidak maka elemen baru ditambahkan di posisi tertentu
        if (head == null) {
            head = newNode;
        } else {
            curNode = head;

            // jika posisi yang dimasukkan adalah 1 maka elemen baru menjadi elemen pertama
            if (position == 1) {
                newNode.setNext(curNode);
                head = newNode;
            } else {

                // iterasi untuk mencari posisi yang dimasukkan
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    public void displayElement() {
        if (head == null) {
            System.out.println("List Empty");
        } else {
            Node currNode = head;

            while (currNode != null) {
                System.out.println(currNode.getData().getKode() + " " + currNode.getData().getNama() + " " + currNode.getData().getSks());
                currNode = currNode.getNext();
            }
            System.out.println();
        }
    }
}
