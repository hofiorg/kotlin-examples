// https://play.kotlinlang.org/koans/Introduction/Lambdas/Task.kt

package koans

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }