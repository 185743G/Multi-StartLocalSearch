import java.lang.reflect.Member;
import java.util.Random;

public class main {
    public static final int
    English = 0,
    Math = 1,
    Physic = 2,
    Chemistry = 3,
    Member = 4,
    Num_class = 4,
    Inital_ans = 5,
    Setstudo_times = 10;
    public static final int [][] MakeTestChart
            ={{6,1,9,3},{2,5,7,8},{6,3,5,4},{3,5,2,1}};
//    public static int[] get_combination(){
//        int [] i = {0,0,0,0};//{English,Math,Physic,Chemistry}の担当者を表す
//        Initalize search = new Initalize(4);
//
//        i[search.InitalAns(j);
//        return i;
//    }
    public static int  collect_time(int[] list) {
        int score = 0;
        for (int i = 0; i < Num_class; i++) {
            score += MakeTestChart[list[i]][i];
        }
        return score;
    }
    public static void show(int [] list){
        for(int j = 0; j < Inital_ans;j++) {
            System.out.print(list[j] +",");
        }
        System.out.println(" ");
    }
    public static int [] setsudo(int [] list){
            Random rand = new Random();
            int num = rand.nextInt(3);
            int a = 0;
            list[num] = a;
            list[num] = list[num+1];
            list[num+1] = a;
        return list;
    }
    public static void main(String[] args) {
        Initalize search = new Initalize(Inital_ans);
        int [][] list = search.get_InitalAns();
        int [] scores = new int[Inital_ans];
        for(int j = 0; j < Inital_ans;j++) {
            scores[j] = collect_time(list[j]);
        }
        System.out.println("摂動前");
        show(scores);
        for (int i = 0; i<Setstudo_times;i++){
            for(int j = 0; j < Inital_ans;j++) {
                int setsudo = collect_time(setsudo(list[j]));
//                System.out.println("摂動後");
                if(scores[j] > setsudo){
                    scores[j] = setsudo;
                }
            }

        }
        System.out.println("摂動後");
        show(scores);
    }
}
