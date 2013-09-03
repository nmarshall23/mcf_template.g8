mcf_template.g8
===============

A giter8 template for writing a Minecraft Forge Template.

Requires scala version 2.11.0+

Usage
-----

You will need to install n8han's conscript and giter8 [giter8](https://github.com/n8han/giter8#readme) tools.

Once you have done that, it's very easy to create a new Minecraft Forge Project.

	g8 nmarshall23/mcf_template.g8

Answer the questions, and your mod's scaffolding is ready.

Recommend Separate Game dir
---------------------------

In the minecraft launcher, add a new profile with a custom game directory. 
Then in the project.propertices file. Change the minecraft.data.dir property, to the game directory you set in the launcher. 

Building your Mod
-----------------

Currently this template uses Ant to build the mod. The default target will setup the build environment, then compile, reobfuscate, and package your mod in bin/

However if you would like your mod automaticly copied to your minecraft game directory / mods use this command:

	ant installmod

That copies the jar to the game directory you set in the project.property.

Bugs??
------

I have done no testing of this on Windows or OSX. If you use those platforms please let me know if the build process works. You must have a very recent version of scala installed, 2.11.0. 


Credit
------

Let me give some credit to Buildcraft team for their Ant build script. It take care of the hard work, of downloading MCP, setting up forge, and auto decompiles minecraft.  See BuildCraft's repo, https://github.com/BuildCraft/BuildCraft
