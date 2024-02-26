package com.prog2.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adinashby
 *
 */

public class LabEight {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 * Please refer to the README file for question(s) description
	 */

	public List<Integer> rightSideView(TreeNode root) {
		
            ArrayList<Integer> list = new ArrayList<Integer>();
            TreeNode ct= root;
            
            if(ct==null){
                return list;
            } else{
                while(ct.right!=null){
                    list.add(ct.val);
                    ct= ct.right;
                    
                    
                } list.add(ct.val);
                
                
                
            }
            
            
            
            
            
            
            
            return list;
            
                
                
                
                
                
                
	}

}