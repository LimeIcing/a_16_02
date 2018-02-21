public class ListNode02 {
    public int data; // data stored in this node
    public ListNode02 next; // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode02() {
        this(0, null);
    }

     // post: constructs a node with given data and null link
    public ListNode02(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode02(int data, ListNode02 next) {
        this.data = data;
        this.next = next;
    }
}