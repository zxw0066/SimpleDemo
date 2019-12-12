package com.demo.leetcode;

import com.demo.leetcode.Demo0024.TreeNode;

/**
 * 二叉树相关遍历方式
 * https://www.cnblogs.com/zhi-leaf/p/10813048.html
 * @author zhaoxingwu
 *
 */
public class Demo0028_TreeNode {

	// 前序遍历(根-左-右) GDAFEMHZ
	public void preOrderTraverse1(TreeNode node) {
		if(node != null) {
			System.out.println(node.val);
			preOrderTraverse1(node.left);
			preOrderTraverse1(node.right);
		}
	}
	
	// 中序遍历(左-根-右) ADEFGHMZ
	public void preOrderTraverse2(TreeNode node) {
		if(node != null) {
			preOrderTraverse1(node.left);
			System.out.println(node.val);
			preOrderTraverse1(node.right);
		}
	}
	
	// 后序遍历(左-右-根) AEFDHZMG
	public void preOrderTraverse3(TreeNode node) {
		if(node != null) {
			preOrderTraverse1(node.left);
			preOrderTraverse1(node.right);
			System.out.println(node.val);
		}
	}
	
	/**
	 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null) {
			return t2;
		}
		if(t2 == null) {
			return t1;
		}
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
    }
}
