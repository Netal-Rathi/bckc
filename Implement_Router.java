class Router {
    List<int[]> router = new ArrayList<>();
    int memoryLimit;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        if (router.size() >= memoryLimit) {
            return false; // memory full
        }

        for (int[] packet : router) {
            if (packet[0] == source && packet[1] == destination && packet[2] == timestamp) {
                return false; // duplicate
            }
        }

        int[] arr = new int[3];
        arr[0] = source;
        arr[1] = destination;
        arr[2] = timestamp;
        router.add(arr);
        return true;
    }

    public int[] forwardPacket() {
        if (router.isEmpty()) {
            return new int[0]; // truly empty array
        }

        int[] arr = router.get(0);
        router.remove(0);
        return arr;
    }

    public int getCount(int destination, int startTime, int endTime) {
        int count = 0;
        for (int[] a : router) {
            if ( a[2] >= startTime && a[2] <= endTime) {
                count++;
            }
        }
        return count;
    }
}

// Title: Implement Router
