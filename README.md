# Trees

## Definition : 
The trees is a data structure that is used to representy hirerachical data. Something that is **not** possible in linear structures. 

![image](https://user-images.githubusercontent.com/42012627/181175846-b7210566-a44f-469a-9d2c-32d9737475b8.png)

the top is the root and the children are called nodes. the nodes without any children are called leaves. 

To iterate over all the nodes of a tree data structure there are two solutions : 
* Breadth-level traversal : to check the tree by level.
* depth-first traversal : we check all the children of a node before moving to the next 

## Types of tree structure 

Thanks to the parent-child relation, the tree structure is widly used for searching and sorting operations. It is considered to be one of the most powerful and advanced data structures. 

Tree is not a linear data structure. It can be represented by various linear data structres such as arrays, linkedlists, classes or other types of data. 

### general tree : 
A general tree has no condition on the number of children it can have. It is a super-set for all the other types of trees. 

### binary tree : 
This tree has a condition/ constraint. Each node can only have two children. It is widly used thanks to this constraint. Indeed when we add conditions to data structures we discover new uses for them , for example when we add constraints to binary trees : Binary Search Tree, AVL, RBT 
![image](https://user-images.githubusercontent.com/42012627/181180432-05cd114b-9ce5-4334-8f38-e19a4d05debb.png)

### Binary search tree : 
In BST the value of the left node most be smaller or equal to the parent node. This property makes BST suitable for sorting and searching. 
![image](https://user-images.githubusercontent.com/42012627/181180821-d013152b-e890-41fd-b930-554cbcb5ff18.png)

### AVL Tree : 
AVL is a self balanced tree (pas bien compris pour l'instant je dois regarder ça : https://www.youtube.com/watch?v=jDM6_TnYIqE)
Lookup, insertion and detection operations only have a o(log n) complexity 

### Red and Black tree : 
another way to keep trees balanced. Search have a complexity of O(log(n)).

### N-ary tree :
It is a tree where each node can have 0 to N children. 




