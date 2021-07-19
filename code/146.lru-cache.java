class Node {
    int key, val;
    Node next, prev;
    
    Node(int key, int val){
        this.key = key;
        this.val = val;
        next = prev = null;
    }
}

class LRUCache {

    HashMap<Integer, Node> map = new HashMap<>();
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int capacity;
    
    public LRUCache(int capacity) {
        
        this.capacity = capacity;
        
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            Node curr = map.get(key);
            
            remove(curr);
            insert(curr);
            
            return curr.val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity) {
            remove(tail.prev);
        }
        
        insert(new Node(key, value));
    }
    
    void insert(Node curr) {
        map.put(curr.key, curr);
        
        Node next = head.next;
        
        head.next = curr;
        curr.prev = head;
        curr.next = next;
        next.prev = curr;
        
    }
    
    void remove(Node curr) {
        map.remove(curr.key);
        
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */