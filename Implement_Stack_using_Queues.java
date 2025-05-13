import java.util.ArrayList;
import java.util.List;

class MyStack {
    private List<Integer> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x); // Add to end

        // Rotate the list to bring new element to the front
        for (int i = 0; i < list.size() - 1; i++) {
            int temp = list.remove(0);
            list.add(temp);
        }
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        return list.remove(0); // Top of the stack
    }

    public int top() {
        if (empty()) {
            return -1;
        }
        return list.get(0); // Front of the list
    }

    public boolean empty() {
        return list.isEmpty();
    }
}

// Title: Implement Stack using Queues
