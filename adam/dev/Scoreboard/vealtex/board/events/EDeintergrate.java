package adam.dev.Scoreboard.vealtex.board.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import adam.dev.Scoreboard.vealtex.Main;
import adam.dev.Scoreboard.vealtex.board.App;
import adam.dev.Scoreboard.vealtex.board.ScoreboardHolder;

/**
 * Created by Adam on 03-08-2020
 */
public class EDeintergrate implements Listener {

    private App app;

    public EDeintergrate(App app)
    {
        this.app = app;
    }

    @EventHandler
    public void Deintergrate(PlayerQuitEvent e)
    {
        if(app == null) return;
        app.unregisterHolder(e.getPlayer());
        e.getPlayer().setScoreboard(Main.empty);
    }

}
