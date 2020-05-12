package com.mason.chapter6;

import com.mason.chapter6.hiphop.BigTrouser;
import com.mason.chapter6.hiphop.Sneakers;
import com.mason.chapter6.hiphop.TShirts;
import com.mason.chapter6.official.LeatherShoes;
import com.mason.chapter6.official.Suit;
import com.mason.chapter6.official.Tie;

/**
 * Created by mwu on 2020/5/12
 */
public class TestDecorator {

    public static void main(String[] args) {
        Person person = new Person("Mason");
        System.out.println("第一套装扮");
        // 装饰过程
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        sneakers.decorate(person);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();

        System.out.println("第二套装扮");
        Suit suit = new Suit();
        Tie tie = new Tie();
        LeatherShoes shoes = new LeatherShoes();

        suit.decorate(person);
        tie.decorate(suit);
        shoes.decorate(tie);
        shoes.show();
    }
}
