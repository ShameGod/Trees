private Boolean checkBST(Node root){
        if(root == null){return true;}
        //if(root.left == null){checkBST(root.right);}//else
        if(root.left.data> root.data || root.right.data < root.data){return false;}
        return checkBST(root.left) && checkBST(root.right);
    }
