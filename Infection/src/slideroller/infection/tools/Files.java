package slideroller.infection.tools;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;




import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import slideroller.infection.main.Main;


public class Files {


        // Set up all the needed things for files
        public static YamlConfiguration abilities = null;
        public static File abilitiesFile = null;
        public static YamlConfiguration killT = null;
        public static File killTFile = null;
        public static YamlConfiguration classes = null;
        public static File classesFile = null;
        public static YamlConfiguration arenas = null;
        public static File arenasFile = null;
        public static YamlConfiguration playerF = null;
        public static File playerFile = null;
        public static YamlConfiguration messages = null;
        public static File messagesFile = null;
        public static YamlConfiguration shop = null;
        public static File shopFile = null;
        public static YamlConfiguration grenades = null;
        public static File grenadesFile = null;
        public static YamlConfiguration signs = null;
        public static File signsFile = null;

        
        
        public static FileConfiguration getConfig(){
                return ((Plugin) Main.me).getConfig();
        }
        public static void saveConfig(){
                ((Plugin) Main.me).saveConfig();
        }
        public static void reloadConfig(){
                ((Plugin) Main.me).reloadConfig();
        }
        // Reload the Kills File (need to try)
        public static void reloadKills() {
                if (killTFile == null)
                        killTFile = new File(Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),"Kills.yml");
                
                killT = YamlConfiguration.loadConfiguration(killTFile);
                // Look's for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Kills.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                                killT.setDefaults(defConfig);
                }
        }

        // Get Kills file (working)
        public static FileConfiguration getKills() {
                if (killT == null)
                        reloadKills();
                return killT;
        }

        // Safe Kills File (woking)
        public static void saveKills() {
                if (killT == null || killTFile == null)
                        return;
                try
                {
                        getKills().save(killTFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + killTFile, ex);
                }
        }

        // ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Reload Abilities File
        public static void reloadAbilities() {
                if (abilitiesFile == null)
                        abilitiesFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Abilities.yml");
                abilities = YamlConfiguration.loadConfiguration(abilitiesFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Abilities.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                        if(!abilitiesFile.exists())
                                abilities.setDefaults(defConfig);
                }
        }

        // Get Abilities file
        public static FileConfiguration getAbilities() {
                if (abilities == null)
                        reloadAbilities();
                return abilities;
        }

        // Safe Abilities File
        public static void saveAbilities() {
                if (abilities == null || abilitiesFile == null)
                        return;
                try
                {
                        getAbilities().save(abilitiesFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + abilitiesFile, ex);
                }
        }

        // ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Reload Abilities File
        public static void reloadClasses() {
                if (classesFile == null)
                        classesFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Classes.yml");
                classes = YamlConfiguration.loadConfiguration(classesFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Classes.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                        if(!classesFile.exists())
                                classes.setDefaults(defConfig);
                }
        }

        // Get Abilities file
        public static FileConfiguration getClasses() {
                if (classes == null)
                        reloadClasses();
                return classes;
        }

        // Safe Abilities File
        public static void saveClasses() {
                if (classes == null || classesFile == null)
                        return;
                try
                {
                        getClasses().save(classesFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + classesFile, ex);
                }
        }

        // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Reload Arenas File
        public static void reloadArenas() {
                if (arenasFile == null)
                        arenasFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Arenas.yml");
                arenas = YamlConfiguration.loadConfiguration(arenasFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Arenas.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                        if(!arenasFile.exists())
                                arenas.setDefaults(defConfig);
                }
        }

        // Get Arenas File
        public static FileConfiguration getArenas() {
                if (arenas == null)
                        reloadArenas();
                return arenas;
        }

        // Safe Arenas File
        public static void saveArenas() {
                if (arenas == null || arenasFile == null)
                        return;
                try
                {
                        getArenas().save(arenasFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + arenasFile, ex);
                }
        }

        // Reload Arenas File
        public static void reloadGrenades() {
                if (grenades == null)
                        grenadesFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Grenades.yml");
                grenades = YamlConfiguration.loadConfiguration(grenadesFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Grenades.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                        if(!grenadesFile.exists())
                                grenades.setDefaults(defConfig);
                }
        }

        // Get Arenas File
        public static FileConfiguration getGrenades() {
                if (grenades == null)
                        reloadGrenades();
                return grenades;
        }

        // Safe Arenas File
        public static void saveGrenades() {
                if (grenades == null || grenadesFile == null)
                        return;
                try
                {
                        getGrenades().save(grenadesFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + grenadesFile, ex);
                }
        }
        
        //////////////////////////////////////////////////////////////////////////////////////   SHOP

        // Reload Arenas File
        public static void reloadShop() {
                if (shop == null)
                        shopFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Shop.yml");
                shop = YamlConfiguration.loadConfiguration(shopFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Shop.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                        if(!shopFile.exists())
                                shop.setDefaults(defConfig);
                }
        }

        // Get Arenas File
        public static FileConfiguration getShop() {
                if (shop == null)
                        reloadShop();
                return shop;
        }

        // Safe Arenas File
        public static void saveShop() {
                if (shop == null || shopFile == null)
                        return;
                try
                {
                        getShop().save(shopFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + shopFile, ex);
                }
        }

        
        ////////////////////////////////////////////////////////////////////////////////    MESSAGES
        
        // Reload Arenas File
        public static void reloadMessages() {
                if (messages == null)
                        messagesFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Messages.yml");
                messages = YamlConfiguration.loadConfiguration(messagesFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Messages.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                                messages.setDefaults(defConfig);
                }
        }

        // Get Arenas File
        public static FileConfiguration getMessages() {
                if (messages == null)
                        reloadMessages();
                return messages;
        }

        // Safe Arenas File
        public static void saveMessages() {
                if (messages == null || messagesFile == null)
                        return;
                try
                {
                        getMessages().save(messagesFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + messagesFile, ex);
                }
        }
        //======================================================================================  PLAYERS

        // Reload Kills File
        public static void reloadPlayers() {
                if (playerFile == null)
                        playerFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Players.yml");
                playerF = YamlConfiguration.loadConfiguration(playerFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Players.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                        if(!playerFile.exists())
                                playerF.setDefaults(defConfig);
                }
        }

        // Get Kills file
        public static FileConfiguration getPlayers() {
                if (playerF == null)
                {
                        reloadPlayers();
                        savePlayers();
                }
                return playerF;
        }

        // Save Kills File
        public static void savePlayers() {
                if (playerF == null || playerFile == null)
                        return;
                try
                {
                        getPlayers().save(playerFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + playerFile, ex);
                }
        }
        
        
        //================================================================================       Signs
        

        // Reload Kills File
        public static void reloadSigns() {
                if (signsFile == null)
                        signsFile = new File(
                                        Bukkit.getPluginManager().getPlugin("Infection").getDataFolder(),
                                        "Signs.yml");
                signs = YamlConfiguration.loadConfiguration(signsFile);
                // Look for defaults in the jar
                InputStream defConfigStream = Bukkit.getPluginManager().getPlugin("Infection").getResource("Signs.yml");
                if (defConfigStream != null)
                {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                        if(!signsFile.exists())
                                signs.setDefaults(defConfig);
                }
        }

        // Get Kills file
        public static FileConfiguration getSigns() {
                if (signs == null)
                {
                        reloadSigns();
                        saveSigns();
                }
                return signs;
        }

        // Save Kills File
        public static void saveSigns() {
                if (signs == null || signsFile == null)
                        return;
                try
                {
                        getSigns().save(signsFile);
                } catch (IOException ex)
                {
                        Bukkit.getLogger().log(Level.SEVERE, "Could not save config " + signsFile, ex);
                }
        }
}
