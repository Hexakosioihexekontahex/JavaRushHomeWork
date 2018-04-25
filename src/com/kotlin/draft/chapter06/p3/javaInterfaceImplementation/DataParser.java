package com.kotlin.draft.chapter06.p3.javaInterfaceImplementation;

import java.util.List;

public interface DataParser<T> {
    void parseData(String input,
                   List<T> output,
                   List<String> errors);
}
