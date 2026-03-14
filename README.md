# NoFullHealthEating

A simple **Minecraft Beta 1.7.3** Bukkit plugin that prevents players from eating food to heal when they are already at full health.


## 🛠️ Compiling
---------
Showcase uses Maven to handle its dependencies.

* Install [Maven 2 or 3](http://maven.apache.org/download.html)  
* Checkout this repo and run:
```bash
`mvn clean`
```

✅ Output: `target/NoFullHealthEating.jar`

## 🚀 Installation
1. Drop `target/NoFullHealthEating.jar` into your server's `plugins/` folder.
2. Start the server.

## ✅ Behavior
When a player right-clicks with food (apple, bread, mushroom stew, raw/cooked porkchop), the plugin checks if the player's health is already full (20). If it is, the action is canceled and the player is notified.
