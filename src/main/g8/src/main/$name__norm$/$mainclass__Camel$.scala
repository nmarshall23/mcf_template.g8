package $name;format="lower,snake"$

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent

import cpw.mods.fml.common.network.NetworkMod
import net.minecraftforge.common.Configuration

@Mod(modid="$name;format="normalize"$", name="$name;format="capitalize"$", version="0.0.1", modLanguage = "scala")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
object $mainclass$ {
        

   @SidedProxy(clientSide="$name;format="lower,snake"$.client.ClientProxy", serverSide="$name;format="lower,snake"$.CommonProxy")
   var proxy:CommonProxy = null;
 
   @EventHandler
   def preInit(event: FMLPreInitializationEvent) {

   }
        
   @EventHandler
   def init(event: FMLInitializationEvent) {

   }
        
   @EventHandler
   def postInit(event:FMLPostInitializationEvent) {
                
   }
}
