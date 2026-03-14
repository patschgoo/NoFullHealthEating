# NoFullHealthEating

A simple **Minecraft Beta 1.7.3** Bukkit plugin that prevents players from eating food to heal when they are already at full health.

## 📦 Files
- `src/main/java/com/patschgo/nofullheal/NoFullHealthEatingPlugin.java` - Plugin implementation.
- `src/main/resources/plugin.yml` - Bukkit plugin descriptor.
- `pom.xml` - Maven build configuration.

## 🛠️ Build (Maven)
This plugin is designed to compile against the Bukkit API in your **Project-Poseidon** (custom CraftBukkit 1.0.60) runtime. The build does **not** include the CraftBukkit jar in the repository.

1. Ensure your build environment can resolve a CraftBukkit/Poseidon artifact (e.g. from a Maven repo) for the coordinates below:

```xml
<dependency>
  <groupId>org.bukkit</groupId>
  <artifactId>craftbukkit</artifactId>
  <version>1.0.60-R1.0</version>
  <scope>provided</scope>
</dependency>
```

2. Build with Maven:

```bash
mvn clean package
```

✅ Output: `target/NoFullHealthEating.jar`

> If you need to use a custom Maven repository for @retromcorg/Project-Poseidon, add it under `<repositories>` in `pom.xml` and adjust the dependency coordinates accordingly.

## 🚀 Installation
1. Drop `target/NoFullHealthEating.jar` into your server's `plugins/` folder.
2. Start the server.

## ✅ Behavior
When a player attempts to eat an item (food/potion), the plugin checks if the player's current health is already at maximum. If it is, the eating action is canceled and the player is notified.
