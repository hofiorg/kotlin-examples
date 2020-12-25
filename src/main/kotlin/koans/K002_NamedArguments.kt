// https://play.kotlinlang.org/koans/Introduction/Named%20arguments/Task.kt

package koans

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")