# Edge Removal and Replacement in a Minimum Spanning Tree

## Project Overview
This project demonstrates how to efficiently **rebuild a Minimum Spanning Tree** after removing one of its edges.  
The program:
1. Builds the MST from a given weighted undirected graph using **Kruskal’s algorithm**.
2. Displays the MST edges and total weight.
3. Removes one edge from the MST and shows the resulting disconnected components.
4. Finds a **replacement edge** that reconnects the two components while keeping the total weight as low as possible.
5. Displays the new MST and its total weight.

---

## How to Run

### Steps
1. Clone this repository:
   ```bash
   git clone https://github.com/Exzou0/bonus.git
   cd bonus

2. Build the project with Maven:
``` bash
mvn clean compile
```
3. Run the program
---
### Example Output
```
Minimal spanning tree: [2 - 3 (4), 0 - 3 (5), 0 - 1 (10)]
2 - 3 (4)
0 - 3 (5)
0 - 1 (10)
Total weight: 19
Removed edge: 2 - 3 (4)
Root one: 2, Root two: 0
Replace: 2 - 0 (6)
New MST: [0 - 3 (5), 0 - 1 (10), 2 - 0 (6)]
New total weight: 21
```
---
### File Structure
```
src/
└── main/
     └── java/
          └── org/
               └── example/
                    ├── Edge.java        # represents an edge
                    ├── UnionFind.java   # dsu structure
                    ├── MstBuilder.java  # Builds MST using kruskal
                    └── Main.java        # Main program logic (edge removal + replacement)
```

---
### References
CP-Algorithms. (2025, April 22). Second best minimum spanning tree.   https://cp-algorithms.com/graph/second_best_mst.html