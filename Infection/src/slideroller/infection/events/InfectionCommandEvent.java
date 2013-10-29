package slideroller.infection.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class InfectionCommandEvent extends Event implements Cancellable{

        boolean cancelled = false;
        CommandSender sender;
        String[] args;

        public InfectionCommandEvent(CommandSender sender, String[] args)
        {
                this.sender = sender;
                this.args = args;
        }

        public CommandSender getSender() {
                return sender;
        }
        public String[] getArgs() {
                return args;
        }

        private static final HandlerList handlers = new HandlerList();

        public HandlerList getHandlers() {
                return handlers;
        }

        public static HandlerList getHandlerList() {
                return handlers;
        }
        public boolean isCancelled() {
                return cancelled;
        }

        public void setCancelled(boolean cancel) {
                cancelled = cancel;
        }
}
