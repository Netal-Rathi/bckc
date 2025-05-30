class LRUCache {

    class Node{
        int key ,value ;
        Node prev,next;

        Node(int key,int value){
            this.key=key;
            this.value=value;

        }

    }

    int capacity;
    Map<Integer,Node> map;
    Node head;
    Node tail;
// baccha hua h
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>(capacity);
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        Node node =map.get(key);
        if(node==null){
            return -1;
        }
            remove(node);
            addathead(node);
            return node.value;
        
        
    }
    
    public void put(int key, int value) {
                Node node=map.get(key);

                if(node!=null){
                    node.value=value;
                    remove(node);
                    addathead(node);


                }else{
                        if(map.size()==capacity){
                           Node lru= tail.prev;
                           remove(lru);
                           //addatfirst()
                           map.remove(lru.key);
                        }
                        Node newnode=new Node(key,value);
                addathead(newnode);
                map.put(key,newnode);

                }

                
              //  Node newnode=map.get(key);
                

            
        
    }
           public void remove(Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;

           }     

            public void addathead(Node node){
                        node.next=head.next;
                        node.prev=head;
                        head.next.prev=node;
                        head.next=node;

            }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// Title: LRU Cache
