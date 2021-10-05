package eu.timerertim.knevo.neat.config

object Defaults {

    internal const val INPUTS = 2
    internal const val OUTPUTS = 1
    internal const val HIDDEN_NODES = 1000000
    internal const val POPULATION = 300
    internal const val BATCH_SIZE = 100

    const val COMPATIBILITY_THRESHOLD = 1f
    const val EXCESS_COEFFICENT = 2f
    const val DISJOINT_COEFFICENT = 2f
    const val WEIGHT_COEFFICENT = 0.4f

    const val STALE_SPECIES = 15f

    const val STEPS = 0.1f
    const val PERTURB_CHANCE = 0.9f
    const val WEIGHT_CHANCE = 0.3f
    const val WEIGHT_MUTATION_CHANCE = 0.9f
    const val NODE_MUTATION_CHANCE = 0.03f
    const val CONNECTION_MUTATION_CHANCE = 0.15f
    const val BIAS_CONNECTION_MUTATION_CHANCE = 0.25f
    const val DISABLE_MUTATION_CHANCE = 0.1f
    const val ENABLE_MUTATION_CHANCE = 0.2f
    const val CROSSOVER_CHANCE = 0.75f

    const val STALE_POOL = 20
}

