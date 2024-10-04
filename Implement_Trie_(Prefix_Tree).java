class Trie {
        Trie []children;
        boolean eow;
    
     public Trie() {
        children=new Trie[26];
        eow=false;
    }
    
    public void insert(String word) {
        Trie root=this;
      for(int i=0;i<word.length();i++){
            int idx= word.charAt(i)-'a';
            if(root.children[idx]==null){
                root.children[idx]=new Trie();
              //  newnode=root.children[idx]
            }
            root=root.children[idx];
        }
        root.eow=true;
        
    }
    
    public boolean search(String word) {
        Trie root=this;
        for(int i=0;i<word.length();i++){
            int idx= word.charAt(i)-'a';
            if(root.children[idx]==null){
                return false;
            }
            root=root.children[idx];
        }
        return  root.eow;
           
        
        
    }
    
    public boolean startsWith(String prefix) {
        Trie root=this;
        for(int i=0;i<prefix.length();i++){
          int idx= prefix.charAt(i)-'a';
          if(root.children[idx]==null){
            return false;
          }
          root=root.children[idx];
        }
        return true;
       
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */