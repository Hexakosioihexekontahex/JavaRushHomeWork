package com.kotlin.draft.chapter06.p3.javaInterfaceImplementation;

import java.io.File;
import java.util.List;

public interface FileContentProcessor {
    void processContents(File path,
                         byte[] binaryContents,
                         List<String> testContents);
}
