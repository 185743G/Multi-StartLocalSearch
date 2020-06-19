import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collections;

public class Initalize {
    private int NumInit;
    private ArrayList<Integer> list = new ArrayList<>();//解を格納する

    Initalize(int n) {//初期解の数
        this.NumInit = n;
        for (int i = 0; i < main.Member; i++) {//メンバーの数を数える
            list.add(i);
        }
    }
    int [][] get_InitalAns(){
        int [][] InitalAns = new int[NumInit][main.Num_class];
        for (int j = 0; j < NumInit; j++) {
            Collections.shuffle(list);//ランダムにメンバーが並ぶ
            for (int i = 0; i < main.Num_class; i++) {
                InitalAns[j][i] = list.get(i);//担当するクラスがなくなるまでメンバーが選出される
            }
        }
        return InitalAns;
    }
}
