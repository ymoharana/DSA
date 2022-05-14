package com.list;

public class BinarySearchTree {

    public TNode root;

    public void insert(int val){
        TNode newNode  = new TNode();
        newNode.val = val;

        if(root == null) {
            root = newNode;
            return;
        }
        TNode currentNode = root;
        if(val < currentNode.val){
            while(true){
                if(currentNode.left != null){
                    currentNode = currentNode.left;
                }else{
                    currentNode.left = newNode;
                    return;
                }
            }
        }if(val>currentNode.val){

            while(true){
                if(currentNode.right != null){
                    currentNode = currentNode.right;
                }else{
                    currentNode.right = newNode;
                    return;
                }

            }
        }



    }
    public TNode lookUp(int val){
        TNode current = root;
        while(current != null){
            if(val>current.val){
                current = current.right;
            }else if(val<current.val){
                current = current.left;
            }else if(val == current.val){
                return current;
            }
        }
        return null;
    }

    public void remove(int val){
        TNode current = root;
        TNode pNode = null;
        TNode found = null;
        TNode lastChild = null;
        while(current != null){
            if(val>current.val){
                current = current.right;
            }else if(val<current.val){
                current = current.left;
            }else if(val == current.val){
                found = current;
                break;
            }
            pNode = current;
        }
        lastChild = found;
        while(lastChild.right!=null){
            lastChild = lastChild.right;
        }
        pNode.right = lastChild;

    }
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
