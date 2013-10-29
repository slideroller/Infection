package slideroller.infection.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Infection extends JavaPlugin{

     public static Infection getInfection(){
    	 return (Infection)Bukkit.getPluginManager().getPlugin("Infection");
     }

}