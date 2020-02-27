package main.domain

interface GwentView {
    fun getPlayerss(): List<Player>
    fun getGame(): Game
    fun getWinner(game: Game): Player?
    fun getStartingPlayer(game: Game)
}

interface GwentInteract {
    fun getHand(player: Player)
    fun playCard(player: Player)
    fun chooseAlignment(player: Player)
    fun pass(player: Player)
}

interface GwentSetup {
    fun createPlayer(): Player
    fun setupGame(): Game
}

interface Gwent : GwentView, GwentInteract, GwentSetup