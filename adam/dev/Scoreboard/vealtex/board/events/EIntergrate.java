package adam.dev.Scoreboard.vealtex.board.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import adam.dev.Scoreboard.vealtex.Session;
import adam.dev.Scoreboard.vealtex.board.App;
import adam.dev.Scoreboard.vealtex.board.ScoreboardHolder;
import adam.dev.Scoreboard.vealtex.util.Func;

/**
 * Created by Adam on 03-08-2020
 */
public class EIntergrate implements Listener {

    private App app;

    public EIntergrate(App app)
    {
        this.app = app;
    }

    @EventHandler
    public void Intergrate(PlayerJoinEvent e)
    {

        if(app == null || !app.isdefault) return;
        if(e.getPlayer().isOp() && !Session.isuptodate)
            e.getPlayer().sendMessage(Func.color("&cYou are running an outdated version of Scoreboard, please update as soon as possible for performance gain, security- or bugfixes."));
        new ScoreboardHolder(app, e.getPlayer());
    }

}
