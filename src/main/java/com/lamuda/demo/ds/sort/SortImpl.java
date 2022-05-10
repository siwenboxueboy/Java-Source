package com.lamuda.demo.ds.sort;

/**
 * @description:
 * @author: 王斯博
 * @date: 2021-08-20 11:30
 **/
public class SortImpl extends SortAbs {

    public static void selection(Comparable[] a) {
        int length = a.length;
        //i = length - 2 此时 j = length - 1 即倒数第二个元素确定位置之后，则最后一个i = length - 1也相当于确定了
        for (int i = 0; i < length - 1; i++) {
            //找到一个最小的
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (less(a[i], a[j])) {
                    min = j;
                    exch(a, i, min);//交换
                }
            }
        }
    }

    public static void insertion(Comparable[] a) {
        //将a[]按升序排列
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    public static void shell(Comparable[] a) {
        //最内层做的事情
        int length = a.length;
        int[] h = {1, 3};
        //确定h 从h数组种取出 j为h数组的下标 从大到小取出
        for (int j = h.length - 1; j >= 0; j--) {
            //从第二个元素开始去执行数组的循环
            for (int i = h[j]; i < length; i++) {
                //比较待插入元素和已经排好序元素的大小
                for (int k = i; k > 0; k -= h[j]) {
                    if (less(a[k], a[k - 1])) {
                        exch(a, k, k - 1);
                    }
                }
            }
        }
    }

    //快速排序
    private static int partition(Comparable[] a, int i, int j) {
        Comparable p = a[i];
        while (i < j) {
            while (i < j && lessEq(p, a[j])) j--;//从后往前面找，找比枢轴更小的
            a[i] = a[j];
            while (i < j && lessEq(a[i], p)) i++;//
            a[j] = a[i];
        }
        a[j] = p;//Pivot放到合适的位置
        return j;
    }

    private static void quickSort(Comparable[] a, int i, int j) {
        if (i < j) {
            int partition = partition(a, i, j);
            quickSort(a, i, partition - 1);
            quickSort(a, partition + 1, j);
        }
    }

    public static void heapSort(Comparable[] a) {
        int len = a.length - 1;//len代表最后一个元素的索引
        buildMaxHeap(a,len);
        for (int i = len; i > 1 ; i--) {
            exch(a,i,1);//最后一个元素和1位置的元素交换
            adjustHeap(a,1,i-1);//把剩余i-1个整理成堆
        }
    }

    private static void buildMaxHeap(Comparable[] a,int len){
        //从最后一个有孩子的父节点开始调整
        for (int l = len/2; l > 0; l--) {
            adjustHeap(a,l,len);
        }
    }

    /*
     * @description 调整堆,输入数据a[0]位置不存放元素
     * @param a：待调整数组 k：待调整的节点索引 len：待调整的数组长度（删除最大元素后堆会缩小，所以要有这个参数）
     */
    private static void adjustHeap(Comparable[] a, int k, int len) {
        int i;
        Comparable kv = a[k];//待调整的节点值
        //i为k的左孩子节点
        for (i = k * 2; i <= len; i *= 2) {//i*-2 当前孩子下移到孩子的孩子位置
            if (i < len && less(a[i], a[i + 1])) i++;
            //如果孩子节点更大，则孩子节点的值赋值给父节点
            //每次都是kv和a[i]比较，kv不一定会放在哪一个子节点上面
            if (less(kv, a[i])) {
                a[k] = a[i];
                k = i;//当前父亲下移到孩子位置
            }else {
                break;
            }
        }
        a[k] = kv;
    }



    // 从标准输入读取字符串，将它们排序并输出
    public static void main(String[] args) {
/*        sortArray("shell", "d", "d", "b");
        sortArray("shell", 1, 2, 3, 3, 2, 1, 5);
        sortArray("shell", "d", "d", "b");
        sortArray("selection", "d", "d", "b");
        sortArray("selection", 1, 2, 3, 3, 2, 1, 5);
        sortArray("selection", "d", "d", "b");
        sortArray("insertion", "d", "d", "b");
        sortArray("insertion", 1, 2, 3, 3, 2, 1, 5);
        sortArray("insertion", "d", "d", "b");
        */
//        Integer[] integers = {3, 4, 2, 6, 5, 2, 3};
        //SortImpl.quickSort(integers, 0, integers.length - 1);
        /*for (Integer integer : integers) {
            System.out.println(integer);
        }*/

        sortArray("heapSort", 0,3, 4, 2, 6, 5, 2, 3);
    }
}