interface SkillInterface {

    val name: String
    val rank: Int
    val level: Int
    val xp: Int

    fun skillInfo() {
        println("Skill: " + name)
        println("Rank: " + rank)
        println("Level: " + level)
        println("XP: " + xp )
    }
}