public class MiGong {
    public static void main(String[] args){
        /*
         * 思路
         * 先创建迷宫，用二维数组表示 int map[][] = new int[8][9]
         * 规定好map数组的元素值：0表示可以走，1表示障碍物
         */

        int map[][] = new int[8][7];

        //将外围一圈一行设置为1
        for(int i=0; i<7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
            map[i][0] = 1;
            map[i][6] = 1;

        }

        //单独设置其他
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("----------------------当前地图-------------------");
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }

        MiGongTools miGongTools = new MiGongTools();
        miGongTools.findWay(map, 1, 1);

        System.out.println("----------------------走后地图-------------------");
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }        
    }
}

class MiGongTools{
    /*
     * i:当前位置行数
     * j:当前位置列数
     * 找到就返回true
     * 递归找路，定义更多意义： 0表示可以走 1表示障碍物 2表示可以走（走过的都标2） 3表示走过，但是走不通是死路
     * 当map[6][5]=2时说明找到通路，否则继续找
     * 先确定老鼠找路策略下->右->上->左
     */
    public boolean findWay(int map[][], int i, int j){
        if(map[6][5] == 2){
            return true;
        }else{
             if(map[i][j] ==0){//当前这个位置为0说明可以走
                //假定可以走通
                map[i][j] = 2;
                //找路策略
                if(findWay(map, i+1, j)){
                    return true;
                }else if(findWay(map, i, j+1)){
                    return true;
                }else if(findWay(map, i-1, j)){
                    return true;
                }else if(findWay(map, i, j-1)){
                    return true;
                }else{
                    map[i][j] = 3;
                    return false;
                }
             }else{//只能是1，2，3，都不能走通
                return false;
             }

        }
    }
}