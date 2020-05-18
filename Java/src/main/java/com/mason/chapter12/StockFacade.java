package com.mason.chapter12;

import com.mason.chapter12.stock.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mwu on 2020/5/14
 * 对子系统进行封装和分组
 */
public class StockFacade {

    private final List<IStock> highTech = new ArrayList<>();
    private final List<IStock> traditional = new ArrayList<>();
    private final List<IStock> all = new ArrayList<>();

    public StockFacade() {
        highTech.add(new Game());
        highTech.add(new Internet());

        traditional.add(new ManufacturingIndustry());
        traditional.add(new RealEstate());
        traditional.add(new ServiceIndustry());

        all.addAll(highTech);
        all.addAll(traditional);
    }

    public void buyHighTech() {
        highTech.forEach(IStock::buy);
    }

    public void buyTraditional() {
        traditional.forEach(IStock::buy);
    }

    public void sellHighTech() {
        highTech.forEach(IStock::sell);
    }

    public void sellTraditional() {
        traditional.forEach(IStock::sell);
    }

    public void buyAll() {
        all.forEach(IStock::buy);
    }

    public void sellAll() {
        all.forEach(IStock::sell);
    }
}
