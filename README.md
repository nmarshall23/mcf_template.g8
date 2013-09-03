mcf_template.g8
===============

A giter8 template for writing a Minecraft Forge Template.

Usage
-----

You will need to install n8han's conscript and giter8 [giter8](https://github.com/n8han/giter8#readme) tools.

Once you have done that, it's very easy to create a new Minecraft Forge Project.

	g8 nmarshall23/mcf_template.g8

Answer some questions, and your mod's scaffolding is ready.

If you like to keep your mod development separate from your stable game. In the minecraft launcher, set a custom game directory, you can set that in the project.propertices file. Change the minecraft.data.dir property, to the game directory you set in the launcher. 

One last thing, even though this template is for writing mod's in scala, currently it uses Ant to build the mod's jar. 

The default target will compile and build your jar in project/bin.

However if you would like your mod installed in your minecraft game directory / mods use this command:

	ant installmod


Bugs??
------

I have done no testing of this on Windows or OSX. If you use those platforms please the build process. 


Credit
------

Let me give some credit to Buildcraft team for their Ant build script. It take care of the hard work, of downloading MCP, setting up forge, and auto decompiles minecraft.  See BuildCraft's repo, https://github.com/BuildCraft/BuildCraft
