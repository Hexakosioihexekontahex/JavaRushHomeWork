//package com.javarush.test.level28.lesson15.big01.model;
//
//import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
//
//import kotlin.util.List;
//
///**
// * Created by ion on 10.08.2016.
// */
//public class Provider {
//    private Strategy strategy;
//
//    public Provider(Strategy strategy) {
//        this.strategy = strategy;
//    }
//
//    public void setStrategy(Strategy strategy) {
//        this.strategy = strategy;
//    }
//
//    public List<Vacancy> getJavaVacancies(String searchString){
//        return strategy.getVacancies(searchString);
//    }
//}
