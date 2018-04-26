package com.kotlin.draft.chapter08.p1;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.List;

import static com.kotlin.draft.chapter08.p1.MainKt.processTheAnswer;

public class LambdaInJava {

    public static void main(String[] args) {
        processTheAnswer(number -> number + 1);

        List<String> strings = new ArrayList<String>();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
                System.out.println(s);
        return Unit.INSTANCE;
        });
    }
}
