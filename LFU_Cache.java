class LFUCache {

    class Node{
        int key ,value ,counter;
        Node prev,next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
            this.counter=1;


        }

    }

    int capacity;
    Map<Integer,Node> map;
    Node head;
    Node tail;
// baccha hua h
    public LFUCache(int capacity) {
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
            node.counter+=1;
            addacctocounter(node);
            return node.value;
        
        
    }
    
    public void put(int key, int value) {
                Node node=map.get(key);

                if(node!=null){
                    node.value=value;
                    remove(node);
                    node.counter+=1;
                    addacctocounter(node);


                }else{
                        if(map.size()==capacity){
                           Node LFU= tail.prev;
                           remove(LFU);
                           //addatfirst()
                           map.remove(LFU.key);
                        }
                        Node newnode=new Node(key,value);
                        newnode.counter+=1;
                addacctocounter(newnode);
                map.put(key,newnode);

                }

                
              //  Node newnode=map.get(key);
                

            
        
    }
           public void remove(Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;

           }     

            public void addacctocounter(Node node){
                while(node.counter<head.counter){
                         head=head.next;
                     }

                      node.next=head.next;
                         node.prev=head;
                         head.next.prev=node;
                       head.next=node;
                // if(node.counter>=head.counter){
                //         node.next=head.next;
                //         node.prev=head;
                //         head.next.prev=node;
                //         head.next=node;
                // }else{
                //     while!((node.counter>=head.counter)){
                //         head=head.next;
                //     }
                // }

            }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */