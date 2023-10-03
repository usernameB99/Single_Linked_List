public class List<T> {

    private Node<T> head = null;
    //public int index;

    public void add(T element) {

        Node<T> newNode = new Node<T>(element);

        if (head == null) {

            head = newNode;

        } else {

            Node<T> current = head;

            while (current.next != null) {

                current = current.next;

            }

            current.next = newNode;

        }

    }

    public void add(int index, T element) {

        Node<T> newNode = new Node<T>(element);

        Node<T> temp;

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        temp = current.next;
        current.next = newNode;

        newNode.next = temp;

    }

    public int size() {

        int size = 0;

        Node<T> current = head;
        while (current != null) {

            current = current.next;
            size += 1;
        }
        return size;
    }


    public String toString() {

        //StringBuilder

        String result = "";

        Node<T> current = head;

        while (current != null) {
            result += " " + current.data;

            current = current.next;

        }
        return result;

    }


    public T get(int index) {

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;

        }
        return current.data;
    }


    public void remove(int index) {

        Node<T> current = head;

        if (index == 0) {
            head = current.next;
        } else {

            for (int i = 0; i < index - 1; i++) {
                current = current.next;

            }
            if (current.next != null) {
                current.next = current.next.next;
            } else {
                current.next = null;
            }

        }

    }


    public static void main(String[] args) {

        List<String> test = new List<String>();
        test.add("-remove this-");
        test.add("hello");
        test.add("mein");
        test.add("name");
        test.add("Berni");
        test.add(4, "ist");
        test.add("-remove this-");

        System.out.println(test);

        System.out.println(test.size());

        System.out.println(test.get(5));

        test.remove(6);
        test.remove(0);

        System.out.println(test);

        List<Integer> test1 = new List<Integer>();
        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        System.out.println(test1);
    }


}
