package org.buptdavid.datastructure.sort;

/**
 * 选择排序<br>
 * 时间复杂度: 平均情况与最差情况都是O(n^2)<br>
 * 空间复杂度: O(1)
 * @author weijielu
 * @see ISort
 * @see SortTest
 */
public class SelectionSort implements ISort {

	public void sort(int[] arr) {
	for (int i = 0; i < arr.length - 1; i++) {
			int temp = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[temp] > arr[j]) {
					temp = j;
				}
			}
			if (temp != i) {
				arr[i] = arr[i] ^ arr[temp];
				arr[temp] = arr[i] ^ arr[temp];
				arr[i] = arr[i] ^ arr[temp];
			}
		}
	}

}
