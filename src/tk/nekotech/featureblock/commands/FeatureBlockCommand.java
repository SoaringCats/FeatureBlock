package tk.nekotech.featureblock.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tk.nekotech.featureblock.FeatureBlock;

public class FeatureBlockCommand implements CommandExecutor {
    private FeatureBlock fb;

    public FeatureBlockCommand(FeatureBlock fb) {
        this.fb = fb;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        fb.reloadConfig();
        sender.sendMessage(ChatColor.RED + "Reloaded FeatureBlock configuration.");
        return true;
    }
}
