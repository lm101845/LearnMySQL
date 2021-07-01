package MyCollections.demo02;

/**
 * @author 李明
 * @date 2021年07月01日 14:44
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * 需求：
 * 通过程序实现斗地主过程中的洗牌，发牌和看牌
 * <p>
 * 思路：
 * 1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
 * 2:往牌盒里面装牌
 * 3:洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
 * 4:发牌，也就是遍历集合，给三个玩家发牌
 * 5:看牌，也就是三个玩家分别遍历自己的牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> array = new ArrayList<>();

        //往牌盒里面装牌
        /*
            ?2,?3,?4...?K,?A
            ?2,...
            ?2,...
            ?2,...
            小王，大王
         */
        //定义花色数组
        String[] colors = {"?", "?", "?", "?"};

        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }

        array.add("小王");
        array.add("大王");
        //洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        Collections.shuffle(array);

        //发牌，也就是遍历集合，给三个玩家发牌
        //先创建三个玩家
        ArrayList<String> lqxArray = new ArrayList<>();
        ArrayList<String> lyArray = new ArrayList<String>();
        ArrayList<String> fqyArray = new ArrayList<String>();
        //fqy就是风清扬，也是这个视频的老师

        //斗地主还有三张底牌
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                //说明是最后三张底牌
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                //剩下的牌给三个玩家发牌
                //对3取余即可
                lqxArray.add(poker);
            } else if (i % 3 == 1) {
                lyArray.add(poker);
            } else if (i % 3 == 2) {
                fqyArray.add(poker);
            }
        }
        //System.out.println(array);
        //看牌，也就是三个玩家分别遍历自己的牌
        lookPoker("林青霞", lqxArray);
        lookPoker("柳岩", lyArray);
        lookPoker("风清扬", fqyArray);
        lookPoker("底牌", dpArray);
    }


    //看牌的方法
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name + "的牌是：" );
        for(String poker:array){
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
