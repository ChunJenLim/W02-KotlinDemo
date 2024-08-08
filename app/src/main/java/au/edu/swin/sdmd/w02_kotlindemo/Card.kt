package au.edu.swin.sdmd.w02_kotlindemo

class Card(private val rank: String, private val suit: String, private var flip: Boolean = true) {

    fun flip() {
        flip = !flip
    }

    fun printDetails() {
        if (flip) {
            println("$rank of $suit")
        } else {
            println("----")
        }
    }
}