package $name;format="normalize"$

import cpw.mods.fml.common.network.NetworkMod
import cpw.mods.fml.common.Mod.{PostInit, Init, PreInit}
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLInitializationEvent, FMLPreInitializationEvent}

import net.minecraftforge.common.Configuration

@Mod(modid="$name;format="normalize"$", name="$name;format="capitalize"$", version="0.0.1", modLanguage = "scala")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
object $mainclass$ {
        
        
   @EventHandler 
   def preInit(event: FMLPreInitializationEvent) {

   }
        
   @EventHandler
   def load(event: FMLInitializationEvent) {

   }
        
   @EventHandler 
   def postInit(event:FMLPostInitializationEvent) {
                
   }
}
