package com.gaop.demo.chapter1.unionFind.entity;

/**
 * @description 	
 * 	连通性问题算法API
 * @author gaop
 * @date 2017年8月20日 下午1:13:46
 */
public class UF {
	
	private int[] id;  //分量id
	
	private int count;  //分量数量

	/**
	 * 以整数标识(0到N-1)初始化N个触点
	 * @param N
	 */
	public UF(int N) {
		count = N;  //构造函数初始化的分量数量
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	/**
	 * 在p和q之间添加一条连接
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
		
	}
	
	/**
	 * p所在的分量的标识符
	 */
	public int find(int q) {
		return 0;
	}
	
	/**
	 * 如果p和q存在于同一个分量中则返回true
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connected(int p, int q) {
		return this.find(p) == this.find(q);
	}
	
	/**
	 * 连通分量的数量
	 * @return
	 */
	int count() {
		return count;
	}
}
