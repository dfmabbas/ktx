package com.github.oky2abbas.nExt.thirdParty.gson

import com.github.oky2abbas.nExt.builder.NExt
import com.google.gson.reflect.TypeToken

fun Any.toJson(): String {
    return NExt.gSon.toJson(this)
}

fun <T> Any.toObject(clazz: Class<T>): T {
    return NExt.gSon.fromJson(this.toString(), clazz)
}

fun <T> Any.toAnyObject(clazz: Class<T>): T {
    return NExt.gSon.toJson(this).toObject(clazz)
}

fun <T> Any.toArrayObject(clazz: Class<T>): List<T> {
    val typeOfT = TypeToken.getParameterized(List::class.java, clazz).type
    return NExt.gSon.fromJson(this.toString(), typeOfT)
}

fun <T> Any.toAnyArrayObject(clazz: Class<T>): List<T> {
    return NExt.gSon.toJson(this).toArrayObject(clazz)
}