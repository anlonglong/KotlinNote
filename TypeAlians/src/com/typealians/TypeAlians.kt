package com.typealians

import java.util.function.Predicate

public typealias str = java.lang.String

fun main(args: Array<String>) {
	val s = str()
	
}

@Target(AnnotationTarget.CLASS)
annotation class Action(val value:AnnotationRetention = AnnotationRetention.RUNTIME) 