package tk.nekotech.featureblock.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tk.nekotech.featureblock.FeatureBlock;

public class FeatureBlockCommand implements CommandExecutor {
    private final FeatureBlock fb;

    public FeatureBlockCommand(final FeatureBlock fb) {
        this.fb = fb;
    }

    @Override
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        this.fb.reloadConfig();
        sender.sendMessage(ChatColor.RED + "Reloaded FeatureBlock configuration.");
        return true;
    }
}
