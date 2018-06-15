public class LinkedList{
    private LinkedNode first = null;

    public void addItem(int data){
        LinkedNode newItem = new LinkedNode();
        newItem.data = data;
        newItem.next = null;

        if(this.first == null){
            this.first = newItem;
        }else{
            LinkedNode tmp = this.first;
            while(tmp.next != null){
                tmp = tmp.next;
            }

            tmp.next = newItem;
        }
    }

    public void removeItem(int item){
        LinkedNode prev = null;
        LinkedNode tmp  = this.first;

        while(tmp != null && tmp.data != item){
            tmp = tmp.next;
        }

        if(tmp != null){
            if(prev != null){
                prev.next = tmp.next;
            }else{
                this.first = tmp.next;
            }
        }
    }

    public void printList(){
        LinkedNode tmp = this.first;
        while(tmp != null){
            System.out.println(tmp.data + " ");
            tmp = tmp.next;
        }
        println();
    }
}