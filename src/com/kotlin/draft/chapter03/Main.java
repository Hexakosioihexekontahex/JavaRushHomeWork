package com.kotlin.draft.chapter03;

import com.kotlin.draft.chapter03.strings.StringFunctions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add("_+" + i + "+_");
        }

        System.out.println(StringFunctions.joinToString(list, "", "|", "|"));
        System.out.println(StringFunctions.joinToString(list, "|"));
        StringFunctions.reportOperationCount();

        View view = new Button();
        FunctionsExtenionsCantBeOverridedKt.showOff(view);

        System.out.println(StringFunctions.getLastChar("Java"));
    }

}
