class Solution {
    public double getMinDistSum(int[][] positions) {
        double epsilon = 1e-7; // Convergence threshold
        double[] center = new double[2]; // Optimal center coordinates
        
        // Calculate initial center as the centroid of the positions
        for (int[] position : positions) {
            center[0] += position[0];
            center[1] += position[1];
        }
        center[0] /= positions.length;
        center[1] /= positions.length;
        
        while (true) {
            double numeratorX = 0, numeratorY = 0, denominator = 0;
            double sumDistance = 0;
            
            // Calculate the new center using Weiszfeld's algorithm
            for (int[] position : positions) {
                double distance = Math.sqrt(Math.pow(center[0] - position[0], 2) + Math.pow(center[1] - position[1], 2));
                
                if (distance > 0) { // Avoid division by zero
                    numeratorX += position[0] / distance;
                    numeratorY += position[1] / distance;
                    denominator += 1 / distance;
                } else { // If the point is exactly at the center
                    numeratorX = position[0];
                    numeratorY = position[1];
                    denominator = 1;
                    break; // Exit the loop since we found an exact match
                }
                sumDistance += distance; // Sum of distances for later return
            }

            // New center calculation
            double newCenterX = numeratorX / denominator;
            double newCenterY = numeratorY / denominator;
            double[] newCenter = {newCenterX, newCenterY};

            // Check for convergence
            if (Math.sqrt(Math.pow(newCenter[0] - center[0], 2) + Math.pow(newCenter[1] - center[1], 2)) < epsilon) {
                center = newCenter;
                break; // Converged
            }
            center = newCenter; // Update center for next iteration
        }

        // Calculate the minimum distance sum using the found center
        double minDistSum = 0;
        for (int[] position : positions) {
            minDistSum += Math.sqrt(Math.pow(center[0] - position[0], 2) + Math.pow(center[1] - position[1], 2));
        }

        return minDistSum;
    }
}
