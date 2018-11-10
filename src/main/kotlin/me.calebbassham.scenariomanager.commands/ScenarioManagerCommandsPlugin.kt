package me.calebbassham.scenariomanager.commands

import me.calebbassham.scenariomanager.api.scenarioManager
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ScenarioManagerCommandsPlugin : JavaPlugin() {

    override fun onEnable() {
        Bukkit.getPluginCommand("scenariomanager").apply {
            val cmd = ScenarioManagerCmd(scenarioManager, logger)
            executor = cmd
            tabCompleter = cmd
        }
    }

}