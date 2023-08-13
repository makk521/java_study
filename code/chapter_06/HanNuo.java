public class HanNuo {
    public static void main(String[] args){
        Tower tower = new Tower();
        char a = 'A';
        char b = 'B';
        char c = 'C';
        tower.move(5, a, b, c);
    }
}

class Tower{
    //从a移动到c借助b
    public void move(int num, char a, char b, char c){
        if(num == 1){
            System.out.println(a + " -> " + c);
        }else{
            move(num-1, a, c, b);
            move(1, a, b, c);
            move(num-1, b, a, c);
        }
    }
}