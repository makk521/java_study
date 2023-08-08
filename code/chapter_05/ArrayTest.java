import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ArrayTest {
    /*定义新数组
     */
    public static void main(String[] args){
        double hens[] = {1, 2, 3};
        System.out.println(hens.length);
    }
}

class ArrayTest1{
    public static void main(String[] args){
        /*创建一个char类型的26个元素的数组，
        分别放置'A'-'Z'使用for循环访问所有元素并打印出来。
        提示：char类型数据运算'A'+1-> B */

        char ls[] = new char[26];
        for(int i=0; i<ls.length; i++){
            ls[i] = (char)('A' + i);  // 'A' + i 是int，需要强制转换
        }

        // output
        for(int i=0; i<ls.length; i++){
            System.out.print(ls[i]);
        }
    }
}

class ArrayTest2{
    public static void main(String[] args){
        /*请求出一个数组int[1的最大值{4，-1,9,10,23}，并得到对应的下标 */
        int ls[] = {4,-1,9,10,23};
        int max = ls[0];
        int index = 0;
        for(int i=0; i<ls.length-1; i++){
            if(ls[i] < ls[i+1]){
                max = ls[i+1];
                index = i+1;
            } 
        }
        System.out.println("max = " + max);
        System.out.println("index = " + index);
    }
}

class ArrayTest3{
    public static void main(String[] args){
    /*数组拷贝 */
    int ls1[] = {1, 2, 3};
    int ls[] = new int[3];
    for(int i=0; i<ls1.length; i++){
        ls[i] = ls1[i];
    }
    for(int i=0; i<ls.length; i++){
        System.out.print(ls[i]);
    }
    }
}

class ArrayTest4{
    public static void main(String[] args){
        /*数组翻转 */
        int ls[] = {1, 2, 3, 4};
        int times = ls.length / 2;
        int temp = 0;
        for(int i=0; i<times; i++){
            temp = ls[i];
            ls[i] = ls[ls.length-i-1];
            ls[ls.length-i-1] = temp;
        }
        for(int i=0; i<ls.length; i++){
            System.out.println(ls[i]);
        }
    }
}

class ArrayTest5{
    public static void main(String[] args){
        /*数组扩容到最后面 */
        int ls[] = {1,2,3};
        int len = ls.length + 1;
        int lsNew[] = new int[len];
        for(int i=0; i<ls.length; i++){
            lsNew[i] = ls[i];
        }
        for(int i=0; i<lsNew.length; i++){
            System.out.println(lsNew[i]);
        }
    }
}

class ArrayTest6{
    public static void main(String[] args){
        /*冒泡排序 */
        int ls[] = {3,5,2,1,66,1};
        int len = ls.length;
        int temp = 0;
        for(int timesCompare=0; timesCompare<len-1;timesCompare++){   // 一共遍历len-1次
            for(int i=0; i<len-1-timesCompare; i++){                  // 每次比较几个数
                if(ls[i+1] < ls[i]){
                    temp= ls[i];
                    ls[i] = ls[i+1];
                    ls[i+1] = temp;
                }
            }
        }

        for(int i=0; i<ls.length; i++){
            System.out.println(ls[i]);
        }
    }
}

/*
 * 二维数组部分
 */

class ArrayTest7{
    public static void main(String[] args){
        /*请用二维数组输出如下图形
        0 1 2
        3 4
        5
        */
        int ls[][] = {{0,1,2},{3,4},{5}};
            for(int i=0;i<ls.length;i++){
                for(int j=0; j<ls[i].length; j++){
                    System.out.print(ls[i][j] + "\t");
                }
                System.out.print("\n");
            }
    }
}

class ArrayTest8{
    public static void main(String[] args){
    /*已知有个升序数组，要求插入一个元素该数组依旧是升序的 */
    int ls[] = {10, 12, 45, 90};
    int addNum = 1;
    int index = ls.length; // 默认最大的位置
    int lsNew[] = new int[ls.length+1];
    
    for(int i=0; i<ls.length; i++){
        if(addNum < ls[i]){
            index = i;
            break;
        }
    }

    for(int i=0; i<index; i++){
        lsNew[i] = ls[i];
    }
    lsNew[index] = addNum;
    for(int i=index+1; i<lsNew.length; i++){
        lsNew[i] = ls[i-1];
    }

    for(int i=0; i<lsNew.length; i++){
        System.out.println(lsNew[i]);
    }
    }
}

class ArrayTest9{
    /*随机生成10整数（1-100）保存到数组，
     * 并倒序打印以及求平均值、最大值和最小值的下标
     * 并查找里面是否有8
     */
    public static void main(String[] args){
        int ls[] = new int[10];
        double average, sim = 0;
        //(int)(Math.random() * 100) + 1 产生1-100随机数

        for(int i=0; i<ls.length; i++){
            ls[i] = (int)(Math.random() * 100) + 1;
        }

        int max  = ls[0];
        int maxIndex = 0;
        for(int i=0; i<ls.length; i++){
            if(max < ls[i]){
                max = ls[i];
                maxIndex = i;
            }
        }

        for(int i=ls.length-1; i>-1; i--){
            System.out.print(ls[i] + "\t");
        }
        System.out.println("Max = " + max + "Min = ");

    }
}