package $name;format="lower,snake"$

import net.minecraft.client.Minecraft
import net.minecraft.server.MinecraftServer

class CommonProxy {

  // Client stuff
  def registerRenderers() {
                // Nothing here as the server doesn't render graphics or entities!
  }
  
  def getLogger = MinecraftServer.getServer().getLogAgent()
  
}
