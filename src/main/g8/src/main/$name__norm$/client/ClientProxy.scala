package  $name;format="lower,snake"$.client

import net.minecraftforge.client.MinecraftForgeClient
import $name;format="lower,snake"$.CommonProxy
import net.minecraft.client.Minecraft


class ClientProxy extends CommonProxy {
        
	override def getLogger = Minecraft.getMinecraft().getLogAgent()
        
        override def registerRenderers() {
                // This is for rendering entities and so forth later on

        }
}
