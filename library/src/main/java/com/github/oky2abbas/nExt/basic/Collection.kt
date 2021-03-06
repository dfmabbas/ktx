package com.github.oky2abbas.nExt.basic


fun <T> Collection<T>.logListE(tag: String = "") {
    this.forEach {
        it?.logE(tag)
    }
}

fun <T> Array<T>.logArrayE(tag: String = "") {
    this.forEach {
        it?.logE(tag)
    }
}

fun <K, V> Map<*, *>.logMapE(tag: String = "") {
    this.forEach {
        this.logE("$tag${it.key}: ${it.value}")
    }
}

