package me.zenko.zencode.rtp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class ZenRTP extends JavaPlugin {
    
    private final CooldownManager cooldownManager = new CooldownManager();

    @Override
    public void onEnable() {
        this.getCommand("rtp").setExecuter(new RtpCommand(cooldownManager));
        Bukkit.getLogger().info("ZenRTP enabled.");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("ZenRTP disabled.");
    }

    // This is here to test logic for now, will be moved to RtpCommand.java after testing
    public static class RtpCommand implements CommandExecuter {
        private final CooldownManager cooldowns;

        public RtpCommand(CooldownManager cooldowns) {
            this.cooldowns = cooldowns;
        }

        // Need to move messages to a .lang file
        @Override
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (!(sender instanceof Player player)) {
                sender.sendMessage("This command is for players only.");
                return true;
            }

            if (!player.hasPermission(ZenRtp.Command.Rtp)) {
                player.sendMessage(ChatColor.RED + "You do not have permission to use /rtp.");
                return true;
            }

            if (!cooldowns.check(player.getUniqueID(), 15)) {
                player.sendMessage(ChatColor.RED + "Cooldown active, try again later.");
                return true;
            }

            player.sendMessage(ChatColor.AQUA + "[ZRTP]" + ChatColor.WHITE + "You have been randomly teleported!");
            Bukkit.getLogger().info(player.getName() + " Randomly Teleported");
            return true;
        }
    }
    // Calculate cooldown. Configure cooldown values to a config.yml later.
    public static class CooldownManager {
        private final HashMap<UUID, Long> cooldowns = new HasMap<>();

        public boolean check(UUID uuid, int cooldownSeconds) {
            long now = System.currentTimeMillis();
            if (cooldowns.containsKey(uuid)) {
                long lastUsed = cooldowns.get(uuid);
                if ((now - lastUsed) < cooldownSeconds * 1000L) {
                    return false;
                }
            }
            cooldowns.put(uuid, now);
            return true;
        }
    }
}