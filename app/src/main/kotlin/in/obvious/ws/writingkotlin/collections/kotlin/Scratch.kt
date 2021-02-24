package `in`.obvious.ws.writingkotlin.collections.kotlin

import android.util.Log

fun scratch() {
    val mutants = listOf(
        Mutant("Professor X", "Charles Xavier", Alignment.Good, 40, Rank.Leader),
        Mutant("Magneto", "Erik Lehnsherr", Alignment.Evil, 40, Rank.Leader),
        Mutant("Wolverine", "James Howlett", Alignment.Good, 50, Rank.Senior),
        Mutant("Jean Grey", "Jean Grey", Alignment.Good, 15, Rank.Senior),
        Mutant("Shadowcat", "Kitty Pryde", Alignment.Good, 5, Rank.Junior),
        Mutant("Cyclops", "Scott Summers", Alignment.Good, 16, Rank.Senior),
        Mutant("Scarlet Witch", "Wanda Maximoff", Alignment.Evil, 5, Rank.Senior),
        Mutant("Mystique", "Raven Darkholme", Alignment.Evil, 10, Rank.Senior),
        Mutant("Pyro", "John Allerdyce", Alignment.Evil, 5, Rank.Junior)
    )

    // Iteration (`forEach`)
    // Print the names of all mutants in "<Real name> (Code name)" format
    for (mutant in mutants) {
        val name = "${mutant.actualName} (${mutant.codeName})"
        Log.d("X-Men", name)
    }

    // Transformation (`map`)
    // Print the total days of experience of each mutant in "<Code name> - <days>" format
    for (mutant in mutants) {
        val daysOfExperience = mutant.yearsOfExperience * 365
        Log.d("X-Men", "${mutant.codeName} - $daysOfExperience")
    }

    // Filtering (`filter`)
    // Find all the junior mutants and separate them into good and evil lists
    val goodMutants = ArrayList<Mutant>()
    val evilMutants = ArrayList<Mutant>()

    for (mutant in mutants) {
        if (mutant.alignment == Alignment.Good) {
            goodMutants.add(mutant)
        } else {
            evilMutants.add(mutant)
        }
    }

    // Grouping (`associate`)
    // Group all mutants by rank
    val mutantsByRank = HashMap<Rank, ArrayList<Mutant>>()
    mutantsByRank[Rank.Leader] = ArrayList()
    mutantsByRank[Rank.Junior] = ArrayList()
    mutantsByRank[Rank.Senior] = ArrayList()

    for (mutant in mutants) {
        mutantsByRank[mutant.rank]!!.add(mutant)
    }

    // Complex operations
    // Find the cumulative days of experience of all the good mutants
    val totalDaysOfExperience = mutants
        .filter { it.alignment == Alignment.Good }
        .map { it.yearsOfExperience }
        .map { it * 365 }
        .sum()
}
