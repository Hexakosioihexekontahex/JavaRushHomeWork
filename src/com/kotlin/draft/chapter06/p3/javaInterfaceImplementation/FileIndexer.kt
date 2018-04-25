package com.kotlin.draft.chapter06.p3.javaInterfaceImplementation

import java.io.File

class FileIndexer : FileContentProcessor {
    override fun processContents(path: File,
                                 binaryContents: ByteArray?,
                                 testContents: MutableList<String>?) {
        // ...
    }
}