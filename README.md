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

One of the properties of a binary tree is the height : 
![image](https://user-images.githubusercontent.com/42012627/181590353-5953096b-64f5-476c-85eb-5c17fea846ae.png)


For example while searching for an element we go through one branch of each node (according to its value).
When searching for an element in a BST, the maximum time complexity is equal to number of node (n) of the binary tree and the minimum is log(n). 

**Important : we don't insert duplicate in a binary tree**

A drawback of the BST is : 
![image](https://user-images.githubusercontent.com/42012627/181591581-80dcd4db-798b-40cb-83a7-f7949037bb48.png)
The form of BST depends on the way we insert data. **For n number of elements in the BST there are n! possible forms it can have**
With BST we can either have a maximum height tree or a minimum one (depends of how we insert data). We would like to have a minmum hight tree every time. To get this emprouvment we use AVL trees that result from rotating nodes in a classical BST. 


### AVL Tree : 
AVL is a self balanced tree, resulting from rotating BST nodes.
To rotate a BST, we first calculate a *balance factor*, it is calculated like this : 
** Balance Factor = height of left subtree - hight of right subtree **
if BF's value is within {-1,0,1} this means that the tree is perfecty balanced.

For example here for the first node we have : 

![image](https://user-images.githubusercontent.com/42012627/181594721-1c0c9ceb-b94f-4f19-808b-1463eb453ce6.png)

BF = 3 - 3 = 0 => balanced

For the second node we have : 

![image](https://user-images.githubusercontent.com/42012627/181594982-378a4090-bb16-4083-8efd-732fc769fc51.png)

BF = 2 - 0 = 2 => Unballanced 

#### Method to three nodes : 

##### 1- LL imballance :

![image](https://user-images.githubusercontent.com/42012627/181598690-b0378ac8-2c19-4287-97f6-128cb7c51740.png)

The first node is imbalanced from the left (we can know which side is heavier with the sign, '-' for right and '+' for the left).
We will do a LL rotation like this : 

![image](https://user-images.githubusercontent.com/42012627/181599004-dbb94a5e-dd11-4b2a-a665-51001dd7f847.png)


![image](https://user-images.githubusercontent.com/42012627/181599084-00f469f1-20ed-4dee-80f8-07e532036989.png)

now it is balanced 

##### 2- LR imballance : 

![image](https://user-images.githubusercontent.com/42012627/181599290-66e818f1-23b6-46d0-8e8e-da8dced86e63.png)

We have a Left-Right imballance. we will perform this rotation : 

![image](https://user-images.githubusercontent.com/42012627/181599515-bc836b4d-4948-412e-b7c4-dab723bedc69.png)

Which will result in a LL imbalance 

![image](https://user-images.githubusercontent.com/42012627/181599631-ffaa1f69-cdb1-4c5a-bf9a-0e59272198e3.png)

to get 

![image](https://user-images.githubusercontent.com/42012627/181599084-00f469f1-20ed-4dee-80f8-07e532036989.png)


##### 3- RR imballance : 

![image](https://user-images.githubusercontent.com/42012627/181599824-f349f962-e350-4d9a-a812-67b00c6a7726.png)

to have 

![image](https://user-images.githubusercontent.com/42012627/181599084-00f469f1-20ed-4dee-80f8-07e532036989.png)

##### 3- RL imballance : 

![image](https://user-images.githubusercontent.com/42012627/181600077-10cb2799-a4ba-4460-a8af-81e3e1e6acf3.png)

to haver a RR imbalance 

![image](https://user-images.githubusercontent.com/42012627/181599824-f349f962-e350-4d9a-a812-67b00c6a7726.png)

And finaly 

![image](https://user-images.githubusercontent.com/42012627/181599084-00f469f1-20ed-4dee-80f8-07e532036989.png)


### Methods to balance multiple trees : 

#### LL and RR rotations : 

If we have a BST like this that needs a LL rotation 

![image](https://user-images.githubusercontent.com/42012627/181602810-c4c5b671-e5e6-4478-bd1e-9814f9ffbdad.png)

It becomes like this : 

![image](https://user-images.githubusercontent.com/42012627/181603185-e9efe781-59a5-4cc4-8b21-6b1e1c397a45.png)

#### LR and RL rotations : 

![image](https://user-images.githubusercontent.com/42012627/181604186-1d2a9808-e9f7-429f-9b93-03c3455680d9.png)

it becomes like this 

![image](https://user-images.githubusercontent.com/42012627/181604455-b737f8c0-a2e7-4d94-9a31-625d6c87071d.png)



### Red and Black tree : 
another way to keep trees balanced. Search have a complexity of O(log(n)).

### N-ary tree :
It is a tree where each node can have 0 to N children. 




