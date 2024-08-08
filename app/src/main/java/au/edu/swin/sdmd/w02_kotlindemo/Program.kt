package au.edu.swin.sdmd.w02_kotlindemo

fun main() {
    val card = Card("ACE", "HEARTS")
    card.printDetails()
    card.flip()
    card.printDetails()
}