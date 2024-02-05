#include <stdio.h>
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
void sort(int** boxTypes, int boxTypesSize) {
    for (int i = 0; i < boxTypesSize - 1; ++i) {
        for (int j = 0; j < boxTypesSize - i - 1; ++j) {
            if (boxTypes[j][1] < boxTypes[j + 1][1]) {
                swap(&boxTypes[j][0], &boxTypes[j + 1][0]);
                swap(&boxTypes[j][1], &boxTypes[j + 1][1]);
            }
        }
    }
}
int maximumUnits(int** boxTypes, int boxTypesSize, int* boxTypesColSize, int truckSize) {
    sort(boxTypes, boxTypesSize);

    int totalUnits = 0;
    for (int i = 0; i < boxTypesSize; ++i) {
        int boxesTaken = (boxTypes[i][0] < truckSize) ? boxTypes[i][0] : truckSize;
        totalUnits += boxesTaken * boxTypes[i][1];
        truckSize -= boxesTaken;

        if (truckSize == 0) {
            break;
        }
    }
    return totalUnits;
}

// int main() {
//     // Example usage
//     int boxTypes[][2] = {{1, 3}, {2, 2}, {3, 1}};
//     int boxTypesSize = 3;
//     int truckSize = 4;

//     int result = maximumUnits((int**)boxTypes, boxTypesSize, NULL, truckSize);

//     printf("Output: %d\n", result);

//     return 0;
// }